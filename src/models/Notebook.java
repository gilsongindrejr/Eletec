package models;

public class Notebook {
    private String processador;
    private String memoria;
    private boolean tecladoRetroiluminado;
    private int qntDePortasUSB;
    private String sistemaOperacional;

    public Notebook(String processador, String memoria, boolean tecladoRetroiluminado, int qntDePortasUSB, String sistemaOperacional){
        this.processador = processador;
        this.memoria = memoria;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.qntDePortasUSB = qntDePortasUSB;
        this.sistemaOperacional = sistemaOperacional;
    }

    public Notebook(String processador, String memoria, boolean tecladoRetroiluminado, int qntDePortasUSB){
        this.processador = processador;
        this.memoria = memoria;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.qntDePortasUSB = qntDePortasUSB;
    }

    public Notebook(String processador, boolean tecladoRetroiluminado, int qntDePortasUSB){
        this.processador = processador;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.qntDePortasUSB = qntDePortasUSB;
    }

    public String getProcessador(){
        return this.processador;
    }

    public void setProcessador(String processador){
        this.processador = processador;
    }

    public String getMemoria(){
        return this.memoria;
    }

    public void setMemoria(String memoria){
        this.memoria = memoria;
    }

    public Boolean getTecladoRetroiluminado(){
        return this.tecladoRetroiluminado;
    }

    public void setTecladoRetroiluminado(boolean tecladoRetroiluminado){
        this.tecladoRetroiluminado = tecladoRetroiluminado;
    }

    public int getQntDePortasUSB(){
        return this.qntDePortasUSB;
    }

    public void setQntDePortasUSB(int qntDePortasUSB){
        this.qntDePortasUSB = qntDePortasUSB;
    }

    public String getSistemaOperacional(){
        return this.sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperaciocal){
        this.sistemaOperacional = sistemaOperacional;
    }
}

