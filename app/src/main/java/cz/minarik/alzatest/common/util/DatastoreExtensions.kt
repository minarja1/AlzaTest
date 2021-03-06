package cz.minarik.alzatest.common.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.*
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

fun DataStore<Preferences>.getBooleanData(
    key: String,
    defaultValue: Boolean = false
): Flow<Boolean> {
    return data
        .map { preferences ->
            preferences[booleanPreferencesKey(key)] ?: defaultValue
        }
}

suspend fun DataStore<Preferences>.setBooleanData(key: String, data: Boolean) {
    edit { settings ->
        settings[booleanPreferencesKey(key)] = data
    }
}

fun DataStore<Preferences>.getIntData(
    key: String,
    defaultValue: Int = 0
): Flow<Int> {
    return data
        .map { preferences ->
            preferences[intPreferencesKey(key)] ?: defaultValue
        }
}

suspend fun DataStore<Preferences>.setIntData(
    key: String,
    data: Int,
) {
    edit { settings ->
        settings[intPreferencesKey(key)] = data
    }
}

suspend fun DataStore<Preferences>.incrementIntData(
    key: String,
    data: Int,
) {
    edit { settings ->
        val currentCounterValue = settings[intPreferencesKey(key)] ?: 0
        settings[intPreferencesKey(key)] = currentCounterValue + data
    }
}

suspend fun DataStore<Preferences>.setDoubleData(
    key: String,
    data: Double
) {
    edit { settings ->
        settings[doublePreferencesKey(key)] = data
    }
}

suspend fun DataStore<Preferences>.incrementDoubleData(
    key: String,
    data: Double,
) {
    edit { settings ->
        val currentCounterValue = settings[doublePreferencesKey(key)] ?: 0.0
        settings[doublePreferencesKey(key)] = currentCounterValue + data
    }
}


fun DataStore<Preferences>.getDoubleData(
    key: String,
    defaultValue: Double = 0.0
): Flow<Double> {
    return data
        .map { preferences ->
            preferences[doublePreferencesKey(key)] ?: defaultValue
        }
}

suspend fun DataStore<Preferences>.setFloatData(
    key: String,
    data: Float
) {
    edit { settings ->
        settings[floatPreferencesKey(key)] = data
    }
}

suspend fun DataStore<Preferences>.incrementFloatData(
    key: String,
    data: Float,
) {
    edit { settings ->
        val currentCounterValue = settings[floatPreferencesKey(key)] ?: 0.0f
        settings[floatPreferencesKey(key)] = currentCounterValue + data
    }
}

fun DataStore<Preferences>.getFloatData(
    key: String,
    defaultValue: Float = 0f
): Flow<Float> {
    return data
        .map { preferences ->
            preferences[floatPreferencesKey(key)] ?: defaultValue
        }
}

suspend fun DataStore<Preferences>.setLongData(
    key: String,
    data: Long
) {
    edit { settings ->
        settings[longPreferencesKey(key)] = data
    }
}

suspend fun DataStore<Preferences>.incrementLongData(
    key: String,
    data: Long,
) {
    edit { settings ->
        val currentCounterValue = settings[longPreferencesKey(key)] ?: 0
        settings[longPreferencesKey(key)] = currentCounterValue + data
    }
}

fun DataStore<Preferences>.getLongData(
    key: String,
    defaultValue: Long = 0
): Flow<Long> {
    return data
        .map { preferences ->
            preferences[longPreferencesKey(key)] ?: defaultValue
        }
}

suspend fun DataStore<Preferences>.setStringSetData(
    key: String,
    data: Set<String>
) {
    edit { settings ->
        settings[stringSetPreferencesKey(key)] = data
    }
}

fun DataStore<Preferences>.getStringSetData(
    key: String,
    defaultValue: Set<String> = setOf()
): Flow<Set<String>> {
    return data
        .map { preferences ->
            preferences[stringSetPreferencesKey(key)] ?: defaultValue
        }
}

suspend fun DataStore<Preferences>.setStringData(
    key: String,
    data: String
) {
    edit { settings ->
        settings[stringPreferencesKey(key)] = data
    }
}

fun DataStore<Preferences>.getStringData(
    key: String,
    defaultValue: String = "",
): Flow<String> {
    return data
        .map { preferences ->
            preferences[stringPreferencesKey(key)] ?: defaultValue
        }
}