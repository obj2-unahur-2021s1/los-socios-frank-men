package ar.edu.unahur.obj2.socios

class Cliente{
    var plataEnBolsillo = 0.0
    private lateinit var estado: Estado

    fun setEstado(estado: Estado) {
        this.estado = estado
    }
    fun calcularPropina(importePedido: Double) =
        estado.calculaPropina(importePedido, plataEnBolsillo)
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
