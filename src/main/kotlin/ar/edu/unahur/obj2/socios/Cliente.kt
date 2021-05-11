package ar.edu.unahur.obj2.socios

class Cliente(var plataEnBolsillo: Double, var estado: Estado, var barrio: Barrio){

    fun calcularPropina(importePedido: Double) = barrio.factorBarrio(this.calculoAuxiliarPropina(importePedido))
    private fun calculoAuxiliarPropina(importePedido: Double) = estado.calculaPropina(importePedido, plataEnBolsillo)
}

interface Estado{
    fun calculaPropina(precio:Double, plataEnBolsillo: Double ): Double
}
class Enojado: Estado{
    override fun calculaPropina(precio:Double, plataEnBolsillo: Double) = 0.0
}
class Feliz: Estado{
    override fun calculaPropina(precio:Double, plataEnBolsillo: Double) = precio * 0.25
}
class Indiferente: Estado{
    override fun calculaPropina(precio: Double, plataEnBolsillo: Double) = plataEnBolsillo
}
class Resfriado: Estado{
    override fun calculaPropina(precio: Double, plataEnBolsillo: Double) = precio
}

interface Barrio{
    fun factorBarrio(propina: Double): Double
}
class LasRosas: Barrio{
    override fun factorBarrio(propina: Double) = propina + 50.0
}
class LasRatas: Barrio{
    override fun factorBarrio(propina: Double) = propina / 2
}
class BarrioVerde: Barrio{
    override fun factorBarrio(propina: Double) = if (propina<200){200.0} else{propina}
}
class LasTorres: Barrio{
    override fun factorBarrio(propina: Double) = propina * 1.0
}