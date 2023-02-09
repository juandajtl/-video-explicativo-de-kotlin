// Ejemplo 1: Ingrese la edad de una persona y valide si es mayor o menor de edad, adicionalmente si
//  la persona tiene 25 años menciónelo.

fun main(){
    println("Ingrese su edad: ");
    val age = readLine()!!.toInt();
        
    println("Ingrese su nombre: ");
    val name= readLine();
    
    if (age == 25) {
        println("usted tiene 25 años, señor $name")
    }
    else if (age < 18){
    println("usted es menor de edad")
    }else if (age >= 18 ) {
        println("usted es mayor de edad")
    }else{
        println("ingrese porfavor un numero")
        }
    }