package com.herika.depositsaathi.viewModel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.herika.depositsaathi.repository.DepositRepository
import com.herika.depositsaathi.room.DepositEntity
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DepositViewModel @Inject constructor(private val depositRepository: DepositRepository) : ViewModel() {

    fun addDeposit(){
        viewModelScope.launch {
            val depositObject = DepositEntity(userId = "1", userEmail = "abc@gmaiil.com")
            depositRepository.insertDeposit(depositObject)
        }
    }
//
//    fun getAllDeposit(){
//        viewModelScope.launch {
//            depositRepository.getAllDeposits()
//        }
//    }

//    fun deleteDeposit(){
//        viewModelScope.launch {
//            depositRepository.deleteAllDeposits()
//        }
//    }

    fun printTest(){
        Log.d("hey","hello")
    }
}