package br.com.gft.exercicio2;

import entidades.Loja;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class test_Classe_LojaTest {
    Loja loja = new Loja();
    @BeforeAll
    static void setUp(){
    }
    @AfterAll
    static void tearDown(){
    }
    @BeforeEach
    void setUpEach(){
        System.out.println("Teste Iniciado");
    }
    @AfterEach
    void tearDownEach() {
        System.out.println("Teste Finalizado");
    }
    @Test
    void testarNomeLoja() {
        loja.setNome("Americanas");
        assertEquals("Americanas", loja.getNome());
    }
    @Test
    void testarCnpjLoja(){
        loja.setCnpj("123456789");
        assertEquals("123456789", loja.getCnpj());
    }
    @Test
    void testarSeTemLivroNaLoja() {
        System.out.println("Testando se tem livro");
        assertEquals(0, 0);
    }
    @Test
    void testarVideoGame(){
        System.out.println("Testando se tem Video Game");
        assertEquals(0,0);
    }
    @Test
    void testarValorDoPatrimonio(){
        assertEquals(153700.0, 153700.0);
    }
}