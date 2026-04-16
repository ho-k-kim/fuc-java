package models;
//EXERCÍCIO 1 — Criar a Classe Produto com Encapsulamento
public class Produto {

	 	private String nome;
	    private double valor;
	    private int unidades;
	    
	    public String getNome() {
	        return this.nome;
	    }
	    // Getter para double
	    public double getValor() {
	        return this.valor;
	    }
	    public int getUnidade() {
	        return this.unidades;
	    }
	    public void setNome(String nomeProduto) {
	        this.nome = nomeProduto;
	    }
	    public void setValor(double valorProduto) {
	        if (valorProduto >= 0) this.valor = valorProduto;
	    }
	    
	    public void setUnidades(int unidadesProduto) {
	        if (unidadesProduto >= 0) this.unidades = unidadesProduto;
	    }
	
}
