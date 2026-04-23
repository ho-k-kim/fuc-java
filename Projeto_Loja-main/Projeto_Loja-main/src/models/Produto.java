package models;

/**
 * Classe que representa a entidade Produto no sistema.
 * É um modelo (Model) que define as propriedades de um produto.
 */
public class Produto {
	// Atributos privados para garantir o encapsulamento
	private final int ID;
	private String nome;
	private double valor;
	private int unidades;
	private String descricao;
	
	// Contador estático para gerar IDs únicos incrementais
	private static int contador = 0;
	
	/**
	 * Construtor padrão.
	 * Cada vez que um objeto é instanciado, um novo ID é gerado automaticamente.
	 */
	public Produto() {
		this.ID = ++contador;
	}
	
	// Getters e Setters: Métodos de acesso para manipular atributos privados
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getID() {
		return ID;
	}

	/**
	 * Representação textual do objeto Produto.
	 * Utilizado para imprimir as informações do produto de forma legível.
	 */
	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", valor= R$" + valor + ", unidades=" + unidades + ", descricao=" + descricao
				+ "]";
	}
}

