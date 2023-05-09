package com.example.demo.models

class Bank(
    // kotlin auto generates default getters and setters
    // its public by default
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)
