package so_aula10;

import java.util.ArrayList;

public class Sjf {

    public void sjf(ArrayList<Processo> processos) {
        ArrayList<Processo> sjf = new ArrayList<>();
        //ArrayList<Processo> proc = new ArrayList<>();
        int aux = 0;
        for (int i = 0; i < processos.size(); i++) {
            for (int j = 0; j < processos.size(); j++) {
                if (processos.get(i).getTempCPU() < processos.get(j).getTempCPU()) {

                    sjf.add(new Processo(processos.get(i).getNomeProcesso(), processos.get(i).getTempCPU()));

                    processos.get(i).setNomeProcesso(processos.get(j).getNomeProcesso());
                    processos.get(i).setTempCPU(processos.get(j).getTempCPU());

                    processos.get(j).setNomeProcesso(sjf.get(aux).getNomeProcesso());
                    processos.get(j).setTempCPU(sjf.get(aux).getTempCPU());
                    aux++;
                }
            }
        }

        CalculoFilas calc = new CalculoFilas();
        sjf = calc.calculoFilas(processos);
        System.out.println(processos.toString());
    }
}
