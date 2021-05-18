package boletin4

/**
 *
 * Creado por @autor: angel
 *       El  14 de may. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/

// Creamos la clase con el constructor por defecto
class Libro( var titulo: String, var autor: String, var anno: Int, var numPaginas: Short, var valoracion: Float) {


    // Creamos una función para recibir un libro y mostrar sus propiedades
    fun amosar() {
        println("titulo = ${titulo}\n" +
                "autor = $autor\n" +
                "anno = $anno\n" +
                "numPaginas = $numPaginas \n" +
                "valoraciones = $valoracion")
    }

    // Cambiamos por una función lambda

    val amosarLambda={libro:Libro->
        println("titulo = ${titulo}\n" +
            "autor = $autor\n" +
            "anno = $anno\n" +
            "numPaginas = $numPaginas \n" +
            "valoraciones = $valoracion")}
}