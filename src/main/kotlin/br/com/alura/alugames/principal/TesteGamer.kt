package br.com.alura.alugames.principal

import br.com.alura.alugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer("Walace", "walacefex01@gmail.com")
    println(gamer1)

    val gamer2 = Gamer("Natalia", "evelynat.x@gmail.com", "09/10/1996", "evelynat")
    println(gamer2)

    gamer1.let{
        it.dataNascimento = "23/12/1997"
        it.usuario = "Walacefex"
    }.also {
        println(gamer1.idInterno)
    }
    println(gamer1)
    gamer1.usuario = "Walle"
    println(gamer1)
}