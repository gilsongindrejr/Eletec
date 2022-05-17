package models;

public class Equipamento {
    private String marca;
    private String modelo;
    private String tamanhoDaTela;

    public Equipamento(String marca, String modelo, String tamanhoDaTela){
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoDaTela = tamanhoDaTela;
    }

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getTamanhoDaTela(){
        return this.tamanhoDaTela;
    }

}
