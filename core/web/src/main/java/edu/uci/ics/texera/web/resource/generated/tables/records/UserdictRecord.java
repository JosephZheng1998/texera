/*
 * This file is generated by jOOQ.
 */
package edu.uci.ics.texera.web.resource.generated.tables.records;


import edu.uci.ics.texera.web.resource.generated.tables.Userdict;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserdictRecord extends UpdatableRecordImpl<UserdictRecord> implements Record3<Integer, String, byte[]> {

    private static final long serialVersionUID = 1888452798;

    /**
     * Setter for <code>texera.userdict.dictID</code>.
     */
    public void setDictid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>texera.userdict.dictID</code>.
     */
    public Integer getDictid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>texera.userdict.dictName</code>.
     */
    public void setDictname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>texera.userdict.dictName</code>.
     */
    public String getDictname() {
        return (String) get(1);
    }

    /**
     * Setter for <code>texera.userdict.dictContent</code>.
     */
    public void setDictcontent(byte... value) {
        set(2, value);
    }

    /**
     * Getter for <code>texera.userdict.dictContent</code>.
     */
    public byte[] getDictcontent() {
        return (byte[]) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, byte[]> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Userdict.USERDICT.DICTID;
    }

    @Override
    public Field<String> field2() {
        return Userdict.USERDICT.DICTNAME;
    }

    @Override
    public Field<byte[]> field3() {
        return Userdict.USERDICT.DICTCONTENT;
    }

    @Override
    public Integer component1() {
        return getDictid();
    }

    @Override
    public String component2() {
        return getDictname();
    }

    @Override
    public byte[] component3() {
        return getDictcontent();
    }

    @Override
    public Integer value1() {
        return getDictid();
    }

    @Override
    public String value2() {
        return getDictname();
    }

    @Override
    public byte[] value3() {
        return getDictcontent();
    }

    @Override
    public UserdictRecord value1(Integer value) {
        setDictid(value);
        return this;
    }

    @Override
    public UserdictRecord value2(String value) {
        setDictname(value);
        return this;
    }

    @Override
    public UserdictRecord value3(byte... value) {
        setDictcontent(value);
        return this;
    }

    @Override
    public UserdictRecord values(Integer value1, String value2, byte[] value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserdictRecord
     */
    public UserdictRecord() {
        super(Userdict.USERDICT);
    }

    /**
     * Create a detached, initialised UserdictRecord
     */
    public UserdictRecord(Integer dictid, String dictname, byte[] dictcontent) {
        super(Userdict.USERDICT);

        set(0, dictid);
        set(1, dictname);
        set(2, dictcontent);
    }
}
