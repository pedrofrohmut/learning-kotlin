package com.example.demo.datasources

import com.example.demo.models.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}
