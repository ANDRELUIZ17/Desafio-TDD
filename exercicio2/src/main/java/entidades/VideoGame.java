package entidades;

import lombok.*;

import java.util.Objects;


@Getter
@Setter
public class VideoGame extends Produto implements Imposto{
    private String marca;
    private String modelo;
    private boolean isLigado;

    public VideoGame() {
        super();
    }

    public VideoGame(String nome, Double preco, Integer quantidade, String marca, String modelo, boolean isLigado) {
        super(nome, preco, quantidade);
        this.marca = marca;
        this.modelo = modelo;
        this.isLigado = isLigado;
    }

    @Override
    public double calcularImposto() {
        if (Objects.equals(getModelo(), "Usado")) {
            return getPreco() + calcularImposto() * 0.25;
        }
        else {
            return getPreco() * 0.45;
        }
    }
}
