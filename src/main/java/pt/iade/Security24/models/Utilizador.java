package pt.iade.Security24.models;

public class Utilizador {
    
    public int UtilizadorID;
    private String Email;
    private String Nome;
    private String DataNascimento;
    private String Password;
    private int NIF;

    public int getUtilizadorID() {

        return UtilizadorID;
    }

    public String getEmail() {
        return Email;
    }

    public String getNome() {
        return Nome;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public String getPassword() {
        return Password;
    }

    public int getNIF() {
        return NIF;
    }

    public Utilizador(int utilizadorID, String email, String nome, String dataNascimento, String password, int nIF) {
        UtilizadorID = utilizadorID;
        Email = email;
        Nome = nome;
        DataNascimento = dataNascimento;
        Password = password;
        NIF = nIF;
    }
}
