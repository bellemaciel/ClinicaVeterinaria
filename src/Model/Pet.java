/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author aluno
 */
public class Pet {
    private static int cont;
    private int id;
    private String nome;
    private int idade;
    private char sexo;
    private String especie;
    private Cliente cliente;
    
    public Pet() {
        Pet.cont++;
        this.id = Pet.cont;
    }
    
    public Pet(Cliente cliente, String especie, String nome, int idade, char sexo) {
        Pet.cont++;
        this.id = Pet.cont;
        this.cliente = cliente;
        this.especie = especie;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    public void getDados(){
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo+"\nEspécie: "+especie+"\nidPet: "+id);
        
    }
    
}
