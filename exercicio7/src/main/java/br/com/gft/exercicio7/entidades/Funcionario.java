package br.com.gft.exercicio7.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    private String nome;
    private Integer idade;
    private Double salario;

    public double bonificacao(){
        return this.salario * 0.10;
    }
}
