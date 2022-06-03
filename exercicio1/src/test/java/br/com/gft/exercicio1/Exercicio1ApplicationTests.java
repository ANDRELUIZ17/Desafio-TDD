package br.com.gft.exercicio1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Teste da classe carro! ")
class Exercicio1ApplicationTests {
	Veiculo veiculo = new Veiculo();
	@BeforeAll
	static void setUp(){
	}
	@AfterEach
	void  beforeEachTestMetodo(){
		Veiculo veiculo1 = new Veiculo();
		System.out.println("Executando metodo Beforech");
	}

	@Test
	void acelerandoVeiculo() {
		veiculo.acelerar();
		assertEquals(20, veiculo.getVelocidade());
	}
	@Test
	void acelerandoVeiculo2() {
		veiculo.acelerar();
		veiculo.acelerar();
		assertEquals(40, veiculo.getVelocidade());
	}
	@Test
	void testarCapacidadeTanque() {
		if (veiculo.getLitrosCombustivel() > 0 ) {
			veiculo.abastecer(79);
			assertEquals(79, veiculo.getLitrosCombustivel());
		}
	}
	@Test
	void abastecerVeiculo() {
		veiculo.abastecer(79);
		assertEquals(79, veiculo.getLitrosCombustivel());
	}

	@Test
	void testarFreiodoVeiculo (){
		veiculo.setVelocidade(20);
		veiculo.frear();
		assertEquals(0, veiculo.getVelocidade());
		while (veiculo.getVelocidade() > 0) {
			veiculo.frear();
		}
	}
	@Test
	void testarCorDoVeiculo() {
		veiculo.pintar("Vermelho");
		assertEquals("Vermelho", veiculo.getCor());
	}
	@Test
	void testarComveiculoLigado() {
		veiculo.ligar();
		assertEquals(true, veiculo.isLigado());
	}
	@Test
	void testarVeiculoDesligando(){
		veiculo.desligar();
		assertEquals(false, veiculo.isLigado());
		int isLigado = veiculo.getVelocidade();
		while (isLigado > 0) {
			veiculo.frear();
			isLigado = veiculo.getVelocidade();
			assertEquals(0, isLigado);
		}
	}
}


