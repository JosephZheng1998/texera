/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.web.resource.generated;


import edu.uci.ics.texera.web.resource.generated.tables.Dictownship;
import edu.uci.ics.texera.web.resource.generated.tables.Fileownship;
import edu.uci.ics.texera.web.resource.generated.tables.Useraccount;
import edu.uci.ics.texera.web.resource.generated.tables.Userdict;
import edu.uci.ics.texera.web.resource.generated.tables.Userfile;

import javax.annotation.processing.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.Internal;


/**
 * A class modelling indexes of tables of the <code>texera</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index DICTOWNSHIP_DICTID = Indexes0.DICTOWNSHIP_DICTID;
    public static final Index DICTOWNSHIP_PRIMARY = Indexes0.DICTOWNSHIP_PRIMARY;
    public static final Index DICTOWNSHIP_USERID = Indexes0.DICTOWNSHIP_USERID;
    public static final Index FILEOWNSHIP_FILEID = Indexes0.FILEOWNSHIP_FILEID;
    public static final Index FILEOWNSHIP_PRIMARY = Indexes0.FILEOWNSHIP_PRIMARY;
    public static final Index FILEOWNSHIP_USERID = Indexes0.FILEOWNSHIP_USERID;
    public static final Index USERACCOUNT_PRIMARY = Indexes0.USERACCOUNT_PRIMARY;
    public static final Index USERACCOUNT_USERNAME = Indexes0.USERACCOUNT_USERNAME;
    public static final Index USERACCOUNT_USERNAME_2 = Indexes0.USERACCOUNT_USERNAME_2;
    public static final Index USERDICT_DICTID = Indexes0.USERDICT_DICTID;
    public static final Index USERDICT_PRIMARY = Indexes0.USERDICT_PRIMARY;
    public static final Index USERFILE_FILEID = Indexes0.USERFILE_FILEID;
    public static final Index USERFILE_PRIMARY = Indexes0.USERFILE_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 {
        public static Index DICTOWNSHIP_DICTID = Internal.createIndex("dictID", Dictownship.DICTOWNSHIP, new OrderField[] { Dictownship.DICTOWNSHIP.DICTID }, false);
        public static Index DICTOWNSHIP_PRIMARY = Internal.createIndex("PRIMARY", Dictownship.DICTOWNSHIP, new OrderField[] { Dictownship.DICTOWNSHIP.USERID, Dictownship.DICTOWNSHIP.DICTID }, true);
        public static Index DICTOWNSHIP_USERID = Internal.createIndex("userID", Dictownship.DICTOWNSHIP, new OrderField[] { Dictownship.DICTOWNSHIP.USERID, Dictownship.DICTOWNSHIP.DICTID }, false);
        public static Index FILEOWNSHIP_FILEID = Internal.createIndex("fileID", Fileownship.FILEOWNSHIP, new OrderField[] { Fileownship.FILEOWNSHIP.FILEID }, false);
        public static Index FILEOWNSHIP_PRIMARY = Internal.createIndex("PRIMARY", Fileownship.FILEOWNSHIP, new OrderField[] { Fileownship.FILEOWNSHIP.USERID, Fileownship.FILEOWNSHIP.FILEID }, true);
        public static Index FILEOWNSHIP_USERID = Internal.createIndex("userID", Fileownship.FILEOWNSHIP, new OrderField[] { Fileownship.FILEOWNSHIP.USERID, Fileownship.FILEOWNSHIP.FILEID }, false);
        public static Index USERACCOUNT_PRIMARY = Internal.createIndex("PRIMARY", Useraccount.USERACCOUNT, new OrderField[] { Useraccount.USERACCOUNT.USERID }, true);
        public static Index USERACCOUNT_USERNAME = Internal.createIndex("userName", Useraccount.USERACCOUNT, new OrderField[] { Useraccount.USERACCOUNT.USERNAME }, true);
        public static Index USERACCOUNT_USERNAME_2 = Internal.createIndex("userName_2", Useraccount.USERACCOUNT, new OrderField[] { Useraccount.USERACCOUNT.USERNAME, Useraccount.USERACCOUNT.USERID }, false);
        public static Index USERDICT_DICTID = Internal.createIndex("dictID", Userdict.USERDICT, new OrderField[] { Userdict.USERDICT.DICTID }, false);
        public static Index USERDICT_PRIMARY = Internal.createIndex("PRIMARY", Userdict.USERDICT, new OrderField[] { Userdict.USERDICT.DICTID }, true);
        public static Index USERFILE_FILEID = Internal.createIndex("fileID", Userfile.USERFILE, new OrderField[] { Userfile.USERFILE.FILEID }, false);
        public static Index USERFILE_PRIMARY = Internal.createIndex("PRIMARY", Userfile.USERFILE, new OrderField[] { Userfile.USERFILE.FILEID }, true);
    }
}
