// Ejemplo 1: Ingrese la edad de una persona y valide si es mayor o menor de edad, adicionalmente si
//  la persona tiene 25 años menciónelo.

println("Ingrese su edad")

val age = readline()!!.toInt();

if (age <18){
println("usted es menor de edad")
}else if (age >= 18) {
    println("usted es mayor de edad")
}else if (age === 18) {
    println("usted tiene 25 años, señor $age")
}else{
    println("ingrese porfavor un numero")
}