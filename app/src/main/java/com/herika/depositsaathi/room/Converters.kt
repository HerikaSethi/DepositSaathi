package com.herika.depositsaathi.room

import androidx.room.TypeConverter
import androidx.room.TypeConverters

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String{
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source{
        return Source(name,name)
    }
}