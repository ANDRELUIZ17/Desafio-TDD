package br.com.gft.exercicio2;

import entidades.Livro;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class test_Classe_Livro {
	Livro livro = new Livro();

	@BeforeAll
	static void setUp(){
	}
	@AfterAll
	static void cleanUp() {
		System.out.println("Executando Clean método!");
	}
	@BeforeEach
	void beforeEach() {
		Livro livro1 = new Livro();
		System.out.println("Executando o método beforeEach");
	}
	@AfterEach
	void afetrEach () {
		System.out.println("Executando método afterEach");
	}
	@Test
	void testarLivro_Tema_educativo() {
		livro.setTema("Educativo");
		assertEquals(0, livro.calcularImposto());
		List<String> list = List.of("Educativo");
		assertEquals(0, livro.calcularImposto());

		for (String tema : list) {
			assertEquals(0, livro.calcularImposto());
		}
	}
	@Test
	void testarClasseLivroAutorTemaQuantidadePagar() {
		String autor;
		String tema;
		int quantidadeApagar;
		autor = "Paulo Silveira";
		tema = "Educativo";
		quantidadeApagar = 1000;
		Livro livro1 = new Livro("Paulo Silveira", 100.0, 1000, autor,tema, quantidadeApagar);
		assertEquals(autor, livro1.getAutor());
		assertEquals(tema, livro1.getTema());
		assertEquals(quantidadeApagar, livro1.getQuantidade());

	}
	@Test
	void testarLivroSobreTemaFantasia_deveRetornarImposto() {
		Livro livro1 = new Livro("Senhor dos Aneis", 200.0, 1, "J.R.R Tlkien", "Fantasia", 200);
		livro.setTema("Fantasia");
		assertEquals(20, 20);
	}
}
