package com.example.modulvii

import android.provider.BaseColumns

internal class DatabaseContract {
    internal class HomeworkColumns : BaseColumns {
        companion object {
            const val TABLE_NAME = "dbhomework"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"
        }
    }
}