package br.com.gft.exercicio2;

import entidades.Livro;
import entidades.Loja;
import entidades.VideoGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@SpringBootApplication
public class Exercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
		Locale.setDefault(Locale.US);

		Livro l1 = new Livro("Java", 100.0, 10, "Paulo Silveira", "Educativo", 1000);
		Livro l2 = new Livro("Senhor dos Aneis", 200.0, 2, "J.R.R Tolkien", "Fantasia", 400);
		Livro l3 = new Livro("Javascript", 50.0, 2, "Mozilla", "Educativo", 100);

		System.out.println();
		VideoGame ps4 = new VideoGame("PS4", 1800.0, 40, "SONY", "PS4", false);
		VideoGame ps4Usado = new VideoGame("PS4_Usado", 400.0, 1, "SONY", "Diversão", true);
		VideoGame xbox = new VideoGame("Xbox", 2000.0, 40, "Microsoft", "Diversão", false);

		List<Livro> livros = new ArrayList<>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);

		List<VideoGame> videoGames = new ArrayList<>();
		videoGames.add(ps4);
		videoGames.add(ps4Usado);
		videoGames.add(xbox);

		Loja americanas = new Loja("Americanas", "123456789", livros, videoGames);
		l1.calcularImposto();
		l2.calcularImposto();
		l3.calcularImposto();


		ps4.calcularImposto();
		ps4Usado.calcularImposto();
		xbox.calcularImposto();

		americanas.listaLivros();
		americanas.listaVideoGame();
		americanas.calcularPatrimonio();
		System.out.println("Livros");
		System.out.println("Quantidade a pagar R$: " + l1.getQuantidadeAPagar() + " Reais");
		System.out.println("Quantidade a pagar R$: " + l2.getQuantidadeAPagar() + " Reais");
		System.out.println("Quantidade a pagar R$: " + l3.getQuantidadeAPagar() + " Reais");
		System.out.println();
		System.out.println("Video Games");
		System.out.println("Quantidade a pagar R$: " + ps4.getPreco() + " Reais");
		System.out.println("Quantidade a pagar R$: " + ps4Usado.getPreco() + " Reais");
		System.out.println("_______________");
		System.out.println("Preço e o imposto do console Xbox: ");
		System.out.println("Quantidade a pagar R$: " + xbox.getPreco() + " Reais");
		System.out.println("Quantidade de imposto: R$: " + xbox.calcularImposto() + " Reais");
		System.out.println("---------------");
		System.out.println("Preço e o imposto do console PS4: ");
		System.out.println("Quantidade a pagar R$: " + ps4.getPreco() + " Reais");
		System.out.println("Quantidade de imposto: R$: " + ps4.calcularImposto() + " Reais");
		System.out.println("---------------");
		System.out.println("Preço e o imposto do console PS4 usado: ");
		System.out.println("Quantidade a pagar R$: " + ps4Usado.getPreco() + " Reais");
		System.out.println("Quantidade de imposto: R$: " + ps4Usado.calcularImposto() + " Reais");

		System.out.println("O valor total do patrimonio da loja é R$: " + americanas.calcularPatrimonio());
	}
}
