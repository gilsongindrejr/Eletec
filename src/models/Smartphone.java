package models;

public class Smartphone {
    private int qntSimCard;
    private int qntCamera;
    private boolean NFC;
    private boolean impressaoDigital;
    private int armazenamento;

    public Smartphone(int qntSimCard, int qntCamera, boolean NFC, boolean impressaoDigital, int armazenamento){
        this.qntSimCard = qntSimCard;
        this.qntCamera = qntCamera;
        this.NFC = NFC;
        this.impressaoDigital = impressaoDigital;
        this.armazenamento = armazenamento;
    }

    public Smartphone(int qntSimCard, int qntCamera, boolean NFC, boolean impressaoDigital) {
        this.qntSimCard = qntSimCard;
        this.qntCamera = qntCamera;
        this.NFC = NFC;
        this.impressaoDigital = impressaoDigital;
    }

    public int getQntSimCard(){
        return this.qntSimCard;
    }

    public int getQntCamera(){
        return this.qntCamera;
    }

    public boolean getNFC(){
        return this.NFC;
    }

    public boolean getImpressaoDigital(){
        return this.impressaoDigital;
    }

    public int getArmazenamento(){
        return this.armazenamento;
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }
}
