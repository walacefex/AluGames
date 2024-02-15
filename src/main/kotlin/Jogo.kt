data class Jogo(val titulo:String, val capa:String ) {
    var descricao:String? = ""
    override fun toString(): String {
        return "Meu jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descricao: $descricao"
    }
}