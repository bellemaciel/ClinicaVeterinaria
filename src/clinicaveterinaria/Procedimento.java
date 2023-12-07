/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clinicaveterinaria;

/**
 *
 * @author aluno
 */
public class Procedimento {
    private String nomeProced;
    private int idProced = 0;
    private double valor;
    
    public Procedimento(String nome, double v){
        nomeProced = nome;
        valor = v;
        idProced++;
    }
    
}
