package Polimorfismo;

public class Cavalo extends Animal {

	private boolean corre;

	public Cavalo(String nome, String tipo, int idade, String som) {
		super(nome, tipo, idade, som);

	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	void correr() {

		System.out.println("O cavalo " + this.getNome() + " corre.");

	}

}
