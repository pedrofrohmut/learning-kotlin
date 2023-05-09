package com.example.demo.datasources.mock

import org.springframework.stereotype.Repository
import com.example.demo.datasources.BankDataSource
import com.example.demo.models.Bank

@Repository
class MockBankDataSource : BankDataSource
{
    val banks = listOf(
        Bank("acc1", 1.99, 1),
        Bank("acc2", 2.99, 0),
        Bank("acc3", 0.0, 3),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}
