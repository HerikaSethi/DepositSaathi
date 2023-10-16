package com.herika.depositsaathi.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "deposit_table")
data class DepositEntity (
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    var userId: String,
    var userEmail: String,
)