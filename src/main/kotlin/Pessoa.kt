/*
data class - Classe totalmente responsável pela manipulação dos dados
 */

data class Pessoa constructor(var nome: String, var altura: Double) {

    //Atributos - variáveis que nós declaramos dentro de uma classe
    //Classe Pessoa - nome, altura, peso, corDosOlhos, tomDePele, signo

    var peso = 0.0
    var corDosOlhos = ""
    var corDePele = ""
    var signo = ""

    //Declarando construtores secundários
    /*
    constructor(informações) : this(referência dos atributos do construtor
    anterior){

    Referenciar os atributos já existentes, que não foram adicionados no
    construtor anterior, com o valor do construtor atual.

    Exemplo:
    this.peso = peso

    }

    */
    constructor(nome: String, altura: Double, peso: Double, corDosOlhos: String
    ) : this(nome, altura){
        this.peso = peso
        this.corDosOlhos = corDosOlhos
    }



    constructor(nome: String, altura: Double, peso: Double, corDosOlhos: String,
    corDePele: String, signo: String) : this(nome, altura, peso, corDosOlhos){

        this.corDePele = corDePele
        this.signo = signo
    }

    //Consegue fazer mudança no toString ou fazer no Data class

    /*override fun toString(): String {
        return "nome - $nome" +
                "\nAltura - $peso"+
                "\nCor dos Olhos - $corDosOlhos" +
                "\nCor de Pele - $corDePele" +
                "\nSigno - $signo"
    }*/
}