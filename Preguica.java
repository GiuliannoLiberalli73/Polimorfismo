package Polimorfismo;

public class Preguica extends Animal {

	private boolean sobe;

	public Preguica(String nome, String tipo, int idade, String som) {
		super(nome, tipo, idade, som);

	}

	public boolean isSobe() {
		return sobe;
	}

	public void setSobe(boolean sobe) {
		this.sobe = sobe;
	}

	void subir() {

		System.out.println("A preguica " + this.getNome() + " sobe.");

	}

}
