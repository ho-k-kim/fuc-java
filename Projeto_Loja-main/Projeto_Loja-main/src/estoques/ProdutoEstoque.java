package estoques;

import services.ProdutoService;

/**
 * Classe responsável por popular o sistema com dados iniciais (Seeding).
 * É útil para testes e demonstrações rápidas.
 */
public class ProdutoEstoque {
	
	/**
	 * Carrega uma lista pré-definida de produtos no "armazém" (banco de dados).
	 */
	public static void uploadEstoque() {
		ProdutoService funcProd = new ProdutoService();
		
		// Produtos de Informática e Escritório
		funcProd.createProd("Notebook", 4499.00, 10, "Notebook Gamer com RTX 3060 e 16GB RAM");
		funcProd.createProd("Mouse", 160.00, 17, "Mouse Óptico Sem Fio 1600 DPI");
		funcProd.createProd("Teclado", 312.00, 15, "Teclado Mecânico RGB Switch Blue");
		funcProd.createProd("Monitor", 1200.00, 8, "Monitor LED 24 polegadas Full HD 75Hz");
		funcProd.createProd("Cadeira Gamer", 899.90, 5, "Cadeira Ergonômica com Reclinação 180 graus");
		
		// Eletrodomésticos
		funcProd.createProd("Geladeira", 3500.00, 22, "Geladeira Frost Free 400 Litros Duplex");
		funcProd.createProd("Maquina de Lavar", 1680.00, 7, "Máquina Automática 12kg com 15 programas");
		funcProd.createProd("Microondas", 567.89, 15, "Microondas 30 Litros com Painel Digital");
		funcProd.createProd("Fogão", 950.99, 17, "Fogão 5 Bocas com Acendimento Automático");
		funcProd.createProd("Ar Condicionado", 2200.00, 12, "Split Inverter 12000 BTUs Quente/Frio");
		
		// Outros Móveis e Utensílios
		funcProd.createProd("Mesa", 489.90, 31, "Mesa de Escritório em L de Madeira");
		funcProd.createProd("Smartphone", 1999.00, 25, "Smartphone Android 128GB Tela 6.5 polegadas");
		funcProd.createProd("Televisão", 2700.00, 10, "Smart TV 4K 55 polegadas LED");
		funcProd.createProd("Cafeteira", 249.00, 20, "Cafeteira Elétrica para 30 Cafezinhos");
		funcProd.createProd("Fone de Ouvido", 120.00, 45, "Fone de Ouvido Bluetooth com Cancelamento de Ruído");
	}
}
