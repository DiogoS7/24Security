package pt.iade.Security24.models;

public class Planos implements Security24 {
    
    public double Preco;
    public String Nome;
    public String Duracao;
    public String Descricao;
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

    public Planos(double preco, String nome, String duracao, String descricao, int planoID) {
        Preco = preco;
        Nome = nome;
        Duracao = duracao;
        Descricao = descricao;
        PlanoID = planoID;
    }
    
}