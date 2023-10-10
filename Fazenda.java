package Polimorfismo;

public class Fazenda extends Animal {

	public static void main(String[] args) {

		Cachorro cao = new Cachorro(null, null, 0, null);
		cao.setNome("Rex");
		cao.setIdade(5);
		cao.setSom("Latir");

		Cavalo horse = new Cavalo(null, null, 0, null);
		horse.setNome("Spirit");
		horse.setIdade(10);
		horse.setSom("Relinchar");

		Preguica preg = new Preguica(null, null, 0, null);
		preg.setNome("Zeze");
		preg.setIdade(15);
		preg.setSom("Gritar");

		Animal gato = new Animal(null, null, 0, null);
		gato.setTipo("Gato");
		gato.setNome("Bola");
		gato.setIdade(3);
		gato.setSom("Miar");

		cao.correr();

		horse.correr();

		preg.subir();

		gato.correr();

		Veterinario.examinar(cao.getNome(), cao.getSom());
		Veterinario.examinar(horse.getNome(), horse.getSom());
		Veterinario.examinar(preg.getNome(), preg.getSom());
		Veterinario.examinar(gato.getNome(), gato.getSom());

	}

}
