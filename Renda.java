package Polimorfismo;

public class Renda extends Escolaridade {

    private double rendaHoje = 1000;
    private double saldoAnt;
    private boolean conclusao;

    public void Escolaridade() {

    }

    void reajuste(boolean conclusao) {

        saldoAnt = rendaHoje;

        if (conclusao == true) {

            if (this.getNivel().equals("Basico")) {

                this.setRendaHoje(this.getRendaHoje() + ((this.getRendaHoje() * 10 / 100)));
                System.out.println("A renda de R$ " + String.format("%.2f", saldoAnt) + " de " + this.getNome()
                        + " foi reajustada para R$ "
                        + String.format("%.2f", rendaHoje));

            } else if (this.getNivel().equals("Medio")) {

                this.setRendaHoje(this.getRendaHoje() + ((this.getRendaHoje() * 50 / 100)));
                System.out.println("A renda de R$ " + String.format("%.2f", saldoAnt) + " de " + this.getNome()
                        + " foi reajustada para R$ "
                        + String.format("%.2f", rendaHoje));

            } else if (this.getNivel().equals("Graduado")) {

                this.setRendaHoje(this.getRendaHoje() + ((this.getRendaHoje() * 100 / 100)));
                System.out.println("A renda de R$ " + String.format("%.2f", saldoAnt) + " de " + this.getNome()
                        + " foi reajustada para R$ "
                        + String.format("%.2f", rendaHoje));

            } else if (this.getNivel().equals("Analfabeto")) {

                System.out.println(
                        "Funcionario " + this.getNome()
                                + " nao possui nivel de instrucao para reajuste. Sem alteracao na renda. Permanece R$ "
                                + String.format("%.2f", saldoAnt));

            }

        } else {
            System.out.println("Sem alteracao na renda. Permanece R$ " + String.format("%.2f", saldoAnt));

        }

    }

    void comissao(String cargo) {

        if (this.getCargo().equals("Vendedor")) {
            this.setComissoes(250);
            this.setRendaHoje(this.getRendaHoje() + this.getComissoes());
            System.out.println("Valor da comissao R$ " + this.getComissoes());
        } else if (this.getCargo().equals("Supervisor")) {
            this.setComissoes(600);
            this.setRendaHoje(this.getRendaHoje() + this.getComissoes());
            System.out.println("Valor da comissao R$ " + this.getComissoes());
        } else if (this.getCargo().equals("Gerente")) {
            this.setComissoes(1500);
            this.setRendaHoje(this.getRendaHoje() + this.getComissoes());
            System.out.println("Valor da comissao R$ " + this.getComissoes());
        }

    }

    public double getRendaHoje() {
        return rendaHoje;
    }

    public void setRendaHoje(double rendaHoje) {
        this.rendaHoje = rendaHoje;
    }

    public boolean isConclusao() {
        return conclusao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    public double getSaldoAnt() {
        return saldoAnt;
    }

    public void setSaldoAnt(double saldoAnt) {
        this.saldoAnt = saldoAnt;
    }

}
