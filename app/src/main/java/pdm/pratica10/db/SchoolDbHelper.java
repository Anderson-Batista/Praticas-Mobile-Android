package pdm.pratica10.db;

import static pdm.pratica10.db.SchoolContract.DATABASE_NAME;
import static pdm.pratica10.db.SchoolContract.DATABASE_VERSION;
import static pdm.pratica10.db.SchoolContract.SQL_CREATE_STUDENT;
import static pdm.pratica10.db.SchoolContract.SQL_DELETE_STUDENT;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SchoolDbHelper extends SQLiteOpenHelper {

    public SchoolDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_STUDENT);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_STUDENT);
        this.onCreate(db);
    }
}