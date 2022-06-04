package br.com.gft.exercicio3.entidades;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private Float xp;
    private int inteligencia;
    private int forca;
    private int level;

    public void lvlUp(){

    }
}
