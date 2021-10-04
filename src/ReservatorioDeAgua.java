
public class ReservatorioDeAgua extends Bebida {

	private int reservatorio;

	@Override

	public void litros(double quantidade) {
		this.reservatorio += quantidade;
		if (this.reservatorio <= 1000) {
			return;
		} else {
			return;
		}
	}

	@Override
	public boolean Quantidade(double quantidade) {
		if (this.reservatorio <= 1000) {
			this.reservatorio -= quantidade;
			System.out.println("Ainda tem agua no reservatorio !");
			return true;

		} else {
			System.out.println("Esta faltando agua no reservatorio !");
			return false;
		}
	}

	@Override
	public int getReservatorio() {
		return reservatorio;
	}

}
