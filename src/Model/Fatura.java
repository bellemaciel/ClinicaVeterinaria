/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Fatura {
    
    private int idFatura;
    private int dataFat;
    private ArrayList<Procedimento> procedimentos;
    private ArrayList<Produto> produtos;
    private Cliente cliente;
    
    public Fatura(){
    }
    
}
