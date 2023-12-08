/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.ArrayList;

public class Atendimento {
    private int idAtend = 0;
    private int data;
    private Cliente cliente;
    private Pet pet;
    private double valor;
    private boolean estado;
    private ArrayList<Procedimento> procedimentos;
    private ArrayList<Produto> produtos;
    
    public Atendimento(Pet pet, Cliente cliente, int data, double valor){
    this.idAtend++;
    this.cliente = cliente;
    this.pet = pet;
    this.data = data;
    this.valor = valor;
    this.estado = true;
    System.out.println("Atendimento Iniciado");
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
   
}
