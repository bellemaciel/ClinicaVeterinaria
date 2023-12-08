
package Model;

public class Produto {
    private static int cont;
    private String nomeProd;
    private int idProd;
    private double valor;
    
    public Produto() {
        Produto.cont++;
        this.idProd = Produto.cont;
    }
    
    public Produto(String nome, double v){
        Produto.cont++;
        this.idProd = Produto.cont;
        nomeProd = nome;
        valor = v;
        idProd++;
        
    }

    public String getNomeProd() {
        return nomeProd;
    }

    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
