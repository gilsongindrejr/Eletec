package models;

import java.io.Serializable;

public class Notebook extends Equipamento implements Serializable {
    private String processador;
    private String memoria;
    private boolean tecladoRetroiluminado;
    private String qntDePortasUSB;
    private String sistemaOperacional;

    public Notebook(String marca, String modelo, String tamanhoDaTela, float preco){
        super(marca, modelo, tamanhoDaTela, preco);
    }

    public Notebook(String marca, String modelo, String tamanhoDaTela, float preco, String processador, String memoria, boolean tecladoRetroiluminado, String qntDePortasUSB, String sistemaOperacional){
        super(marca, modelo, tamanhoDaTela, preco);
        this.processador = processador;
        this.memoria = memoria;
        this.tecladoRetroiluminado = tecladoRetroiluminado;
        this.qntDePortasUSB = qntDePortasUSB;
        this.sistemaOperacional = sistemaOperacional;
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

    public String getQntDePortasUSB(){
        return this.qntDePortasUSB;
    }

    public void setQntDePortasUSB(String qntDePortasUSB){
        this.qntDePortasUSB = qntDePortasUSB;
    }

    public String getSistemaOperacional(){
        return this.sistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperaciocal){
        this.sistemaOperacional = sistemaOperacional;
    }

    @Override
    public String toString(){
        return "Notebook: " + super.getMarca() + " " + super.getModelo();
    }
}

