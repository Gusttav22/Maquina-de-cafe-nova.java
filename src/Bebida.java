
public class Bebida {

	private double pre�o;
	private String descricao;
	private int nivelDeA�ucar;

	public void Dinheiro(double valor) {
		this.pre�o += valor;
	}

	public boolean Compra(double valor) {
		if (this.pre�o >= valor) {
			this.pre�o -= valor;
			System.out.println("Compra Feita com Sucesso !");
			return true;
		} else {
			System.out.println("Ainda esta faltando !");
			return false;
		}
	}

	public int getNivelDeA�ucar() {
		return nivelDeA�ucar;
	}

	public void setNivelDeA�ucar(int nivelDeA�ucar) {
		this.nivelDeA�ucar = nivelDeA�ucar;
	}

	public double getPre�o() {
		return this.pre�o;
	}

	public void setPre�o(double pre�o) {
		this.pre�o = pre�o;
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
