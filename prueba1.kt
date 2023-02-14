
 //queremos que el usuario introduzca un numero dentro de un rango el do while 
//es una buena opción porque se ejecutará al menos una vez y 
//si mete un número no valido pues seguimos en el bucle hasta que se decida a poner uno correcto.
fun main() {
var numero:Int
Do {
    println("Introduce un numero entre 1 y 100")
    numero = readLine()!!.toInt()
} while(numero !in 1..100) // numero < 1 || numero > 100
println("Gracias")
}