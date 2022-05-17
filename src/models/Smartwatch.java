package models;

public class Smartwatch extends Equipamento {
    private String tipoDePulseira;
    private boolean resistenteAgua;
    private boolean slotSdCard;
    private float peso;
    private String armazenamento;

    public Smartwatch(String marca, String modelo, String tamanhoDaTela, float preco){
        super(marca, modelo, tamanhoDaTela, preco);
    }

    public Smartwatch(String marca, String modelo, String tamanhoDaTela, float preco, String tipoDePulseira, boolean resistenteAgua, boolean slotSdCard, float peso, String armazenamento){
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

    public float getPeso(){
        return this.peso;
    }

    public void setPeso(float peso){
        this.peso = peso;
    }

    public String getArmazenamento(){
        return this.armazenamento;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public String toString(){
        return "Smartwatch: " + super.getMarca() + " " + super.getModelo();
    }
}
