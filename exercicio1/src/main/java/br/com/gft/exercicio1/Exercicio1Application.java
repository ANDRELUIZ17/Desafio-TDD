package br.com.gft.exercicio1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio1Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio1Application.class, args);
		System.out.println("-------------");
		Veiculo veiculo = new Veiculo();
		System.out.println("Dados do veiculo: ");
		System.out.println("Acelerando o veiculo: de 50 foi á: ");
		veiculo.setVelocidade(50);
		veiculo.acelerar();
		System.out.println(veiculo.getVelocidade() + " Km ");

		System.out.println("--------------");
		System.out.println("Combustivel: ");
		veiculo.abastecer(79);
		System.out.println(veiculo.getLitrosCombustivel());

		System.out.println("---------------");
		System.out.println("Diminuindo a velocidade: ");
		veiculo.setVelocidade(20);
		veiculo.frear();
		System.out.println(veiculo.getVelocidade());

		System.out.println("--------------");
		System.out.println("Cor do veiculo: ");
		veiculo.pintar("Vermelho");
		System.out.println(veiculo.getCor());

		System.out.println("-------------");
		System.out.println("Velocidade atual: ");
		System.out.println(veiculo.getVelocidade() + " km ");

		System.out.println("-------------");
		System.out.println("O veiculo está ligado? ");
		System.out.println("Sua velocidade é de 30 km");
		veiculo.ligar();
		System.out.println(veiculo.isLigado());

		System.out.println("-------------");
		System.out.println("Desligar o veículo! ");
		veiculo.setVelocidade(0);
		veiculo.isLigado();
		veiculo.desligar();
		System.out.println(veiculo.isLigado() + "\n" + "Veículo desligado!!!");

	}

}
