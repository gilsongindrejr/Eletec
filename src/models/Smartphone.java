package models;

public class Smartphone extends Equipamento {
    private int qntSimCard;
    private int qntCamera;
    private boolean NFC;
    private boolean impressaoDigital;
    private int armazenamento;

    public Smartphone(String marca, String modelo, String tamanhoDaTela, float preco){
        super(marca, modelo, tamanhoDaTela, preco);
    }

    public Smartphone(String marca, String modelo, String tamanhoDaTela, float preco, int qntSimCard, int qntCamera, boolean NFC, boolean impressaoDigital, int armazenamento){
        super(marca, modelo, tamanhoDaTela, preco);
        this.qntSimCard = qntSimCard;
        this.qntCamera = qntCamera;
        this.NFC = NFC;
        this.impressaoDigital = impressaoDigital;
        this.armazenamento = armazenamento;
    }

    public int getQntSimCard(){
        return this.qntSimCard;
    }

    public void setQntSimCard(int qntSimCard){
        this.qntSimCard = qntSimCard;
    }

    public int getQntCamera(){
        return this.qntCamera;
    }

    public void setQntCamera(int qntCamera){
        this.qntCamera = qntCamera;
    }

    public boolean getNFC(){
        return this.NFC;
    }

    public void setNFC(boolean NFC){
        this.NFC = NFC;
    }

    public boolean getImpressaoDigital(){
        return this.impressaoDigital;
    }

    public void setImpressaoDigital(boolean impressaoDigital){
        this.impressaoDigital  = impressaoDigital;
    }

    public int getArmazenamento(){
        return this.armazenamento;
    }

    public void setArmazenamento(int armazenamento){
        this.armazenamento = armazenamento;
    }

    public String toString(){
        return "Smartphone: " + super.getMarca() + " " + super.getModelo();
    }
}
