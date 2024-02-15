package br.com.alura.alugames.principal
import br.com.alura.alugames.modelo.Gamer
fun main() {
    val gamer1 = Gamer("Walace", "walace@email.com")
    println(gamer1)

    val gamer2 = Gamer(
        "Natalia",
        "natalia@email.com",
        "24/08/1990",
        "evelynat")

    println(gamer2)

    gamer1.let {
        it.dataNascimento = "22/10/1990"
        it.usuario = "walacefex"

    }.also {
        println(gamer1.idInterno)
    }

    println(gamer1)
    gamer1.usuario = "walace"
    println(gamer1)
}