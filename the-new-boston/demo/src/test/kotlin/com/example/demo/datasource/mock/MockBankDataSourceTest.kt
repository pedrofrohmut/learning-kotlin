package com.example.demo.datasources.mock

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest
{
    private val mockDataSource = MockBankDataSource()

    @Test
    fun `should provide a collection of banks`()
    {
        // When
        val banks = mockDataSource.retrieveBanks()

        // Then
        assertThat(banks).isNotEmpty
    }

    @Test
    fun `should provide some mock data`()
    {
        // When
        val banks = mockDataSource.retrieveBanks()

        // Then
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
        assertThat(banks).anyMatch { it.trust != 0.0 }
        assertThat(banks).anyMatch { it.transactionFee != 0 }
    }
}
