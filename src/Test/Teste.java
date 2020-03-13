package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import builder.Produto;
import builder.Venda;
import builder.VendaBuilder;

class Teste {

	@Test
	void testClientePF() {
		Produto banana = new Produto("Banana", 3.00);
		Venda venda = new VendaBuilder()
				.Data("03/11/2018")
				.ClientePF("Alfred", "23344")
				.Frete(20.00)
				.Item(3, banana)
				.Funcionario("João")
				.Build();
		
		assertEquals("Data: 03/11/2018"
				+ "\nCliente: Alfred | CPF: 23344["
				+ "\nQuantidade:3, produto:Banana | Preço: R$ 3.0]"
				+ "\nFrete: R$ 20.0"
				+ "\nFuncionario: João",venda.toString());
	}

	@Test
	void testClientePJ() {
		Produto smarthphone = new Produto("Smarthphone", 1500.00);
		Venda venda = new VendaBuilder()
				.Data("14/09/2019")
				.ClientePJ("Celular C&A", "02937-9988/2")
				.Frete(49.23)
				.Item(1, smarthphone)
				.Funcionario("Maria")
				.Build();
		assertEquals("Data: 14/09/2019"
				+ "\nCliente: Celular C&A | CNPJ: 02937-9988/2["
				+ "\nQuantidade:1, produto:Smarthphone | Preço: R$ 1500.0]"
				+ "\nFrete: R$ 49.23"
				+ "\nFuncionario: Maria",venda.toString());
	}
	
	@Test
	void testClientePFCompra2Produtos() {
		Produto game = new Produto("GOW4", 59.90);
		Produto periferico = new Produto("Fone", 200.00);
		Venda venda = new VendaBuilder()
				.Data("22/01/2020")
				.ClientePF("Astrôncio", "27591")
				.Frete(50.00)
				.Item(1, game)
				.Item(1, periferico)
				.Funcionario("Alberto")
				.Build();
		
		assertEquals("Data: 22/01/2020"
				+ "\nCliente: Astrôncio | CPF: 27591["
				+ "\nQuantidade:1, produto:GOW4 | Preço: R$ 59.9, "
				+ "\nQuantidade:1, produto:Fone | Preço: R$ 200.0]"
				+ "\nFrete: R$ 50.0"
				+ "\nFuncionario: Alberto",venda.toString());
	}
	
	@Test
	void testClientePJCompra3Produtos() {
		Produto instrumento = new Produto("Guitarra", 600.00);
		Produto equipamento1 = new Produto("Caixa de Som", 350.00);
		Produto equipamento2 = new Produto("Luzes", 80.00);
		Venda venda = new VendaBuilder()
				.Data("13/03/2020")
				.ClientePJ("Tocmix", "75487-8845/6")
				.Frete(90.00)
				.Item(2, instrumento)
				.Item(2, equipamento1)
				.Item(5, equipamento2)
				.Funcionario("Supla")
				.Build();
		
		assertEquals("Data: 13/03/2020"
				+ "\nCliente: Tocmix | CNPJ: 75487-8845/6["
				+ "\nQuantidade:2, produto:Guitarra | Preço: R$ 600.0, "
				+ "\nQuantidade:2, produto:Caixa de Som | Preço: R$ 350.0, "
				+ "\nQuantidade:5, produto:Luzes | Preço: R$ 80.0]"
				+ "\nFrete: R$ 90.0"
				+ "\nFuncionario: Supla",venda.toString());
	}
}
