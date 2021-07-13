package pt.iade.Security24.models.repositories;

import java.util.ArrayList;

import pt.iade.Security24.models.Administrador;

public class AdministradorRepository {
    private static ArrayList<Administrador> administrador = new ArrayList<>();
    public static void populate() {
        Administrador administrador1 = new Administrador(1, "David", "david_24_admin@gmail.com", "David_Admin", "D_Admin1", "06/09/1974");
        administrador.add(administrador1);
    }

    public static ArrayList<Administrador> getAdministrador() {
        return administrador;
    }

    public Iterable<Administrador> findAll() {
        return administrador;
    }
}
