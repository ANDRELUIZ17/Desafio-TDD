package br.com.gft.exercicio7;

import br.com.gft.exercicio7.entidades.Gerente;
import br.com.gft.exercicio7.entidades.Supervisor;
import br.com.gft.exercicio7.entidades.Vendedor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio7Application {

    public static void main(String[] args) {
        SpringApplication.run(Exercicio7Application.class, args);

        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setIdade(30);
        gerente.setSalario(15000.00);
        gerente.setGratificacao(10000.00);
        System.out.println("Ganho do Gerente: ");
        System.out.println("O gerente: " + gerente.getNome()
                + "\n"
                + "Recebeu o Salário de: " +  gerente.getSalario() + " Reais"
                + "\n"
                + "Recebeu " + gerente.getGratificacao() + " de bonificação.");
        gerente.bonificacao();
        System.out.printf("Total do salario: %.2f", gerente.getSalario() + gerente.getGratificacao());

        System.out.println("\n");
        Supervisor supervisor = new Supervisor();

        supervisor.setNome("Maria");
        supervisor.setIdade(37);
        supervisor.setSalario(7500.00);
        supervisor.setBonus(5000.00);

        System.out.println("Ganho do Supervisor: ");
        System.out.println("O Supervisor: " + supervisor.getNome()
                + "\n"
                + "Recebeu o Salário de: " +  supervisor.getSalario() + " Reais"
                + "\n"
                + "Recebeu " + supervisor.getBonus()+ " de bonificação.");
        supervisor.bonificacao();
        System.out.printf("Total do salario: %.2f", supervisor.getSalario() + supervisor.getBonus());

        System.out.println("\n");
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Pedro");
        vendedor.setIdade(25);
        vendedor.setSalario(5000.00);
        vendedor.setComissao(3000.00);
        System.out.println("Ganho do Vendedor: ");
        System.out.println("O Vendedor: " + vendedor.getNome()
                + "\n"
                + "Recebeu o Salário de: " +  vendedor.getSalario() + " Reais"
                + "\n"
                + "Recebeu " + vendedor.getComissao() + " de bonificação.");
        vendedor.bonificacao();
        System.out.printf("Total do salario: %.2f", vendedor.getSalario() + vendedor.getComissao());


    }

}
