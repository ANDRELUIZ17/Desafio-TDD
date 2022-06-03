package br.com.gft.exercicio2;

import entidades.Produto;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class test_Classe_ProdutoTest {
    private Produto produto;

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
    void tearDownEach(){
        System.out.println("Test Finalizado");
    }
    @Test
    void testPreco(){
        // não consegui testar quando a clase é abstrata
    }
}