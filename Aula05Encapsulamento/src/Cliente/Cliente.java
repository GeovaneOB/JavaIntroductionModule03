package Cliente;

public class Cliente {
	
	// Definindo variáveis.
	private String nome;
	private int idade;
	
	// Metódo de inicialização (Construtor).
	public Cliente(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	// Métodos de acesso (Get's and Setter's).
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

	// Metódo toString que facilita a exibição dos dados no terminal, economizando linhas de código.
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", idade=" + idade + "]";
	}
	
	
	
}
