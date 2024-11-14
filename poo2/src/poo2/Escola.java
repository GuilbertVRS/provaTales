package poo2;

public class Escola {

    private String nome;

    private String CNPJ;

    private Sala[] salas;

    private int nSalas;

    public Escola(String nome, String cnpj) {

        this.nome = nome;

        this.CNPJ = cnpj;

        this.salas = new Sala[20]; 

        this.nSalas = 0;  

    }

    public boolean adicionarSala(Sala sala) {

        if (nSalas < 20) {

            salas[nSalas] = sala;  

            nSalas++; 

            System.out.println("Sala " + sala.getNomeSala() + " adicionada com sucesso.");

            return true;

        } else {

            System.out.println("Número máximo de salas atingido.");

            return false;

        }

    }

    public boolean transferirAluno(Sala origem, Sala destino, Pessoa_1 aluno) {

        if (origem.removerAluno(aluno)) { 

            return destino.adicionarAluno(aluno); 

        }

        return false;

    }

    public void listarSalas() {

        for (int i = 0; i < nSalas; i++) {

            salas[i].listarAlunos();

        }

    }

    public String getNome() {

        return nome;

    }

    public String getCnpj() {

        return CNPJ;

    }

    public int getNumSalas() {

        return nSalas;

    }

}