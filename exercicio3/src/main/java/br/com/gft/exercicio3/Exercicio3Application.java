package br.com.gft.exercicio3;

import br.com.gft.exercicio3.entidades.Guerreiro;
import br.com.gft.exercicio3.entidades.Mago;
import br.com.gft.exercicio3.entidades.Personagem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class Exercicio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);
		Scanner scanner = new Scanner(System.in);
		List<Personagem> personagens = new ArrayList<>();

		System.out.println("Escolha a opção desejada (m/g):");
		char opcao = scanner.next().charAt(0);
		for (int i = 1; i <= opcao; i++) {
			if (opcao == 'm') {
				Mago mago = new Mago();
				System.out.println("Digite o nome do mago: ");
				mago.setNome(scanner.next());
				System.out.println("Digite o level do mago: ");
				mago.setLevel(scanner.nextInt());
				System.out.println("Digite a inteligencia do mago: ");
				mago.setInteligencia(scanner.nextInt());
				System.out.println("Digite o mana do mago: ");
				mago.setMana(scanner.nextInt());
				System.out.println("Digite a vida do mago: ");
				mago.setVida(scanner.nextInt());
				personagens.add(mago);
				mago.attack();
				System.out.println("Nome: " + mago.getNome() + " Level: "
						+ mago.getLevel() + " Inteligencia: "
						+ mago.getInteligencia() + " Mana: "
						+ mago.getMana() + " Forca: "
						+ mago.getVida());
				System.out.println(mago.attack());
				System.out.println(mago.aprenderMagia("Sim"));
				break;

			} else if (opcao == 'g') {
				Guerreiro guerreiro = new Guerreiro();
				System.out.println("Digite o nome do guerreiro: " + "\n");
				scanner.nextLine();
				guerreiro.setNome(scanner.next());
				System.out.println("Digite o level do guerreiro: ");
				guerreiro.setLevel(scanner.nextInt());
				System.out.println("Digite a forca do guerreiro: ");
				guerreiro.setForca(scanner.nextInt());
				System.out.println("Digite a vida do guerreiro: ");
				guerreiro.setVida(scanner.nextInt());
				personagens.add(guerreiro);
				guerreiro.attack();
				System.out.println("Nome: " + guerreiro.getNome() + " Level: "
						+ guerreiro.getLevel() + " Forca: "
						+ guerreiro.getForca() + " Vida: "
						+ guerreiro.getMana()  + " Mana: "
						+ guerreiro.getVida());
				System.out.println(guerreiro.attack());
				System.out.println(guerreiro.aprenderHabilidade("Sim"));
				break;
			} else {
				System.out.println("Opção inválida");
			}
		}

		scanner.close();
	}

}
