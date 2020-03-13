package builder;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private String data;
	private List<ItemVenda> itensVendidos;
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;

	public Venda() {
		itensVendidos = new ArrayList<>();
	}

	public void addItem(ItemVenda itemVenda) {
		itensVendidos.add(itemVenda);
	}
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<ItemVenda> getItensVendidos() {
		return itensVendidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Data: "+this.data
				+this.cliente
				+this.itensVendidos
				+this.frete
				+this.funcionario;
	}

}
