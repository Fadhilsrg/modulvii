package com.example.modulvii

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

internal class DatabaseHelper(context: Context) : SQLiteOpenHelper(
    context,
    DATABASE_NAME,
    null,
    DATABASE_VERSION
) {
    companion object {
        private const val DATABASE_NAME = "dbhomework"
        private const val DATABASE_VERSION = 1

        // SQL untuk membuat tabel
        private const val SQL_CREATE_TABLE_HOMEWORK = """
            CREATE TABLE ${DatabaseContract.HomeworkColumns.TABLE_NAME} (
                ${DatabaseContract.HomeworkColumns._ID} INTEGER PRIMARY KEY AUTOINCREMENT,
                ${DatabaseContract.HomeworkColumns.TITLE} TEXT NOT NULL,
                ${DatabaseContract.HomeworkColumns.DESCRIPTION} TEXT NOT NULL,
                ${DatabaseContract.HomeworkColumns.DATE} TEXT NOT NULL
            )
        """
    }

    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(SQL_CREATE_TABLE_HOMEWORK)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS ${DatabaseContract.HomeworkColumns.TABLE_NAME}")
        onCreate(db)
    }
}
