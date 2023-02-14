// Ejemplo 2:haga un algoritmo que calcule el promedio de 3 números  y si el promedio es mayor a 3.5 
// indique que gana la materia, si el promedio es mayor a 2 y menor o igual a 3.5 entonces indique que 
// puede recuperar
fun main(){
    println("ingrese su primera nota: ")
    var Nota1 = readLine()!!.toDouble()
    
    println("ingrese su segunda nota: ")
    var Nota2 = readLine()!!.toDouble()
    
    println("ingrese su tercera nota: ")
    var Nota3 = readLine()!!.toDouble()
    
    var promedio = ((Nota1+Nota2+Nota3)/3)
    
    if((promedio > 2) and (promedio <= 3.5)){
    println("su promedio fue de $promedio puede recuperar")}
    else if (promedio > 3.5){
    println("su promedio fue de $promedio ganaste la materia")}
    else{
        println("ingrese un dato valido por favor")
        }
    }