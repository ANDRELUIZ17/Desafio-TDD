package br.com.gft.exercicio1;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Veiculo {
    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private Float km;
    private boolean isLigado;
    private int litrosCombustivel;
    private int velocidade;
    private Double preco;

    public void acelerar() {
        this.velocidade += 20;
    }
    public void abastecer(int combustivel) {
        if (combustivel > 60) {
            System.out.println("Utrapassou a capacidade do tanque! ");
        }
        this.litrosCombustivel = combustivel;
    }
    public void frear() {
        if (velocidade == 0) {
            System.out.println("O veículo está parado! ");
        }
        this.velocidade -= 20;
    }
    public void pintar (String cor) {
        this.cor = cor;
    }
    public void ligar() {
        if (isLigado){
            System.out.println("Veiculo ligado! ");
        }
        else if (isLigado) {
            System.out.println("Desligado! ");
        }
        else {
            this.isLigado = true;
        }
    }
    public void desligar() {
        if (isLigado == false && velocidade == 0) {
            System.out.println("Pode desligar! ");
            this.isLigado = false;
        }
        else if (isLigado == false && velocidade > 0) {
            System.out.println("Veiculo esta ligado, não pode desligar! ");
            this.isLigado = true;
        }
    }
}
