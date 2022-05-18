package models;

import java.io.Serializable;

public class Smartwatch extends Equipamento implements Serializable {
    private String tipoDePulseira;
    private boolean resistenteAgua;
    private boolean slotSdCard;
    private String peso;
    private String armazenamento;

    public Smartwatch(String marca, String modelo, String tamanhoDaTela, float preco){
        super(marca, modelo, tamanhoDaTela, preco);
    }

    public Smartwatch(String marca, String modelo, String tamanhoDaTela, float preco, String tipoDePulseira, boolean resistenteAgua, boolean slotSdCard, String peso, String armazenamento){
        super(marca, modelo, tamanhoDaTela, preco);
        this.tipoDePulseira = tipoDePulseira;
        this.resistenteAgua = resistenteAgua;
        this.slotSdCard = slotSdCard;
        this.peso = peso;
        this.armazenamento = armazenamento;
    }

    public String getTipoDePulseira(){
        return this.tipoDePulseira;
    }

    public void setTipoDePulseira(String tipoDePulseira){
        this.tipoDePulseira = tipoDePulseira;
    }

    public boolean getResistenteAgua(){
        return this.resistenteAgua;
    }

    public void setResistenteAgua(boolean resistenteAgua){
        this.resistenteAgua = resistenteAgua;
    }

    public boolean getSlotSdCard(){
        return this.slotSdCard;
    }

    public void setSlotSdCard(boolean slotSdCard){
        this.slotSdCard = slotSdCard;
    }

    public String getPeso(){
        return this.peso;
    }

    public void setPeso(String peso){
        this.peso = peso;
    }

    public String getArmazenamento(){
        return this.armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    @Override
    public String toString(){
        return "Smartwatch: " + super.getMarca() + " " + super.getModelo();
    }
}
