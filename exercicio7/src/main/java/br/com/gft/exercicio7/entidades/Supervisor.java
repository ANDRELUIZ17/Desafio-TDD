package br.com.gft.exercicio7.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Supervisor extends Funcionario {
    private double bonus;

    @Override
    public double bonificacao() {
        return this.getSalario() + this.getBonus();
    }
}
