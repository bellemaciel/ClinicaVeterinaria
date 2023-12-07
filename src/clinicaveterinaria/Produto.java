/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria;

/**
 *
 * @author aluno
 */
public class Produto {
    private String nomeProd;
    private int idProd= 0;
    private double valor;
    
    public Produto(String nome, double v){
    
        nomeProd = nome;
        valor = v;
        idProd++;
        
    }
    
}
