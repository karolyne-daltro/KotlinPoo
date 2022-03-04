fun main() {
    /*
    Obejtos - Estados e Comportamentos

    Objeto Cachorro:

    Estados (ou atributos) - Cor do Pelo, Cor dos Olhos, nome, Raça

    Comportamentos (ou Métodos) - Latir, Correr, Abanar o Rabo

    Cada objeto dentro da nossa programação vai ter uma identidade única
     */

    /*
    Classe Pessoa - nome, altura, peso, corDosOlhos, tomDePele, signo

    class Pessoa {
     Declarar os atributos e métodos

    }
     */

    //Instância - Um objeto derivado de uma classe

   /* val robin = Pessoa()

    robin.nome = "Robin"
    robin.altura = 1.61
    robin.peso = 59.0
    robin.corDosOlhos = "Azul"
    robin.corDePele = "Morena"
    robin.signo = "Capricórnio"

    println(robin.nome)

    println("Nome - ${robin.nome}")
    println("Altura - ${robin.altura}")
    println("Peso - ${robin.peso}")
    println("Cor dos olhos - ${robin.corDosOlhos}")
    println("Cor de pele - ${robin.corDePele}")
    println("Signo - ${robin.signo}")

    val luffy = Pessoa()

    luffy.nome = "Luffy"
    luffy.altura = 1.80
    luffy.peso = 75.0
    luffy.corDosOlhos = "Preto"
    luffy.corDePele = "Moreno"
    luffy.signo = "Sagitário"

    println("Nome - ${luffy.nome}")
    println("Altura - ${luffy.altura}")
    println("Peso - ${luffy.peso}")
    println("Cor dos olhos - ${luffy.corDosOlhos}")
    println("Cor de pele - ${luffy.corDePele}")
    println("Signo - ${luffy.signo}")*/

    /*
    Métodos - Comportamentos (ou seja, as ações que os objetos derivados
    da classe podem executar)
     */

    /*
    Conta de Banco

    Atributos - Titular, Tipo, Saldo
    Métodos - Saque, Depósito e Saldo

     */

    //Instanciar um objeto ContaBanco
   /* val conta = ContaBanco()

    conta.titular = "Zoro"
    conta.tipo = 1
    conta.saldo = 2000.0

    //Chamar os métodos da ContaBanco
    conta.mostrarSaldo()

    println("Digite o valor de saque: ")
    val saque = readLine()!!.toDouble()

    conta.saque(saque)

    println("Digite o valor de depósito: ")
    val deposito = readLine()!!.toDouble()

    conta.deposito(deposito)

    conta.mostrarSaldo()*/

    /*Contrutores - Vão servir para instaciarmos o objeto com as informações
    obrigatórias que ele precisa.*/

    //Instanciar os objetos, passando informações no construtor

    /*val pessoa = Pessoa("Zoro", 1.90, 90.0, "Pretos",
    "Verde", "Touro")

    println(pessoa)*/

    /*4 - Crie uma classe funcionário e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto funcionário,
    defina as instancias deste objeto e apresente as informações
    deste objeto no console.*/

    val nami = Funcionario()

    nami.nome = "Nami"
    nami.salario = 3500.0
    nami.cargaHoraria = 180.0
    nami.horaDiaria = 8.0
    nami.planoDeSaude = "Intermédica"
    nami.dentista = "Odonto Saudavél"
    nami.diasDeTrabalho = "5x2"


    println(nami.nome)

    println("Nome - ${nami.nome}")
    println("Salário - ${nami.salario}")
    println("Carga Horária de trabalho - ${nami.cargaHoraria}")
    println("Hora Diária de trabalho - ${nami.horaDiaria}")
    println("Plano de Saúde - ${nami.planoDeSaude}")
    println("Dentista - ${nami.dentista}")
    println("Dias de Trabalho - ${nami.diasDeTrabalho}")

    /*1) Crie uma classe cliente e apresente os atributos e métodos
    referentes esta classe, em seguida crie um objeto cliente, defina
    as instancias deste objeto e apresente as informações deste objeto
    no console.*/
    val frankly = Cliente()

    frankly.nome = "Frankly"
    frankly.formaDePagamento = "Débito ou Crédito."
    frankly.acompanharFaturas = "Pelo site ou aplicaitvo."
    frankly.lojas = "Físicas e virtuais."
    frankly.atendimento = "Presencial, chat e telefone."
    frankly.horarioDeCompra = "Lojas físicas de Segunda à Sábado das 8h as 20h e lojas virtuais 24h todos os dias."
    frankly.formaDeEntrega = "Cliente pode buscar na loja ou pode ser entregue na sua casa."


    println(frankly.nome)

    println("Nome - ${frankly.nome}")
    println("Formas de pagamento disponíveis - ${frankly.formaDePagamento}")
    println("Formas de ver faturas - ${frankly.acompanharFaturas}")
    println("Hora Diária de trabalho - ${frankly.lojas}")
    println("Formas de Atendimentos - ${frankly.atendimento}")
    println("Horário das lojas físicas e virtuais - ${frankly.horarioDeCompra}")
    println("Forma de entrega da compra - ${frankly.formaDeEntrega}")

    /*5) Crie uma classe patinete e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto patinete, defina as instancias deste objeto
    e apresente as informações deste objeto no console.

    val sunny = Patinete("Amarelo")
    sunny.nome = "Sunny"

    sunny.buzina = true
    sunny.lanterna = true

    sunny.acelerar(valor =  10.0)

    sunny.buzinar()

    sunny.ligarLanterna()

    println(sunny)

    sunny.freiar(valor =  50.0)

    sunny.ligarLanterna()

    println(sunny)*/






}