package pt.iade.Security24.models;

import java.sql.Date;

public class Utilizador {
    
    private int UtilizadorID;
    private String Email;
    private String Nome;
    private Date DataNascimento;
    private String Password;
    private int NIF;

    public int getPlanoID() {
        return PlanoID;
    }
}
