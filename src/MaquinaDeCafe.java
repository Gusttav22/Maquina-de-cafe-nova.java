
public class MaquinaDeCafe extends Bebida {

	public static void main(String[] args) {

		System.out.println("Qual bebida voce deseja ?");

		System.out.println("1 - Caf� - R$0,50");
		System.out.println("2 - Caf� Com Leite - R$1,00");
		System.out.println("3 - Capuccino - R$1,50");
		System.out.println("4 - Ch� De Limao - R$1,00");
		System.out.println("5 - �gua Quente - R$ Gratis");

		System.out.println("QUAL PEDIDO O SR(A) DESEJA ?");

		PedidoDoCliente bebidaEscolhidaPeloCliente = new PedidoDoCliente();
		bebidaEscolhidaPeloCliente.setPedidos(3);
		System.out.println("Pedido escolhido = " + bebidaEscolhidaPeloCliente.getPedidos());

		System.out.println("QUAL NIVEL DE A�UCAR O SR(A) DESEJA ?");
		Bebida a�ucar = new Bebida();
		a�ucar.setNivelDeA�ucar(3);
		System.out.println("Nivel de a�ucar escolhido " + a�ucar.getNivelDeA�ucar());

		System.out.println("RESERVATORIO DE CADA BEBIDA !");
		Bebida bebida = new ReservatorioDeAgua();
		bebida.litros(1000);
		bebida.Quantidade(50);
		System.out.println("ML " + bebida.getReservatorio());

		System.out.println("CAIXA !");

		Bebida dinheiro = new Bebida();
		dinheiro.Dinheiro(3.00);
		System.out.println(dinheiro.Compra(1.50));
		System.out.println("Seu troco R$" + dinheiro.getPre�o());

	}

}
