package pt.iade.Security24.models.repositories;

import java.util.ArrayList;

import pt.iade.Security24.models.Utilizador;

public class UtilizadoresRepository {
    private static ArrayList<Utilizador> utilizador = new ArrayList<>();
    public static void populate() {
        Utilizador utilizador1 = new Utilizador(1, "joaofrancisco@gmail.com", "Joao", "31/12/1998", "JF_24Security", 145678910);
        utilizador.add(utilizador1);
        Utilizador utilizador2 = new Utilizador(2, "mariajoana21@gmail.com", "Maria", "05/10/1979", "MJ20_", 117539512);
        utilizador.add(utilizador2);
        Utilizador utilizador3 = new Utilizador(3, "pauloluis30@gmail.com", "Paulo", "14/03/1981", "PLuis30", 465897103);
        utilizador.add(utilizador3);
        Utilizador utilizador4 = new Utilizador(4, "carlatomas_pessoal@gmail.com", "Carla", "27/01/1972", "#CT24#", 213054689);
        utilizador.add(utilizador4);
    }

    public static ArrayList<Utilizador> getUtilizador() {
        return utilizador;
    }

    public Iterable<Utilizador> findAll() {
        return utilizador;
    }
}