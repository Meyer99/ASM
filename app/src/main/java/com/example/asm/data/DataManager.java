package com.example.asm.data;

public class DataManager{

    static private DataManager dataManager = new DataManager();

    private DBHelper dbHelper;

    private void DataManager(){
        this.dbHelper = new mDBHelper();
    }

    static public DataManager getInstance(){
        return dataManager;
    }

    public DBHelper getDbHelper(){
        return dbHelper;
    }

}
