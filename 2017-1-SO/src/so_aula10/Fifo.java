package so_aula10;

import java.util.ArrayList;

public class Fifo {

    public void fifo(ArrayList<Processo> processos) {
        ArrayList<Processo> fifo = new ArrayList<>();
        CalculoFilas calc = new CalculoFilas();
        fifo = calc.calculoFilas(processos);
        System.out.println(processos.toString());
    }
}
