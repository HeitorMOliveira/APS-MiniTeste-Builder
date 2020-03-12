package builder;

import java.util.ArrayList;
import java.util.List;

public class Venda {
	private String data;
	private List<ItemVenda> itensVendidos = new ArrayList<>();
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;

	public Venda() {
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

	public void setItensVendidos(List<ItemVenda> itensVendidos) {
		this.itensVendidos = itensVendidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemVenda itemVenda) {
		itensVendidos.add(itemVenda);
	}

	public void setFrete(double valor) {
		frete.setValor(valor);
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFuncionario(Funcionario funcionario) {
		funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Venda [data=" + data + ", itensVendidos=" + itensVendidos + ", cliente=" + cliente + ", funcionario="
				+ funcionario + ", frete=" + frete + "]";
	}
	
	

}
