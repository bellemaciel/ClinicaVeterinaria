/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria;

/**
 *
 * @author aluno
 */
public class Colaborador extends Pessoa {
    private String funcao;
    
    public Colaborador(){
    
    }
    
    public void iniciarAtendimento(Pet pet, Cliente cliente, int data){
        Atendimento at = new Atendimento(pet,cliente, data);
    }
}
