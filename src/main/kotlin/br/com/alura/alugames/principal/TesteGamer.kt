package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Walace", "walacefex01@gmail.com")
    println(gamer1)

    val gamer2 = Gamer("Natalia", "evelynat.x@gmail.com", "09/10/1996", "evelynat")
    println(gamer2)
}