import boletin4.Libro
import boletin5.Consumo
import java.text.DecimalFormat

fun main(args: Array<String>) {

    //Clase Libro Boletín 4
    println("Constructores en Kotlin \t Boletín 4")
    val libro1 = Libro("La sombra del Viento", "Carlos Ruiz Zafon", 2012, 523, 9.5f)
    libro1.anno = 2011 // Los gettes y setters en Kotlin son implícitos y heredan el mismo acceso que las propiedades
    libro1.amosar()
    println("\nAhora con función Lambda\n")
    libro1.amosarLambda(libro1)

    // Clase Consumo Boletín 5
    println("\nMetodos de la clase Consumo del Boletín 5\n")
    val objetoConsumo = Consumo(74.5f, 5.3f, 73.4f, 1.14f)
    val tempo =
        ("Tiempo de viaje " + String.format("%.2f ", objetoConsumo.getTempo()) + " horas") // Saco solo dos decimales
    println(tempo)

    val consumo100 = ("Consumo " + String.format("%.1f ", objetoConsumo.consumoMedio()) + " litros a los cien")
    println(consumo100)

    println("Euros gastados " + String.format("%s", objetoConsumo.consumoEuros()) + " €")


}