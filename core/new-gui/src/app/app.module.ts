import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { environment } from './../environments/environment';

import { CustomNgMaterialModule } from './common/custom-ng-material.module';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { RouterModule } from '@angular/router';
import { TourNgBootstrapModule } from 'ngx-tour-ng-bootstrap';
import { LoggerModule, NgxLoggerLevel } from 'ngx-logger';

import { MaterialDesignFrameworkModule } from 'angular6-json-schema-form';
import { NgxJsonViewerModule } from 'ngx-json-viewer';

import { AppComponent } from './app.component';
import { WorkspaceComponent } from './workspace/component/workspace.component';
import { NavigationComponent } from './workspace/component/navigation/navigation.component';
import { OperatorPanelComponent } from './workspace/component/operator-panel/operator-panel.component';
import { PropertyEditorComponent } from './workspace/component/property-editor/property-editor.component';
import { WorkflowEditorComponent, NgbModalPausedComponent } from './workspace/component/workflow-editor/workflow-editor.component';
import { ResultPanelComponent, NgbModalComponent } from './workspace/component/result-panel/result-panel.component';
import { OperatorLabelComponent } from './workspace/component/operator-panel/operator-label/operator-label.component';
import { ProductTourComponent } from './workspace/component/product-tour/product-tour.component';
import { ResultPanelToggleComponent } from './workspace/component/result-panel-toggle/result-panel-toggle.component';

@NgModule({
  declarations: [
    AppComponent,
    WorkspaceComponent,
    NavigationComponent,
    OperatorPanelComponent,
    PropertyEditorComponent,
    WorkflowEditorComponent,
    ResultPanelComponent,
    NgbModalComponent,
    OperatorLabelComponent,
    ProductTourComponent,
    ResultPanelToggleComponent,
    NgbModalPausedComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,

    NgxJsonViewerModule,
    CustomNgMaterialModule,
    BrowserAnimationsModule,
    NgbModule.forRoot(),
    RouterModule.forRoot([]),
    TourNgBootstrapModule.forRoot(),
    LoggerModule.forRoot({level: environment.production ? NgxLoggerLevel.ERROR : NgxLoggerLevel.DEBUG, serverLogLevel: NgxLoggerLevel.OFF}),
    MaterialDesignFrameworkModule

  ],
  providers: [ HttpClientModule ],
  bootstrap: [AppComponent],
  // dynamically created component must be placed in the entryComponents attribute
  entryComponents: [ NgbModalComponent, NgbModalPausedComponent ]
})
export class AppModule { }
