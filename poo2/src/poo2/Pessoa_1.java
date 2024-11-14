package poo2;

public class Pessoa_1 {
    private String nome;
    private int idade;
    private String cpf;
    private Enderoço endereco;
    public Pessoa_1(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    public Pessoa_1(String nome, int idade, String cpf, Enderoço endereco) {
        this(nome, idade, cpf); 
        this.endereco = endereco;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public Enderoço getEndereco() {
        return endereco;
    }
}