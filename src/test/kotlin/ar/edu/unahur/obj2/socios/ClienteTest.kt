package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val unCliente = Cliente()
    unCliente.plataEnBolsillo = 15.5
    it("enojado"){
      unCliente.setEstado(Enojado())
      unCliente.calcularPropina(1500.0).shouldBe(0.0)
    }
    it("feliz"){
      unCliente.setEstado(Feliz())
      unCliente.calcularPropina(1500.0).shouldBe(375.0)
    }
    it("indiferente"){
      unCliente.setEstado(Indiferente())
      unCliente.calcularPropina(1500.0).shouldBe(15.5)
    }
    it("resfriado/a"){
      unCliente.setEstado(Resfriado())
      unCliente.calcularPropina(1500.0).shouldBe(1500.0)
    }
  }
})
