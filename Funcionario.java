package Polimorfismo;

public class Funcionario {

    private String nome;
    private String nivel;
    private String cargo;
    private double comissoes;

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }


    public double getComissoes() {
        return comissoes;
    }

    public void setComissoes(double comissoes) {
        this.comissoes = comissoes;
    }


    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
