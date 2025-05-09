package org.example

fun calcular(a: Int, b: Int, c: Int) {
    for (x in -5..5){
        val resultado = a * x*x + b * x + c
        println("Valor en y cuando x es $x: $resultado")
    }
}

fun discriminante (a: Int, b: Int, c: Int): Int {
    val result = b * b - 4 * a * c
    println("La discriminante es igual a: $result")
    return result
}
fun raices (a: Int, b: Int, discrimi: Int){
    val resulta1 = (-b + Math.sqrt(discrimi.toDouble()))/(2*a)
    val resulta2 = (-b - Math.sqrt(discrimi.toDouble()))/(2*a)
    println("Las raices son x1= ${"%.2f".format(resulta1)} y x2 = ${"%.2f".format(resulta2)} ")
}
fun main() {
    val a = 1
    val b = 3
    val c = 2
    if (a == 0){
        println("El coeficiente a tiene que ser necesariamente distinto a 0")
        return
    }
    println("$a x² + $b x + $c")

    calcular(a, b, c)

    val discrimi = discriminante(a, b, c)

    if (discrimi < 0) {
        println("No tiene raíces reales")
    } else {
        raices(a, b, discrimi)
    }
}