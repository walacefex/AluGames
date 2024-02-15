package br.com.alura.alugames.utilitario

import java.time.LocalDate
import java.time.Period
import java.time.format.DateTimeFormatter

fun String.tranformarEmIdade(): Int {
    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    val idade: Int
    val dataNascimento = LocalDate.parse(this, formatter)
    val hoje = LocalDate.now()
    idade = Period.between(dataNascimento, hoje).years

    return idade
}