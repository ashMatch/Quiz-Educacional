package org.example

import Student
import Teacher

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var teachers:MutableList<Teacher> = mutableListOf()
    var students:MutableList<Student> = mutableListOf()
    var teacher = Teacher(null, null, null)

    val result = welcomeMenu(teachers, teacher)
    println("Voce escolheu a opção ${result}")
}

fun welcomeMenu(teachers: MutableList<Teacher>, t:Teacher): Int{
    var repeat:Boolean
    do{
        var optionChosen:Int
        println("\nOlá bem vindo ao espaço Quizz School")
        println("\nTipo do usuário:")
        println("1.Professor")
        println("2.Aluno")
        println("Digite uma das opções:")
        optionChosen = readLine()!!.toInt()
        if (optionChosen != 1 && optionChosen != 2){
            println("Opção inválida, Por favor escolha uma opção válida")
            repeat = true
            continue
        }
        signInOrSignUpMenu(teachers, t)
        repeat = false
        return optionChosen
    }while (repeat == true)

    return 0;
}


fun signInOrSignUpMenu(teachers:MutableList<Teacher>, t:Teacher){
    println("Menu pra acessar ou criar a conta:")
    println("1.Já tem uma conta (sign in)")
    println("2.Criar uma conta(sign up)")
    println("3.Voltar para o menu anterior")
    println("Digite uma opção: ")
    var optionChose:Int = readln().toInt()
    when(optionChose){
        1-> println("Bem Vindo!!")
        2-> teacherSignUp(teachers, t)
        3-> welcomeMenu(teachers, t)
        else ->{
            println("Escolha uma opção válida")
        }
    }

}
fun teacherSignIn(teachers:MutableList<Teacher>, t:Teacher){
    for (teacher in teachers){
        print(teacher.name)
    }

}

fun teacherSignUp(teachers:MutableList<Teacher>, t:Teacher){
    print("Qual seu nome: ")
    t.name = readln()
    print("Informe um email válido: ")
    t.email = readln()
    print("Escolha uma senha alphanumerica: ")
    t.password = readln()
    for (i in 0..<teachers.size){
        if(teachers.any { it.email == t.email }){
            println("Um usuário com esse email já existe")
            break
        }
    }
    teachers.add(t)
    println("Usuario adcionado com Sucesso!!")
    teachers.forEach{ it -> println("""
        nome: ${it.name}
        email: ${it.email}
        senha: ${it.password}""".trimIndent()+"\n\n")}
}

fun StudentLogin(student:MutableList<String>){
}