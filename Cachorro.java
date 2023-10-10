package Polimorfismo;

public class Cachorro extends Animal {

	private boolean corre;

	public Cachorro(String nome, String tipo, int idade, String som) {
		super(nome, tipo, idade, som);
		// this.som = som;

	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}

	void correr() {

		System.out.println("O cachorro " + this.getNome() + " corre.");

	}

}
