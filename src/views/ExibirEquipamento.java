package views;

import models.Notebook;
import models.Smartphone;
import models.Smartwatch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ExibirEquipamento extends JFrame {
    private JPanel mainPanel;
    private JButton okButton;
    private JLabel marcaLabel;
    private JLabel modeloLabel;
    private JLabel tamanhoDaTelaLabel;
    private JLabel precoLabel;
    private JLabel processadorLabel;
    private JLabel memoriaLabel;
    private JLabel tecladoRetroiluminadoLabel;
    private JLabel qntPortasUSBLabel;
    private JLabel sistemaOperacionalLabel;
    private JLabel qntSIMCardLabel;
    private JLabel qntCameraLabel;
    private JLabel NFCLabel;
    private JLabel impressaoDigitalLabel;
    private JLabel armazenamentoLabel;
    private JLabel tipoDePulseiraLabel;
    private JLabel resistenteAAguaLabel;
    private JLabel slotSDCardLabel;
    private JLabel pesoLabel;
    private JLabel marcaInfoLabel;
    private JLabel modeloInfoLabel;
    private JLabel tamanhoDaTelaInfoLabel;
    private JLabel precoInfoLabel;
    private JLabel processadorInfoLabel;
    private JLabel memoriaInfoLabel;
    private JLabel tecladoRetroiluminadoInfoLabel;
    private JLabel qntPortasUSBInfoLabel;
    private JLabel sistemaOperacionalInfoLabel;
    private JLabel qntSIMCardInfoLabel;
    private JLabel qntCameraInfoLabel;
    private JLabel NFCInfoLabel;
    private JLabel impressaoDigitalInfoLabel;
    private JLabel armazenamentoInfoLabel;
    private JLabel tipoPulseiraInfoLabel;
    private JLabel resistenteAAguaInfoLabel;
    private JLabel slotSDCardInfoLabel;
    private JLabel pesoInfoLabel;
    private JLabel separatorLabel;
    private JButton anteriorButton;
    private JButton proximoButton;
    private JLabel paginaLabel;
    private JLabel tipoLabel;
    private ArrayList<Object> equipamentos;
    private int pos = 0;
    private int posFinal;

    public void atualiza(int pos){
        Object equipamento = equipamentos.get(pos);
        if (equipamento.getClass() == Notebook.class) {
            // Show notebook labels
            tipoLabel.setText("Notebook");
            marcaInfoLabel.setText(((Notebook) equipamento).getMarca());
            modeloInfoLabel.setText(((Notebook) equipamento).getModelo());
            tamanhoDaTelaInfoLabel.setText(((Notebook) equipamento).getTamanhoDaTela());
            precoInfoLabel.setText(Float.toString(((Notebook) equipamento).getPreco()));
            processadorLabel.setVisible(true);
            processadorInfoLabel.setVisible(true);
            processadorInfoLabel.setText(((Notebook) equipamento).getProcessador());
            memoriaLabel.setVisible(true);
            memoriaInfoLabel.setText(((Notebook) equipamento).getMemoria());
            tecladoRetroiluminadoLabel.setVisible(true);
            if (((Notebook) equipamento).getTecladoRetroiluminado()) {
                tecladoRetroiluminadoInfoLabel.setText("Possui");
            } else{
                tecladoRetroiluminadoInfoLabel.setText("Nao possui");

            }
            qntPortasUSBLabel.setVisible(true);
            qntPortasUSBInfoLabel.setText(((Notebook) equipamento).getQntDePortasUSB());
            sistemaOperacionalLabel.setVisible(true);
            sistemaOperacionalInfoLabel.setText(((Notebook) equipamento).getSistemaOperacional());

            // Hide smartphone labels
            qntSIMCardLabel.setVisible(false);
            qntSIMCardInfoLabel.setVisible(false);
            qntCameraLabel.setVisible(false);
            qntCameraInfoLabel.setVisible(false);
            NFCLabel.setVisible(false);
            NFCInfoLabel.setVisible(false);
            impressaoDigitalLabel.setVisible(false);
            impressaoDigitalInfoLabel.setVisible(false);
            armazenamentoLabel.setVisible(false);
            armazenamentoInfoLabel.setVisible(false);

            // Hide smartwatch labels
            armazenamentoLabel.setVisible(false);
            armazenamentoInfoLabel.setVisible(false);
            tipoDePulseiraLabel.setVisible(false);
            tipoPulseiraInfoLabel.setVisible(false);
            resistenteAAguaLabel.setVisible(false);
            resistenteAAguaInfoLabel.setVisible(false);
            slotSDCardLabel.setVisible(false);
            slotSDCardInfoLabel.setVisible(false);
            pesoLabel.setVisible(false);
            pesoInfoLabel.setVisible(false);
        } else if (equipamento.getClass() == Smartphone.class) {
            // Show smartphone labels
            tipoLabel.setText("Smartphone");
            marcaInfoLabel.setText(((Smartphone) equipamento).getMarca());
            modeloInfoLabel.setText(((Smartphone) equipamento).getModelo());
            tamanhoDaTelaInfoLabel.setText(((Smartphone) equipamento).getTamanhoDaTela());
            precoInfoLabel.setText(Float.toString(((Smartphone) equipamento).getPreco()));
            qntSIMCardLabel.setVisible(true);
            qntSIMCardInfoLabel.setVisible(true);
            qntSIMCardInfoLabel.setText(((Smartphone) equipamento).getQntSimCard());
            qntCameraLabel.setVisible(true);
            qntCameraInfoLabel.setVisible(true);
            qntCameraInfoLabel.setText(Integer.toString(((Smartphone) equipamento).getQntCamera()));
            NFCLabel.setVisible(true);
            NFCInfoLabel.setVisible(true);
            if (((Smartphone) equipamento).getNFC()){
                NFCInfoLabel.setText("Possui");
            } else {
                NFCInfoLabel.setText("Nao possui");
            }
            impressaoDigitalLabel.setVisible(true);
            impressaoDigitalInfoLabel.setVisible(true);
            if (((Smartphone) equipamento).getImpressaoDigital()) {
                impressaoDigitalInfoLabel.setText("Possui");
            } else{
                impressaoDigitalInfoLabel.setText("Nao possui");
            }
            armazenamentoLabel.setVisible(true);
            armazenamentoInfoLabel.setVisible(true);
            armazenamentoInfoLabel.setText(((Smartphone) equipamento).getArmazenamento());

            // Hide notebook labels
            processadorLabel.setVisible(false);
            processadorInfoLabel.setVisible(false);
            memoriaLabel.setVisible(false);
            memoriaInfoLabel.setVisible(false);
            tecladoRetroiluminadoLabel.setVisible(false);
            tecladoRetroiluminadoInfoLabel.setVisible(false);
            qntPortasUSBLabel.setVisible(false);
            qntPortasUSBInfoLabel.setVisible(false);
            sistemaOperacionalLabel.setVisible(false);
            sistemaOperacionalInfoLabel.setVisible(false);

            // Hide smartwatch labels
            armazenamentoLabel.setVisible(false);
            armazenamentoInfoLabel.setVisible(false);
            tipoDePulseiraLabel.setVisible(false);
            tipoPulseiraInfoLabel.setVisible(false);
            resistenteAAguaLabel.setVisible(false);
            resistenteAAguaInfoLabel.setVisible(false);
            slotSDCardLabel.setVisible(false);
            slotSDCardInfoLabel.setVisible(false);
            pesoLabel.setVisible(false);
            pesoInfoLabel.setVisible(false);
        } else if (equipamento.getClass() == Smartwatch.class) {
            // Show smartwatch labels
            tipoLabel.setText("Smartwatch");
            marcaInfoLabel.setText(((Smartwatch) equipamento).getMarca());
            modeloInfoLabel.setText(((Smartwatch) equipamento).getModelo());
            tamanhoDaTelaInfoLabel.setText(((Smartwatch) equipamento).getTamanhoDaTela());
            precoInfoLabel.setText(Float.toString(((Smartwatch) equipamento).getPreco()));
            armazenamentoLabel.setVisible(true);
            armazenamentoInfoLabel.setVisible(true);
            armazenamentoInfoLabel.setText(((Smartwatch) equipamento).getArmazenamento());
            tipoDePulseiraLabel.setVisible(true);
            tipoPulseiraInfoLabel.setVisible(true);
            tipoPulseiraInfoLabel.setText(((Smartwatch) equipamento).getTipoDePulseira());
            resistenteAAguaLabel.setVisible(true);
            resistenteAAguaInfoLabel.setVisible(true);
            if (((Smartwatch) equipamento).getResistenteAgua()) {
                resistenteAAguaInfoLabel.setText("Possui");
            } else {
                resistenteAAguaInfoLabel.setText("Nao possui");
            }
            slotSDCardLabel.setVisible(true);
            slotSDCardInfoLabel.setVisible(true);
            if (((Smartwatch) equipamento).getSlotSdCard()) {
                slotSDCardInfoLabel.setText("Possui");
            } else {
                slotSDCardInfoLabel.setText("Nao possui");
            }
            pesoLabel.setVisible(true);
            pesoInfoLabel.setVisible(true);
            pesoInfoLabel.setText(((Smartwatch) equipamento).getPeso());

            // Hide notebook labels
            processadorLabel.setVisible(false);
            processadorInfoLabel.setVisible(false);
            memoriaLabel.setVisible(false);
            memoriaInfoLabel.setVisible(false);
            tecladoRetroiluminadoLabel.setVisible(false);
            tecladoRetroiluminadoInfoLabel.setVisible(false);
            qntPortasUSBLabel.setVisible(false);
            qntPortasUSBInfoLabel.setVisible(false);
            sistemaOperacionalLabel.setVisible(false);
            sistemaOperacionalInfoLabel.setVisible(false);

            // Hide smartphone labels
            qntSIMCardLabel.setVisible(false);
            qntSIMCardInfoLabel.setVisible(false);
            qntCameraLabel.setVisible(false);
            qntCameraInfoLabel.setVisible(false);
            NFCLabel.setVisible(false);
            NFCInfoLabel.setVisible(false);
            impressaoDigitalLabel.setVisible(false);
            impressaoDigitalInfoLabel.setVisible(false);
            armazenamentoLabel.setVisible(false);
            armazenamentoInfoLabel.setVisible(false);
        }
    }

    public void atualizaPagina(){
        if (equipamentos.size() == 0){
            paginaLabel.setText("0/0");
        } else {
            paginaLabel.setText((pos + 1) + "/" + equipamentos.size());
        }
    }

    public ExibirEquipamento(String title, ArrayList<Object> listaEquipamentos){
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        equipamentos = listaEquipamentos;
        posFinal = equipamentos.size();
        atualizaPagina();
        atualiza(pos);
        this.pack();
        this.setLocationRelativeTo(null);
        anteriorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (pos != 0) {
                    pos--;
                    atualizaPagina();
                    atualiza(pos);
                }
            }
        });
        proximoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (equipamentos.size() != 0) {
                    if (pos != (equipamentos.size() - 1)) {
                        pos++;
                        atualizaPagina();
                        atualiza(pos);
                    }
                }
            }
        });
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ExibirEquipamento.super.setVisible(false);
                ExibirEquipamento.super.dispose();
            }
        });
    }
}