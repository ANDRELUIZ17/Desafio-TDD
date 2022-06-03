package entidades;

import lombok.*;

@Getter
@Setter

public class Livro extends Produto implements Imposto{
    private String autor;
    private String tema;
    private int quantidadeAPagar;

    public Livro(String nome, Double preco, Integer quantidade, String autor, String tema, int quantidadeAPagar) {
        super(nome, preco, quantidade);
        this.autor = autor;
        this.tema = tema;
        this.quantidadeAPagar = quantidadeAPagar;
    }

    public Livro() {

    }

    @Override
    public double calcularImposto() {

        if (tema.equals("Educativo")) {
            return 0;
        }
        else {
          quantidadeAPagar = (int) (quantidadeAPagar + getPreco() * 0.1);
          return getPreco() * 0.1;
        }
    }
}
