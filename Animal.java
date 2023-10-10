package Polimorfismo;

public class Animal {

    private String nome;
    private String tipo;
    private int idade;
    private String som;

    public Animal(String no, String ti, int id, String som) {

        this.nome = no;
        this.tipo = ti;
        this.idade = id;
        this.som = som;

    }

    public Animal() {

    }

    void correr() {
        System.out.println("O " + this.tipo + " " + this.nome + " corre.");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

 
    public void setIdade(int idade) {
        this.idade = idade;
    }

 
    public String getSom() {
        return som;
    }

 
    public void setSom(String som) {
        this.som = som;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}