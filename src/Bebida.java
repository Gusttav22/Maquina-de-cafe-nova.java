
public class Bebida {

	private double preço;
	private String descricao;
	private int nivelDeAçucar;

	public void Dinheiro(double valor) {
		this.preço += valor;
	}

	public boolean Compra(double valor) {
		if (this.preço >= valor) {
			this.preço -= valor;
			System.out.println("Compra Feita com Sucesso !");
			return true;
		} else {
			System.out.println("Ainda esta faltando !");
			return false;
		}
	}

	public int getNivelDeAçucar() {
		return nivelDeAçucar;
	}

	public void setNivelDeAçucar(int nivelDeAçucar) {
		this.nivelDeAçucar = nivelDeAçucar;
	}

	public double getPreço() {
		return this.preço;
	}

	public void setPreço(double preço) {
		this.preço = preço;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String fazendoOProduto() {
		return "Preparando a receita";
	}

	public void litros(double quantidade) {
		// TODO Auto-generated method stub

	}

	public boolean Quantidade(double quantidade) {
		// TODO Auto-generated method stub
		return false;
	}

	public int getReservatorio() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getPedidos() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setPedidos(int pedidos) {
		// TODO Auto-generated method stub

	}

}
