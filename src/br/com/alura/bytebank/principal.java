package br.com.alura.bytebank;

import br.com.alura.bytebank.model.Funcionario;

import java.time.LocalDate;

public class principal {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao bytebank");
        Funcionario jose = new Funcionario("José", 1, LocalDate.of(1990, 2, 12));
        System.out.println(jose);
    }
}
