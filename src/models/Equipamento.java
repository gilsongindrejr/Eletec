package models;

public class Equipamento {
    private String marca;
    private String modelo;
    private String tamanhoDaTela;

    public Equipamento(){}

    public Equipamento(String marca, String modelo, String tamanhoDaTela) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoDaTela = tamanhoDaTela;
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

    public String toString(){
        return "Equipamento generico: " + marca + " " + modelo;
    }
}
