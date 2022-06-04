package br.com.gft.exercicio7.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Gerente extends Funcionario{
    private double gratificacao;

    @Override
    public double bonificacao(){
        return this.getSalario() + this.getGratificacao() ;
    }

}
