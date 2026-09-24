/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiapoo;

public class Aluno extends Pessoa {

    private int matricula;
    private String objetivo;

    public Aluno(String nome, int idade, int matricula, String objetivo) {
        super(nome, idade);
        this.matricula = matricula;
        this.objetivo = objetivo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá! Eu sou um aluno da academia.");
    }

    public void cadastrar() {
        System.out.println("Aluno cadastrado.");
    }

    public void cadastrar(String objetivo) {
        System.out.println("Aluno cadastrado com objetivo: " + objetivo);
    }
}