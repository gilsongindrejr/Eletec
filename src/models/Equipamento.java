package models;

import java.io.Serializable;

public class Equipamento implements Serializable {
    private String marca;
    private String modelo;
    private String tamanhoDaTela;
    private float preco;

    public Equipamento(String marca, String modelo, String tamanhoDaTela, float preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoDaTela = tamanhoDaTela;
        this.preco = preco;
    }

    public String getMarca(){
        return this.marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getTamanhoDaTela(){
        return this.tamanhoDaTela;
    }

    public void setTamanhoDaTela(String tamanhoDaTela){
        this.tamanhoDaTela = tamanhoDaTela;
    }

    public float getPreco(){
        return this.preco;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }

    public String toString(){
        return "Equipamento generico: " + marca + " " + modelo;
    }
}
