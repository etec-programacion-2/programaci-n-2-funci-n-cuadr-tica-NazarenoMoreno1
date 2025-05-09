package org.example

/**
 * Resuelve ecuaciones cuadráticas de esta forma ax² + bx + c = 0
 * Calcula discriminante y raíces de la ecuación
 * Calcula los valores de la función cuadrática para un rango de valores de x
 */
fun calcular(a: Int, b: Int, c: Int) {
    for (x in -5..5){
        val resultado = a * x*x + b * x + c
        println("Valor en y cuando x es $x: $resultado")
    }
}

/**
 * Calcula el discriminante de la ecuación cuadrática (b² - 4ac)
 * El discriminante determina el tipo y número de raíces
 * Hace un return del valor del discriminante
 */
fun discriminante (a: Int, b: Int, c: Int): Int {
    val result = b * b - 4 * a * c
    println("La discriminante es igual a: $result")
    return result
}

/**
 * Calcula las raíces de la ecuación cuadrática usando la fórmula general
 * x = (-b ± √discriminante) / (2a)
*/

fun raices (a: Int, b: Int, discrimi: Int){
    // Calculamos las dos raíces usando la fórmula cuadrática
    val resulta1 = (-b + Math.sqrt(discrimi.toDouble()))/(2*a)
    val resulta2 = (-b - Math.sqrt(discrimi.toDouble()))/(2*a)
    println("Las raices son x1= ${"%.2f".format(resulta1)} y x2 = ${"%.2f".format(resulta2)}")
}

/**
 * Función principal que resuelve la ecuación cuadrática
 */

fun main() {
    // Coeficientes de la ecuación cuadrática
    val a = 1
    val b = 3
    val c = 2
    // Nos fijamos que el coeficiente a no sea cero (sería una ecuación lineal)
    if (a == 0){
        println("El coeficiente a tiene que ser necesariamente distinto a 0")
        return
    }
    println("$a x² + $b x + $c")

    calcular(a, b, c)

    val discrimi = discriminante(a, b, c)
    
    //Hacemos un if para saber que tipo de raices son.
    
    if (discrimi > 0) {
        println("Son Raíces Reales Distintas")
        raices(a, b, discrimi)
    } else if (discrimi == 0) {
        println("Tiene una Raíz Real Única")
        val result = (-b.toDouble() / (2 * a))
        println("La raíz única es x = $result")
    } else {
        println("Son raíces complejas.")
    }
}