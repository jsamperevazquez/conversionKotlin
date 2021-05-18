package boletin5

/**
 *
 * Creado por @autor: angel
 *       El  15 de may. de 2021.
 *   //-encoding utf8 -docencoding utf8 -charset utf8(Para el javadoc)
 **/
class Consumo(val kms: Float, val litros: Float, val vMed: Float, val pGas: Float) {

    fun getTempo(): Float {
        return kms / vMed

    }

    fun consumoMedio(): Float {
        return kms * litros / 100
    }

    fun consumoEuros(): Float {
        return consumoMedio() * pGas
    }


}