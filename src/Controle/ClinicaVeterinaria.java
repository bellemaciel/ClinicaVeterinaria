
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
        String raca = null;
        ArrayList<Procedimento> servico = new ArrayList<>();
        ArrayList<Colaborador> usuario = new ArrayList<>();
        usuario.add(new Colaborador("admin", "admin"));

        TelaLogin tela = new TelaLogin(usuario, atendimento, cliente, pet, produto, raca, servico);
        tela.setVisible(true);
    }
    
}
