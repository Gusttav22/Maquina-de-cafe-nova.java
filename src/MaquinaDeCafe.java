
public class MaquinaDeCafe extends Bebida {

	public static void main(String[] args) {

		System.out.println("Qual bebida voce deseja ?");

		System.out.println("1 - Café - R$0,50");
		System.out.println("2 - Café Com Leite - R$1,00");
		System.out.println("3 - Capuccino - R$1,50");
		System.out.println("4 - Chá De Limao - R$1,00");
		System.out.println("5 - Àgua Quente - R$ Gratis");

		System.out.println("QUAL PEDIDO O SR(A) DESEJA ?");

		PedidoDoCliente bebidaEscolhidaPeloCliente = new PedidoDoCliente();
		bebidaEscolhidaPeloCliente.setPedidos(3);
		System.out.println("Pedido escolhido = " + bebidaEscolhidaPeloCliente.getPedidos());

		System.out.println("QUAL NIVEL DE AÇUCAR O SR(A) DESEJA ?");
		Bebida açucar = new Bebida();
		açucar.setNivelDeAçucar(3);
		System.out.println("Nivel de açucar escolhido " + açucar.getNivelDeAçucar());

		System.out.println("RESERVATORIO DE CADA BEBIDA !");
		Bebida bebida = new ReservatorioDeAgua();
		bebida.litros(1000);
		bebida.Quantidade(50);
		System.out.println("ML " + bebida.getReservatorio());

		System.out.println("CAIXA !");

		Bebida dinheiro = new Bebida();
		dinheiro.Dinheiro(3.00);
		System.out.println(dinheiro.Compra(1.50));
		System.out.println("Seu troco R$" + dinheiro.getPreço());

	}

}
