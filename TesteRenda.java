package Polimorfismo;

public class TesteRenda extends Funcionario {

    public TesteRenda() {

    }

    public static double salTotalBasico;
    public static double salTotalMedio;
    public static double salTotalGraduado;

    public static void main(String[] args) {

        Escolaridade fun01 = new Escolaridade();
        fun01.setNome("Marcio");
        fun01.setNivel("Basico");
        fun01.setCargo("Vendedor");

        Renda r01 = new Renda();
        r01.setConclusao(true);
        r01.setNome(fun01.getNome());
        r01.setNivel(fun01.getNivel());
        r01.setCargo(fun01.getCargo());

        Escolaridade fun02 = new Escolaridade();
        fun02.setNome("Joana");
        fun02.setNivel("Medio");
        fun02.setCargo("Vendedor");

        Renda r02 = new Renda();
        r02.setConclusao(true);
        r02.setNome(fun02.getNome());
        r02.setNivel(fun02.getNivel());
        r02.setCargo(fun02.getCargo());

        Escolaridade fun03 = new Escolaridade();
        fun03.setNome("Marisa");
        fun03.setNivel("Graduado");
        fun03.setCargo("Supervisor");

        Renda r03 = new Renda();
        r03.setConclusao(true);
        r03.setNome(fun03.getNome());
        r03.setNivel(fun03.getNivel());
        r03.setCargo(fun03.getCargo());

        Escolaridade fun04 = new Escolaridade();
        fun04.setNome("Arnaldo");
        fun04.setNivel("Basico");
        fun04.setCargo("Vendedor");

        Renda r04 = new Renda();
        r04.setConclusao(true);
        r04.setNome(fun04.getNome());
        r04.setNivel(fun04.getNivel());
        r04.setCargo(fun04.getCargo());

        Escolaridade fun05 = new Escolaridade();
        fun05.setNome("Severino");
        fun05.setNivel("Basico");
        fun05.setCargo("Vendedor");

        Renda r05 = new Renda();
        r05.setConclusao(true);
        r05.setNome(fun05.getNome());
        r05.setNivel(fun05.getNivel());
        r05.setCargo(fun05.getCargo());

        Escolaridade fun06 = new Escolaridade();
        fun06.setNome("Jussara");
        fun06.setNivel("Basico");
        fun06.setCargo("Vendedor");

        Renda r06 = new Renda();
        r06.setConclusao(true);
        r06.setNome(fun06.getNome());
        r06.setNivel(fun06.getNivel());
        r06.setCargo(fun06.getCargo());

        Escolaridade fun07 = new Escolaridade();
        fun07.setNome("Matheus");
        fun07.setNivel("Medio");
        fun07.setCargo("Supervisor");

        Renda r07 = new Renda();
        r07.setConclusao(true);
        r07.setNome(fun07.getNome());
        r07.setNivel(fun07.getNivel());
        r07.setCargo(fun07.getCargo());

        Escolaridade fun08 = new Escolaridade();
        fun08.setNome("Camila");
        fun08.setNivel("Medio");
        fun08.setCargo("Vendedor");

        Renda r08 = new Renda();
        r08.setConclusao(true);
        r08.setNome(fun08.getNome());
        r08.setNivel(fun08.getNivel());
        r08.setCargo(fun08.getCargo());

        Escolaridade fun09 = new Escolaridade();
        fun09.setNome("Arnaldo");
        fun09.setNivel("Medio");
        fun09.setCargo("Vendedor");

        Renda r09 = new Renda();
        r09.setConclusao(true);
        r09.setNome(fun09.getNome());
        r09.setNivel(fun09.getNivel());
        r09.setCargo(fun09.getCargo());

        Escolaridade fun10 = new Escolaridade();
        fun10.setNome("Fernando");
        fun10.setNivel("Graduado");
        fun10.setCargo("Gerente");

        Renda r10 = new Renda();
        r10.setConclusao(true);
        r10.setNome(fun10.getNome());
        r10.setNivel(fun10.getNivel());
        r10.setCargo(fun10.getCargo());

        Renda[] empr = new Renda[10];

        empr[0] = r01;
        empr[1] = r02;
        empr[2] = r03;
        empr[3] = r04;
        empr[4] = r05;
        empr[5] = r06;
        empr[6] = r07;
        empr[7] = r08;
        empr[8] = r09;
        empr[9] = r10;

        for (int i = 0; i < empr.length; i++) {

            empr[i].reajuste(empr[i].isConclusao());

            empr[i].comissao(empr[i].getCargo());

            if (empr[i].getNivel().equals("Basico")) {
                salTotalBasico = salTotalBasico + empr[i].getRendaHoje();
            } else if (empr[i].getNivel().equals("Medio")) {
                salTotalMedio = salTotalMedio + empr[i].getRendaHoje();
            } else if (empr[i].getNivel().equals("Graduado")) {
                salTotalGraduado = salTotalGraduado + empr[i].getRendaHoje();
            }

            System.out.println("Funcionario " + empr[i].getNome() + " - Nivel: " + empr[i].getNivel() + " - Cargo: "
                    + empr[i].getCargo()
                    + " - Salario atualizado: R$ " + empr[i].getRendaHoje());
            System.out.println();

        }

        System.out.println("Custo Total da Folha de Pagamento - após reajustes, incluindo comissoes.");
        System.out.println("Total pago aos funcionarios de nivel Basico: R$ " + String.format("%.2f", salTotalBasico));
        System.out.println("Total pago aos funcionarios de nivel Medio: R$ " + String.format("%.2f", salTotalMedio));
        System.out.println(
                "Total pago aos funcionarios de nivel Superior: R$ " + String.format("%.2f", salTotalGraduado));
        System.out.println(
                "Total da Folha de Pagamento no mes: R$ " + (salTotalBasico + salTotalMedio + salTotalGraduado));

    }

}
