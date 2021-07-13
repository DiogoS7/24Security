package pt.iade.Security24.models;

public class Administrador {

    public int AdministradorID;
    private String Nome;
    private String Email;
    private String NomeUtilizador;
    private String Password;
    private String DataNascimento;

    public int getAdministradorID() {
        return AdministradorID;
    }

    public String getNome() {
        return Nome;
    }

    public String getEmail() {
        return Email;
    }

    public String getNomeUtilizador() {
        return NomeUtilizador;
    }

    public String getPassword() {
        return Password;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public Administrador(int administradorID, String nome, String email, String nomeUtilizador, String password,
            String dataNascimento) {
        AdministradorID = administradorID;
        Nome = nome;
        Email = email;
        NomeUtilizador = nomeUtilizador;
        Password = password;
        DataNascimento = dataNascimento;
    }

}
