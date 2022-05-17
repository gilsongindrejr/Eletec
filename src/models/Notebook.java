package models;

public class Notebook {
    private String processador;
    private String memoria;
    private boolean tecladoRetroiluminado;
    private int quantidadeDePortasUSB;
    private String sistemaOperacional;

    public Notebook(String processador, String memoria, boolean tecladoRetroiluminado, int quantidadeDePortasUSB, String sistemaOperacional){
        this.processador = processador;
        this.memoria = memoria;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.quantidadeDePortasUSB = quantidadeDePortasUSB;
        this.sistemaOperacional = sistemaOperacional;
    }

    public Notebook(String processador, String memoria, boolean tecladoRetroiluminado, int quantidadeDePortasUSB){
        this.processador = processador;
        this.memoria = memoria;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.quantidadeDePortasUSB = quantidadeDePortasUSB;
    }

    public Notebook(String processador, boolean tecladoRetroiluminado, int quantidadeDePortasUSB){
        this.processador = processador;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.quantidadeDePortasUSB = quantidadeDePortasUSB;
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

    public int getQuantidadeDePortasUSB(){
        return this.quantidadeDePortasUSB;
    }

    public String getSistemaOperacional(){
        return this.sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperaciocal){
        this.sistemaOperacional = sistemaOperacional;
    }
}

