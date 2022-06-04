package br.com.gft.exercicio7;

import br.com.gft.exercicio7.entidades.Gerente;
import br.com.gft.exercicio7.entidades.Supervisor;
import br.com.gft.exercicio7.entidades.Vendedor;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@DisplayName("Testando as operações do Gerente")
class ApplicationTestsFuncionario {
    Gerente gerente = new Gerente();

    @BeforeAll
    static void setUp() {
        System.out.println("Testando o método BeforeAll");
    }
    @AfterAll
    static void tearDown() {
        System.out.println("Testando o método AfterAll");
    }
    @BeforeEach
    void BeforEachTestMetodo() {
        System.out.println("Testando o método BeforeEach");
    }
    @AfterEach
    void AfterEachTestMetodo() {
        System.out.println("Testando o método AfterEach");
    }
    @Test
    void testBonicacaoGerente() {
        System.out.println("Testando o método testBonicacaoGerente");
        gerente.setSalario(1000.0);
        gerente.setGratificacao(100);
        assertEquals(1100, gerente.bonificacao());
    }
    @Test
    void testBonicacaoSupervisor() {
        System.out.println("Testando o método testBonicacaoSupervisor");
        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(1000.0);
        supervisor.setBonus(100);
        assertEquals(1100, supervisor.bonificacao());
    }
    @Test
    void testBonicacaoVendedor() {
        System.out.println("Testando o método testBonicacaoVendedor");
        Vendedor vendedor = new Vendedor();
        vendedor.setSalario(1000.0);
        vendedor.setComissao(100);
        assertEquals(1100, vendedor.bonificacao());
    }
    @Test
    void testSalarioTotalGerente(){
        System.out.println("Testando o método testSalarioTotalGerente");
        gerente.setSalario(15000.00);
        gerente.setGratificacao(10000);
        assertEquals(25000.0, gerente.getSalario() + gerente.getGratificacao());
    }
    @Test
    void testSalarioTotalSupervisor(){
        System.out.println("Testando o método testSalarioTotalSupervisor");
        Supervisor supervisor = new Supervisor();
        supervisor.setSalario(7500.00);
        supervisor.setBonus(5000);
        assertEquals(12500.0, supervisor.getSalario() + supervisor.getBonus());
    }
    @Test
    void testSalarioTotalVendedor(){
        System.out.println("Testando o método testSalarioTotalVendedor");
        Vendedor vendedor = new Vendedor();
        vendedor.setSalario(5000.00);
        vendedor.setComissao(3000);
        assertEquals(8000.0, vendedor.getSalario() + vendedor.getComissao());
    }

}
