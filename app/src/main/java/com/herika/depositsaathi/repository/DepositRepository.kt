package com.herika.depositsaathi.repository

import android.app.Application
import android.content.Context
import com.herika.depositsaathi.room.DepositDao

import com.herika.depositsaathi.room.DepositEntity
import javax.inject.Inject

class DepositRepository @Inject constructor(
    private val depositDao: DepositDao
) {

//    private val db = DepositDatabase.getDatabaseInstance()
//    private val depositDao = db.depositDao()

    suspend fun insertDeposit(depositEntity: DepositEntity){
        depositDao.insertDeposit(depositEntity)
    }

    suspend fun getAllDeposits() = depositDao.getAllDeposits()

    suspend fun deleteAllDeposits() = depositDao.deleteAllDeposits()
}