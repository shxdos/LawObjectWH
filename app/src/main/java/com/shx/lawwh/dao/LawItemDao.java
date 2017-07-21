package com.shx.lawwh.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LAW_ITEM".
*/
public class LawItemDao extends AbstractDao<LawItem, Long> {

    public static final String TABLENAME = "LAW_ITEM";

    /**
     * Properties of entity LawItem.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Law_name = new Property(1, String.class, "law_name", false, "LAW_NAME");
        public final static Property Issue_no = new Property(2, String.class, "issue_no", false, "ISSUE_NO");
        public final static Property Level = new Property(3, String.class, "level", false, "LEVEL");
        public final static Property Type_name = new Property(4, String.class, "type_name", false, "TYPE_NAME");
        public final static Property Type_code = new Property(5, String.class, "type_code", false, "TYPE_CODE");
        public final static Property File_path = new Property(6, String.class, "file_path", false, "FILE_PATH");
        public final static Property Status = new Property(7, String.class, "status", false, "STATUS");
        public final static Property Create_time = new Property(8, java.util.Date.class, "create_time", false, "CREATE_TIME");
        public final static Property Update_time = new Property(9, String.class, "update_time", false, "UPDATE_TIME");
        public final static Property Description = new Property(10, String.class, "description", false, "DESCRIPTION");
    }


    public LawItemDao(DaoConfig config) {
        super(config);
    }
    
    public LawItemDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LAW_ITEM\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"LAW_NAME\" TEXT," + // 1: law_name
                "\"ISSUE_NO\" TEXT," + // 2: issue_no
                "\"LEVEL\" TEXT," + // 3: level
                "\"TYPE_NAME\" TEXT," + // 4: type_name
                "\"TYPE_CODE\" TEXT," + // 5: type_code
                "\"FILE_PATH\" TEXT," + // 6: file_path
                "\"STATUS\" TEXT," + // 7: status
                "\"CREATE_TIME\" INTEGER," + // 8: create_time
                "\"UPDATE_TIME\" TEXT," + // 9: update_time
                "\"DESCRIPTION\" TEXT);"); // 10: description
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LAW_ITEM\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, LawItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String law_name = entity.getLaw_name();
        if (law_name != null) {
            stmt.bindString(2, law_name);
        }
 
        String issue_no = entity.getIssue_no();
        if (issue_no != null) {
            stmt.bindString(3, issue_no);
        }
 
        String level = entity.getLevel();
        if (level != null) {
            stmt.bindString(4, level);
        }
 
        String type_name = entity.getType_name();
        if (type_name != null) {
            stmt.bindString(5, type_name);
        }
 
        String type_code = entity.getType_code();
        if (type_code != null) {
            stmt.bindString(6, type_code);
        }
 
        String file_path = entity.getFile_path();
        if (file_path != null) {
            stmt.bindString(7, file_path);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(8, status);
        }
 
        java.util.Date create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindLong(9, create_time.getTime());
        }
 
        String update_time = entity.getUpdate_time();
        if (update_time != null) {
            stmt.bindString(10, update_time);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(11, description);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, LawItem entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String law_name = entity.getLaw_name();
        if (law_name != null) {
            stmt.bindString(2, law_name);
        }
 
        String issue_no = entity.getIssue_no();
        if (issue_no != null) {
            stmt.bindString(3, issue_no);
        }
 
        String level = entity.getLevel();
        if (level != null) {
            stmt.bindString(4, level);
        }
 
        String type_name = entity.getType_name();
        if (type_name != null) {
            stmt.bindString(5, type_name);
        }
 
        String type_code = entity.getType_code();
        if (type_code != null) {
            stmt.bindString(6, type_code);
        }
 
        String file_path = entity.getFile_path();
        if (file_path != null) {
            stmt.bindString(7, file_path);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(8, status);
        }
 
        java.util.Date create_time = entity.getCreate_time();
        if (create_time != null) {
            stmt.bindLong(9, create_time.getTime());
        }
 
        String update_time = entity.getUpdate_time();
        if (update_time != null) {
            stmt.bindString(10, update_time);
        }
 
        String description = entity.getDescription();
        if (description != null) {
            stmt.bindString(11, description);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public LawItem readEntity(Cursor cursor, int offset) {
        LawItem entity = new LawItem( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // law_name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // issue_no
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // level
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // type_name
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // type_code
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // file_path
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // status
            cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)), // create_time
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // update_time
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10) // description
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, LawItem entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLaw_name(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIssue_no(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLevel(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType_name(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setType_code(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setFile_path(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStatus(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setCreate_time(cursor.isNull(offset + 8) ? null : new java.util.Date(cursor.getLong(offset + 8)));
        entity.setUpdate_time(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setDescription(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(LawItem entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(LawItem entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(LawItem entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
