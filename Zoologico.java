package Polimorfismo;

public class Zoologico extends Animal {

    private String nome;
    private int idade;
    private String som;
    private boolean corre;
    private String tipo;
    private static String correu = "Sim";

    public Zoologico(String nome, int idade, String som, String tipo, boolean corre) {

        super(nome, som, idade, tipo);
        this.nome = nome;
        this.idade = idade;
        this.som = som;
        this.tipo = tipo;
        this.corre = corre;

    }

    public static void zoo() {

    }

    public String toString() {
        return "Animal: " + this.nome + " - idade: " + this.idade + " - som: " + this.som + " - tipo: "
                + this.tipo
                + " - corre? "
                + correu;
    }

    public static void main(String[] args) {

        Zoologico[] zoo = new Zoologico[10];

        zoo[0] = new Zoologico("Zebra", 8, "Zurra", "Mamifero", true);
        zoo[1] = new Zoologico("Leao", 18, "Urra", "Mamifero", true);
        zoo[2] = new Zoologico("Cobra", 3, "Chia", "Reptil", false);
        zoo[3] = new Zoologico("Macaco", 6, "Grita", "Mamifero", true);
        zoo[4] = new Zoologico("Golfinho", 10, "Assobio", "Mamifero", false);
        zoo[5] = new Zoologico("Pinguim", 4, "Grita", "Ave", true);
        zoo[6] = new Zoologico("Crocodilo", 8, "Rosna", "Reptil", true);
        zoo[7] = new Zoologico("Tubarao", 7, "Nao emite", "Peixe", false);
        zoo[8] = new Zoologico("Girafa", 15, "Zumbido", "Mamifero", true);
        zoo[9] = new Zoologico("Tartaruga", 80, "Estalo", "Reptil", true);

        for (int i = 0; i < zoo.length; i++) {
            if (zoo[i].corre == true) {
                correu = "Sim";
            } else if (zoo[i].corre == false) {
                correu = "Nao";
            }
            System.out.println(zoo[i].toString());
        }

    }

    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return String return the som
     */
    public String getSom() {
        return som;
    }

    /**
     * @param som the som to set
     */
    public void setSom(String som) {
        this.som = som;
    }

    /**
     * @return boolean return the corre
     */
    public boolean isCorre() {
        return corre;
    }

    /**
     * @param corre the corre to set
     */
    public void setCorre(boolean corre) {
        this.corre = corre;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return String return the correu
     */
    public String getCorreu() {
        return correu;
    }

    /**
     * @param correu the correu to set
     */
    public void setCorreu(String correu) {
        Zoologico.correu = correu;
    }

}
