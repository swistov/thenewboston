package ru.gcall.thenewboston.datasource

import ru.gcall.thenewboston.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

    fun retrieveBank(accountNumber: String): Bank
    fun createBank(bank: Bank): Bank
}