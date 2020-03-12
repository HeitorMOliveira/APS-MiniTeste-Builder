package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import builder.Produto;
import builder.Venda;
import builder.VendaBuilder;

class Teste {

	@Test
	void testClientePF() {
		Produto banana = new Produto("Banana", 2.00);
		Venda venda = new VendaBuilder()
				.data("10/10/2020")
				.clientePF("José", "000.000.000-00")
				.Frete(20.00)
				.Item(3, banana)
				.Funcionario("João")
				.Build();
		
		assertEquals("Data: 10/10/2020"
				+ "\nFrete: 20.0"
				+ "\nItens: [Produto:Descricao:Banana, preco=2.0],Quantidade: 3]"
				+ "\nFuncionario: João",venda.toString());
	}

}
