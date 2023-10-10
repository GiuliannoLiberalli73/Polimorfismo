package Polimorfismo;

public class Veterinario extends Animal {


    public Veterinario(String no, String som, String tipo, int idade) {
        super(no, tipo, idade, som);

    }

    static void examinar(String no, String som) {

        System.out.println("Examinado o " + no + " e ele faz o som de " + som);
    }


}
