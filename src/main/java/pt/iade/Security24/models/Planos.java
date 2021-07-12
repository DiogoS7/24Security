package pt.iade.Security24.models;

public class Planos implements Security24 {
    
    public double Preço;
    public String Nome;
    public int Duração;
    public String Descrição;
    protected int PlanoID;

    @Override
    public EstadoPlano getEstadoPlano() {
        return null;
    }

    @Override
    public void getLucroTotal() {

    }

    @Override
    public int getPlanoID() {

        return 0;
    }

    @Override
    public int getUtilizadorID() {

        return 0;
    }
    
}