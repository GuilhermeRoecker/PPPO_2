package Banco_de_Dados.model;

public class cliente {

    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private cidade cidade;

    public cliente() {
    }

    public cliente(int id, String nome, int idade, String sexo, Banco_de_Dados.model.cidade cidade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public cidade getCidade() {
        return cidade;
    }

    public void setCidade(cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return getId() + "-" +
                getNome() + "-" +
                getIdade() + "-" +
                getSexo() + "-" +
                getCidade();
    }

}
