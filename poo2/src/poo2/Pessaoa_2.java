package poo2;

public class Pessaoa_2 {

	    public static void main(String[] args) {
	    	Pessoa_1 pessoa1 = new Pessoa_1(null, 0, null);
	    	Pessoa_1 pessoa2 = new Pessoa_1(null, 0, null);

	        System.out.println("Pessoa 1:");
	        System.out.println("Nome: " + pessoa1.getNome());
	        System.out.println("Idade: " + pessoa1.getIdade());
	        System.out.println("CPF: " + pessoa1.getCpf());

	        System.out.println("\nPessoa 2:");
	        System.out.println("Nome: " + pessoa2.getNome());
	        System.out.println("Idade: " + pessoa2.getIdade());
	        System.out.println("CPF: " + pessoa2.getCpf());
	    }

		public String getNome() {
			return null;
		}
	}