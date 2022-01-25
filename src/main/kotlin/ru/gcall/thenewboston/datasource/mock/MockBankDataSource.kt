package ru.gcall.thenewboston.datasource.mock

import org.springframework.stereotype.Repository
import ru.gcall.thenewboston.datasource.BankDataSource
import ru.gcall.thenewboston.model.Bank

@Repository
class MockBankDataSource : BankDataSource {

    val banks = listOf(
        Bank("1234", 3.14, 17),
        Bank("1010", 17.0, 0),
        Bank("5678", 0.0, 100),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}