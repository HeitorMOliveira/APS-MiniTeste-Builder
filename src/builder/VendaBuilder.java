package builder;

public class VendaBuilder {
	private Venda venda;
	
	
	public VendaBuilder() {
		venda = new Venda();
	}
	
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}
	
	public VendaBuilder clientePF(String nome, String cpf) {
		venda.setCliente(new ClientePF(nome, cpf));
		return this;
	}
	
	public VendaBuilder item(int quant, Produto produto) {
		venda.addItem(new ItemVenda(quant, produto));
		return this;
	}

	public VendaBuilder Frete(double valor) {
		venda.setFrete(valor);
		return this;
	}

	public VendaBuilder Item(int quant, Produto produto) {
		venda.addItem(new ItemVenda(quant, produto));
		return this;
	}

	public VendaBuilder Funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return null;
	}

	public Venda Build() {
		return venda;
	}
}
