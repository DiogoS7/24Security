package pt.iade.Security24.models.repositories;

import java.util.ArrayList;

import pt.iade.Security24.models.Planos;

public class PlanosRepository {
    private static ArrayList<Planos> planos = new ArrayList<>();
    public static void populate() {
        Planos plano1 = new Planos(50.99, "24Security Low-cost", "Contrato mínimo de 6 meses com possibilidade de renovação", "No plano Low-Cost dispomos de um alarme caseiro com sensores de movimento. \nSe ativado, irá ser reencaminhado um carro da 24Security para avriguar a situação.", 1);
        planos.add(plano1);
        Planos plano2 = new Planos(125, "24Security Medium-price", "Contrato mínimo de 6 meses com possibilidade de renovação", "O plano Medium-price garante 2 camêras de vigilância com vigilância por parte da nossa equipa durante 6 h por dia.", 2);
        planos.add(plano2);
        Planos plano3 = new Planos(220, "24Security Premium", "Contrato mínimo de 6 meses com possibilidade de renovação", "O plano Premium, garante 4 camêras de vigilância com vigilância 24/7 por parte da nossa equipa. \nIncluí também alarme caseiro, com sensores de movimento.", 3);
        planos.add(plano3);
        Planos plano4 = new Planos(115, "24Security Best-offer", "Contrato mínimo de 12 meses com possibilidade de renovação", "O plano-Oferta, garante 2 camêras de vigilância com registos por vídeo caso haja algum ocorrido. \nIncluí também alarme caseiro, com sensores de movimento.", 4);
        planos.add(plano4);
    }

    public static ArrayList<Planos> getPlanos() {
        return planos;
    }

    public Iterable<Planos> findAll() {
        return planos;
    }
}