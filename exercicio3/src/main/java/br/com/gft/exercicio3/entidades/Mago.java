package br.com.gft.exercicio3.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
@Data
@AllArgsConstructor
public class Mago extends Personagem{
    private List<String> magias;
    public static final Random numeroRandomico = new Random();

    public Mago() {
        magias = new ArrayList<>();
    }
    @Override
    public void lvlUp() {
        setMana(getMana() + 1);
        setInteligencia(getInteligencia() + 1);
        super.lvlUp();
    }
    public String attack() {
        setForca(getForca()/ 2 * (getInteligencia() * getLevel()) + numeroRandomico.nextInt(180));
        magias.add(" Inteligencia: " + getInteligencia() + " Level: " + getLevel());
        return "Inteligencia: " + getInteligencia() + " Level: " + getLevel() + " Forca: " + getForca();
    }

    public String aprenderMagia(String magia) {
        System.out.println("Magias");
        while (getMana() <= 1) {
            setMana(getMana() - magia.length());
            setInteligencia(getInteligencia() + magia.length());
            System.out.println(magia);
        }
        return "Mana: " + getMana() + " Inteligencia: " + getInteligencia();
    }
}
