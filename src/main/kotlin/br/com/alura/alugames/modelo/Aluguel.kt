package br.com.alura.alugames.modelo

data class Aluguel(
    val gamer: Gamer,
    val jogo: Jogo,
    val periodo: Periodo) {
    var valorDoAluguel = jogo.preco * periodo.emDias

    override fun toString(): String {
        return "Aluguel do jogo ${jogo.titulo} por ${gamer.nome} pelo valor R$$valorDoAluguel"
    }
}
