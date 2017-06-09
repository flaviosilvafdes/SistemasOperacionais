package so_aula10;

public class Processo {

    private String nomeProcesso;
    private int tempCPU;
    private int tempTurnaround;
    private int tempEspera;

    public Processo(String nomeProcesso, int tempCPU) {
        this.nomeProcesso = nomeProcesso;
        this.tempCPU = tempCPU;
        this.tempTurnaround = 0;
        this.tempEspera = 0;
    }

    public String getNomeProcesso() {
        return nomeProcesso;
    }

    public void setNomeProcesso(String nomeProcesso) {
        this.nomeProcesso = nomeProcesso;
    }

    public int getTempCPU() {
        return tempCPU;
    }

    public void setTempCPU(int tempCPU) {
        this.tempCPU = tempCPU;
    }

    public int getTempTurnaround() {
        return tempTurnaround;
    }

    public void setTempTurnaround(int tempTurnaround) {
        this.tempTurnaround = tempTurnaround;
    }

    public int getTempEspera() {
        return tempEspera;
    }

    public void setTempEspera(int tempEspera) {
        this.tempEspera = tempEspera;
    }

    @Override
    public String toString() {
        return "\n Processo: " + nomeProcesso
                + "\n Tempo de CPU = " + tempCPU
                + "\n Tempo de Turnaround = " + tempTurnaround
                + "\n Tempo de Espera = " + tempEspera + "\n\n";
    }
}
