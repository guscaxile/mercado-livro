package com.mercadolivro.enums

enum class Errors(val code: String, val message: String) {
    ML000("ML-000", "Access Denied"),
    ML001("ML-001", "Invalid Request"),

    // code from 101 to 200 is referent to Book
    ML101("ML-101", "Book [%s] not exists"),
    ML102("ML-102", "Cannot update book with status [%s]"),
    ML103("ML-103", "Book [%s] is not available. His status is [%s]"),

    // code from 201 to 300 is referent to Customer
    ML201("ML-201", "Customer [%s] not exists")
}