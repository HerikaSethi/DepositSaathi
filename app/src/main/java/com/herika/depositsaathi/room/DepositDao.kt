package com.herika.depositsaathi.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface DepositDao {
    @Insert
    suspend fun insertDeposit(deposit: DepositEntity)

    @Query("SELECT * FROM deposit_table")
    suspend fun getAllDeposits(): List<DepositEntity>


    @Query("DELETE FROM deposit_table")
    suspend fun deleteAllDeposits()
}