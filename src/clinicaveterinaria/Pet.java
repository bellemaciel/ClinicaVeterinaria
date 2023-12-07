/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria;

/**
 *
 * @author aluno
 */
public class Pet {
    private String nomePet;
    private int idade;
    private char sexo;
    private String especie;
    private int idPet;
    
    public Pet(){
    }
    
    public void getDados(){
        System.out.println("Nome: "+nomePet+"\nIdade: "+idade+"\nSexo: "+sexo+"\nEspécie: "+especie+"\nidPet: "+idPet);
        
    }
    
}
