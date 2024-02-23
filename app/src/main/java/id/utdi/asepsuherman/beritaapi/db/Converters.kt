package id.utdi.asepsuherman.beritaapi.db

import androidx.room.TypeConverter
import id.utdi.asepsuherman.beritaapi.model.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name ?: ""
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}