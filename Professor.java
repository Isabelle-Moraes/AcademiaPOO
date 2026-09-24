/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package academiapoo;

public class Professor extends Pessoa {

    private String especialidade;
    private String cref;

    public Professor(String nome, int idade, String especialidade, String cref) {
        super(nome, idade);
        this.especialidade = especialidade;
        this.cref = cref;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCref() {
        return cref;
    }

    public void setCref(String cref) {
        this.cref = cref;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá! Eu sou um professor da academia.");
    }
}