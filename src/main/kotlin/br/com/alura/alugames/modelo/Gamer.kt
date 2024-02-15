package br.com.alura.alugames.modelo

data class Gamer(var nome:String, var email:String){
    var dataNascimento:String? = null
    var usuario:String? = null
    val idInterno:String? = null

    constructor(nome: String, email: String, dataNascimento:String, usuario:String): this(nome, email){
        this.dataNascimento = dataNascimento
        this.usuario = usuario
    }

    override fun toString(): String {
        return "Gamer(nome='$nome', email='$email', dataNascimento=$dataNascimento, usuario=$usuario, idInterno=$idInterno)"
    }

}
