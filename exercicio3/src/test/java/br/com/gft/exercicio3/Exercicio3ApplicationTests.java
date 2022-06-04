package br.com.gft.exercicio3;

import br.com.gft.exercicio3.entidades.Guerreiro;
import br.com.gft.exercicio3.entidades.Personagem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Exercicio3ApplicationTests {
	Personagem personagem = new Personagem();
	@BeforeAll
	static void setUp(){
		System.out.println("Iniciando teste");
	}
	@BeforeEach
	void beforeEach(){
		System.out.println("Executando metodo");
	}

	@Test
	void testNomePersonagem(){
		String nome = "Tarzan";
		assertEquals ("Tarzan", nome);
	}
	@Test
	void testVidaPersonagem(){
		int vida = 100;
		assertEquals(100, 100);
	}

	@Test
	void testAtaquePesonagem() {
		Random numeroRandomico = new Random();
		int forca = numeroRandomico.nextInt(100);
		for (int i = 0; i > forca; i++) {
			personagem.setForca(forca);
			assertEquals(forca, personagem.getInteligencia());
			assertEquals(12, forca, personagem.getForca());
		}
	}
}
