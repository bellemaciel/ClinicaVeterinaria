
package Controle;
import Model.Atendimento;
import Model.Cliente;
import Model.Colaborador;
import Model.Pet;
import Model.Procedimento;
import Model.Produto;
import Model.Fatura;
import java.util.ArrayList;
import View.TelaLogin;



public class ClinicaVeterinaria {
    public static void main(String[] args) {
         ArrayList<Atendimento> atendimento = new ArrayList<>();
        ArrayList<Cliente> cliente = new ArrayList<>();
        ArrayList<Pet> pet = new ArrayList<>();
        ArrayList<Produto> produto = new ArrayList<>();
       
        ArrayList<Procedimento> procedimento = new ArrayList<>();
        ArrayList<Colaborador> usuario = new ArrayList<>();
        usuario.add(new Colaborador("admin", "123"));

        TelaLogin tela = new TelaLogin(usuario, atendimento, cliente, pet, produto, procedimento);
        tela.setVisible(true);
    }
    
}
