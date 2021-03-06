package com.example.ovuguide;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class ObservationsSQLiteHelper extends SQLiteOpenHelper{
	
	public static final String DATABASE_NAME = "ObservationsDB";
	public static final int DATABASE_VERSION = 1;
		
	public static final String TABLE_NAME ="Observations";
	public static final String DAY_OF_MONTH ="day_of_month"; 
	public static final String MONTH ="month";
	public static final String YEAR ="year";
	public static final String MUCUS ="mucus";
	public static final String TEMPERATURE ="temperature";
	public static final String PHASE ="phase";
	
	public static final String CREATE_OBSERVATIONS_TABLE = "CREATE TABLE Observations (day_of_month integer,month integer,year integer, mucus integer,phase integer,primary key(day_of_month,month,year))";
	
	
	public ObservationsSQLiteHelper(Context context) {
		super(context,DATABASE_NAME,null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(CREATE_OBSERVATIONS_TABLE);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
	    onCreate(db);
		
	}
	


}
