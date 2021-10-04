
public class PedidoDoCliente extends Bebida {

	private int Pedidos;

	@Override
	public int getPedidos() {
		return Pedidos;
	}

	@Override
	public void setPedidos(int pedidos) {
		if (this.Pedidos >= 5) {
			this.Pedidos -= 5;
			return;
		}
		Pedidos = pedidos;
	}

}
