package br.com.gft.exercicio3.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Random;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guerreiro extends Personagem{
    private List<String> habilidades;
    private static final Random numeroRandomico = new Random();

    @Override
    public void lvlUp() {
        setVida(getVida() + 1);
        setForca(getForca() + 1);
        super.lvlUp();
    }

    public String attack() {

        setForca(getForca()/ 2 * (getForca() * getLevel()) + numeroRandomico.nextInt(180));
        habilidades.add(" Força: " + getForca() + " Level: " + getLevel());
        return "Inteligencia: " + getHabilidades() + " Level: " + getLevel();


    }
    public String aprenderHabilidade(String habilidade) {
        System.out.println("Habilidades");
        if (getMana() <= 1) {
            setMana(getMana() - habilidade.length());
            setInteligencia(getInteligencia() + habilidade.length());
            System.out.println(habilidade);
        }
        return "Mana: " + getMana() + " Inteligencia: " + getInteligencia();
    }
}
