package Banco_de_Dados.model;

public class cidade {

    private int id;
    private String uf;
    private String nome;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public cidade() {

    }

    public cidade(int id, String nome,String uf) {
        this.id = id;
        this.uf = uf;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return getId() + " - " +
                getUf() + "-" +
                getNome();
    }

}
