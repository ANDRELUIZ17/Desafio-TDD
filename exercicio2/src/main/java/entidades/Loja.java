package entidades;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros;
    private List<VideoGame> videoGame;

    public void listaLivros() {
        if (!livros.isEmpty()) {
            System.out.println("A Loja Americas possui este livro para a venda!");
            for(Livro livro : livros) {
                System.out.println("Título: " + livro.getNome() + "\n" + "Preço: "
                + livro.getPreco() + "\n" + "Quantidade: " + livro.getQuantidade());
            }

        }
        else {
            System.out.println("A loja não tem o livro no seu estoque. ");
        }
    }
    public void listaVideoGame() {
        if (!videoGame.isEmpty()) {
            System.out.println();
            System.out.println("A loja Americanas possui estes video games para venda: ");
            for (VideoGame videoGame : videoGame) {
                System.out.println("Nome: " + videoGame.getNome() + "\n" + "Preço: "   + videoGame.getPreco() + "\n"
                + "Quantidade: " + videoGame.getQuantidade());
            }
        }
        else {
            System.out.println("A loja não tem video games no estoque. ");
        }
    }
    public double calcularPatrimonio () {
        double soma = 0;
        for (Livro livro : livros) {
            soma += livro.getPreco() * livro.getQuantidade();
        }
        for (VideoGame videoGame : videoGame) {
            soma += videoGame.getPreco() * videoGame.getQuantidade();
        }
        return soma;
    }
}

