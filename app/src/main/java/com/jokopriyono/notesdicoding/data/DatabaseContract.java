package com.jokopriyono.notesdicoding.data;

import android.provider.BaseColumns;

class DatabaseContract {
    static String TABLE_NOTE = "note";

    static final class NoteColumns implements BaseColumns{
        static String TITLE = "title";
        static String DESCRIPTION = "desc";
        static String DATE = "date";
    }
}
