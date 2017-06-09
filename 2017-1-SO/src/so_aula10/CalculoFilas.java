package so_aula10;

import java.util.ArrayList;

public class CalculoFilas {

    public ArrayList<Processo> calculoFilas(ArrayList<Processo> processos) {
        int aux = 0;
        for (int i = 0; i < processos.size(); i++) {
            processos.get(i).setTempEspera(aux);
            aux = aux + processos.get(i).getTempCPU();
            processos.get(i).setTempTurnaround(aux);
        }
        return processos;
    }
}
