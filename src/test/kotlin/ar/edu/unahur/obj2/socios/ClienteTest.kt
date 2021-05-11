package ar.edu.unahur.obj2.socios

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ClienteTest : DescribeSpec({
  describe("Un/a cliente") {
    val unCliente = Cliente(15.5, Enojado(), LasTorres())
    describe("Calcula propina por estado") {
      it("enojado") {

        unCliente.calcularPropina(1500.0).shouldBe(0.0)
      }
      it("feliz") {
        unCliente.estado = Feliz()
        unCliente.calcularPropina(1500.0).shouldBe(375.0)
      }
      it("indiferente") {
        unCliente.estado = Indiferente()
        unCliente.calcularPropina(1500.0).shouldBe(15.5)
      }
      it("resfriado/a") {
        unCliente.estado = Resfriado()
        unCliente.calcularPropina(1500.0).shouldBe(1500.0)
      }
    }
    describe("Calcula propina por estado y barrio Las Rosas"){
      val unCliente1 = Cliente(15.5, Enojado(),LasRosas())
      it("enojado de Las Rosas") {
        unCliente1.calcularPropina(1500.0).shouldBe(50.0)
      }
      it("feliz de Las Rosas") {
        unCliente1.estado = Feliz()
        unCliente1.calcularPropina(1500.0).shouldBe(425.0)
      }
      it("indiferente de Las Rosas") {
        unCliente1.estado = Indiferente()
        unCliente1.calcularPropina(1500.0).shouldBe(65.5)
      }
      it("resfriado/a de Las Rosas") {
        unCliente1.estado = Resfriado()
        unCliente1.calcularPropina(1500.0).shouldBe(1550.0)
      }
    }
    describe("Calcula propina por estado y barrio Las Ratas"){
      unCliente.barrio = LasRatas()
      it("enojado de Las Ratas") {

        unCliente.calcularPropina(1500.0).shouldBe(0.0)
      }
      it("feliz de Las Ratas") {
        unCliente.estado = Feliz()
        unCliente.calcularPropina(1500.0).shouldBe(187.5)
      }
      it("indiferente de Las Ratas") {
        unCliente.estado = Indiferente()
        unCliente.calcularPropina(1500.0).shouldBe(7.75)
      }
      it("resfriado/a de Las Ratas") {
        unCliente.estado =Resfriado()
        unCliente.calcularPropina(1500.0).shouldBe(750.0)
      }
    }
    describe("Calcula propina por estado y barrio Barrio Verde"){
      unCliente.barrio = BarrioVerde()
      it("enojado de Barrio Verde") {
        unCliente.estado = Enojado()
        unCliente.calcularPropina(1500.0).shouldBe(200.0)
      }
      it("feliz de Barrio Verde") {
        unCliente.estado = Feliz()
        unCliente.calcularPropina(1500.0).shouldBe(375.0)
      }
      it("indiferente de Barrio Verde") {
        unCliente.estado = Indiferente()
        unCliente.calcularPropina(1500.0).shouldBe(200.0)
      }
      it("resfriado/a de Barrio Verde") {
        unCliente.estado = Resfriado()
        unCliente.calcularPropina(1500.0).shouldBe(1500.0)
      }
    }
  }
})
