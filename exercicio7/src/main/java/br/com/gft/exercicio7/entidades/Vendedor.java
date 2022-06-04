package br.com.gft.exercicio7.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vendedor extends Funcionario {
    private double comissao;

    @Override
    public double bonificacao() {
        return this.getSalario() + this.getComissao();
    }
}
