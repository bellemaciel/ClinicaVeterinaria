/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria;
import java.util.ArrayList;

public class Atendimento {
    private int idAtend = 0;
    private int data;
    private Cliente cliente;
    private Pet pet;
    private boolean estado;
    private ArrayList<Procedimento> procedimentos;
    private ArrayList<Produto> produtos;
    
    public Atendimento(Pet pet, Cliente cliente, int data){
    this.idAtend++;
    this.cliente = cliente;
    this.pet = pet;
    this.data = data;
    this.estado = true;
    System.out.println("Atendimento Iniciado");
    }
    
    public void addProduto(Produto p){
    
    }
    
    public void addProcedimento(Procedimento pro){
        
    }
}
