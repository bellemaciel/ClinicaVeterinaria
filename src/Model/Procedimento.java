
package Model;


public class Procedimento {
    private static int cont;
    private String nomeProced;
    private int idProced;
    private double valor;
    
    
    public Procedimento() {
        Procedimento.cont++;
        this.idProced = Procedimento.cont;
    }
    
    public Procedimento(String nome, double v){
        Procedimento.cont++;
        nomeProced = nome;
        valor = v;
        this.idProced = Procedimento.cont;
    }

    public String getNomeProced() {
        return nomeProced;
    }

    public void setNomeProced(String nomeProced) {
        this.nomeProced = nomeProced;
    }

    public int getIdProced() {
        return idProced;
    }

    public void setIdProced(int idProced) {
        this.idProced = idProced;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
