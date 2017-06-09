package so_aula10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Processo> processos = new ArrayList();
        Scanner leitura = new Scanner(System.in);
        int next = 1;
        //System.out.println("Para iniciar => ENTER");
        while (next != 0) {
            System.out.println("Informe a identificação do processo: ");
            String nextS = leitura.next();
            System.out.println("Informe o tempo do processo ou '0' para sair: ");
            next = leitura.nextInt();
            if (next == 0) {
                break;
            }
            processos.add(new Processo(nextS, next));
        }
        System.out.println("Informe qual das listas deseja ordenar os processos: 'FIFO' ou 'SJF'");
        String nextLista = leitura.next();
        if (nextLista.equals("FIFO")) {
            Fifo f = new Fifo();
            f.fifo(processos);
        } else if (nextLista.equals("SJF")) {
            Sjf s = new Sjf();
            s.sjf(processos);
        }

    }
}
