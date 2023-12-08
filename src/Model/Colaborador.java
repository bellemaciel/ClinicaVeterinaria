
package Model;


public class Colaborador {
    private static int cont;
    private int id;
    private String login;
    private String senha;

    public Colaborador() {
        Colaborador.cont++;
        this.id = Colaborador.cont;
    }

    public Colaborador(String login, String senha) {
        Colaborador.cont++;
        this.id = Colaborador.cont;
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }
}
