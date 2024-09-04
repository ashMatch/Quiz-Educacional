package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val result = welcomeMenu()
    println("Voce escolheu a opção ${result}")
}

fun welcomeMenu(): Int{
    var repeat:Boolean
    do{
        println("\u001b[H\u001b[2J")
        var optionChosen:Int
        println("\nOlá bem vindo ao espaço Quizz School")
        println("\nTipo do usuário:")
        println("1. Aluno")
        println("2. Professor")
        println("Digite uma das opções:")
        optionChosen = readLine()!!.toInt()
        if (optionChosen != 1 && optionChosen != 2){
            println("Opção inválida, Por favor escolha uma opção válida")
            repeat = true
            continue
        }
        repeat = false
        return optionChosen
    }while (repeat == true)

    return 0;
}

fun TeacherLogin(){

}