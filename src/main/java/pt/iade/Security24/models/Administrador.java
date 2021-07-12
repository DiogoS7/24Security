package pt.iade.Security24.models;

import java.sql.Date;

public class Administrador {

    private int AdministradorID;
    private String Nome;
    private String Email;
    private String NomeUtilizador;
    private String Password;
    private Date DataNascimento;

    public int getUtilizadorID() {
        return UtilizadorID;
    }
    
    public int getPlanoID() {
        return PlanoID;
    }
}
