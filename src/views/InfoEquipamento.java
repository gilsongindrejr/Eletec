package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controllers.Adicionar;
import models.Notebook;
import models.Smartphone;
import models.Smartwatch;

public class InfoEquipamento extends JFrame {
    private JPanel mainPanel;
    private JButton okButton;
    private JButton cancelButton;
    private JLabel marcaLabel;
    private JLabel modeloLabel;
    private JLabel tamanhoDaTelaLabel;
    private JLabel precoLabel;
    private JLabel processadorLabel;
    private JLabel memoriaLabel;
    private JLabel tecladoRetroiluminadoLabel;
    private JLabel qntPortasUSBLabel;
    private JLabel sistemaOperacionalLabel;
    private JLabel qntSimCardLabel;
    private JLabel qntCameraLabel;
    private JLabel NFCLabel;
    private JLabel impressaoDigitalLabel;
    private JLabel armazenamentoLabel;
    private JLabel tipoDepulseiraLabel;
    private JLabel resistenteAAguaLabel;
    private JLabel slotSDCardLabel;
    private JLabel pesoLabel;
    private JTextField marcaTextField;
    private JTextField modeloTextField;
    private JTextField tamanhoDaTelaTextField;
    private JTextField precoTextField;
    private JTextField processadorTextField;
    private JTextField memoriaTextField;
    private JSpinner qntPortasUSBSpinner;
    private JTextField sistemaOperacionalTextField;
    private JTextField armazenamentoTextField;
    private JTextField tipoDePulseiraTextField;
    private JCheckBox tecladoRetroiluminadoCheckBox;
    private JCheckBox NFCCheckBox;
    private JCheckBox impressaoDigitalCheckBox;
    private JCheckBox resistenteAAguaCheckBox;
    private JCheckBox slotSDCardCheckBox;
    private JTextField pesoTextField;
    private JSpinner qntSIMCardSpinner;
    private JSpinner qntCameraSpinner;

    public InfoEquipamento(String title, int escolha) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        switch(escolha){
            case 1:
                // Hide smartphone labels and inputs
                this.qntSimCardLabel.setVisible(false);
                this.qntSIMCardSpinner.setVisible(false);
                this.qntCameraLabel.setVisible(false);
                this.qntCameraSpinner.setVisible(false);
                this.NFCLabel.setVisible(false);
                this.NFCCheckBox.setVisible(false);
                this.impressaoDigitalLabel.setVisible(false);
                this.impressaoDigitalCheckBox.setVisible(false);
                this.armazenamentoLabel.setVisible(false);
                this.armazenamentoTextField.setVisible(false);

                // Hide smartwatch labels and inputs
                this.tipoDepulseiraLabel.setVisible(false);
                this.tipoDePulseiraTextField.setVisible(false);
                this.resistenteAAguaLabel.setVisible(false);
                this.resistenteAAguaCheckBox.setVisible(false);
                this.slotSDCardCheckBox.setVisible(false);
                this.slotSDCardLabel.setVisible(false);
                this.pesoLabel.setVisible(false);
                this.pesoTextField.setVisible(false);
                this.armazenamentoLabel.setVisible(false);
                this.armazenamentoTextField.setVisible(false);
                break;
            case 2:
                // Hide notebook labels and inputs
                this.processadorLabel.setVisible(false);
                this.processadorTextField.setVisible(false);
                this.memoriaLabel.setVisible(false);
                this.memoriaTextField.setVisible(false);
                this.tecladoRetroiluminadoLabel.setVisible(false);
                this.tecladoRetroiluminadoCheckBox.setVisible(false);
                this.qntPortasUSBLabel.setVisible(false);
                this.qntPortasUSBSpinner.setVisible(false);
                this.sistemaOperacionalLabel.setVisible(false);
                this.sistemaOperacionalTextField.setVisible(false);

                // Hide smartwatch labels and inputs
                this.tipoDepulseiraLabel.setVisible(false);
                this.tipoDePulseiraTextField.setVisible(false);
                this.resistenteAAguaLabel.setVisible(false);
                this.resistenteAAguaCheckBox.setVisible(false);
                this.slotSDCardCheckBox.setVisible(false);
                this.slotSDCardLabel.setVisible(false);
                this.pesoLabel.setVisible(false);
                this.pesoTextField.setVisible(false);
                break;
            case 3:
                // Hide smartphone labels and inputs
                this.qntSimCardLabel.setVisible(false);
                this.qntSIMCardSpinner.setVisible(false);
                this.qntCameraLabel.setVisible(false);
                this.qntCameraSpinner.setVisible(false);
                this.NFCLabel.setVisible(false);
                this.NFCCheckBox.setVisible(false);
                this.impressaoDigitalLabel.setVisible(false);
                this.impressaoDigitalCheckBox.setVisible(false);

                // Hide notebook labels and inputs
                this.processadorLabel.setVisible(false);
                this.processadorTextField.setVisible(false);
                this.memoriaLabel.setVisible(false);
                this.memoriaTextField.setVisible(false);
                this.tecladoRetroiluminadoLabel.setVisible(false);
                this.tecladoRetroiluminadoCheckBox.setVisible(false);
                this.qntPortasUSBLabel.setVisible(false);
                this.qntPortasUSBSpinner.setVisible(false);
                this.sistemaOperacionalLabel.setVisible(false);
                this.sistemaOperacionalTextField.setVisible(false);
                break;
            default:
                break;
        }
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                switch (escolha){
                    case 1:
                        try {
                            String marca = marcaTextField.getText();
                            String modelo = modeloTextField.getText();
                            String tamanhoDaTela = tamanhoDaTelaTextField.getText();
                            float preco = Float.parseFloat(precoTextField.getText());
                            String processador = processadorTextField.getText();
                            String memoria = memoriaTextField.getText();
                            boolean tecladoRetroiluminado = Boolean.parseBoolean(tecladoRetroiluminadoCheckBox.getText());
                            String qntPortasUSB = Integer.toString((Integer) qntPortasUSBSpinner.getValue());
                            String sistemaOperacional = sistemaOperacionalTextField.getText();

                            Notebook notebook = Adicionar.Notebook(marca, modelo, tamanhoDaTela, preco, processador, memoria, tecladoRetroiluminado, qntPortasUSB, sistemaOperacional);
                            Menu.addToList(notebook);

                            marcaTextField.setText("");
                            modeloTextField.setText("");
                            tamanhoDaTelaTextField.setText("");
                            precoTextField.setText("");
                            processadorTextField.setText("");
                            memoriaTextField.setText("");
                            tecladoRetroiluminadoCheckBox.setSelected(false);
                            qntPortasUSBSpinner.setValue(0);
                            sistemaOperacionalTextField.setText("");

                            Info info = new Info("Eletec");
                            info.setInfoLabel("Notebook salvo com sucesso!");
                            info.setVisible(true);
                            InfoEquipamento.super.setVisible(false);
                            InfoEquipamento.super.dispose();
                        } catch (NumberFormatException e){
                            Info info = new Info("Eletec");
                            info.setInfoLabel("Preco e quantidade de portas USB devem ser numeros.");
                            info.setVisible(true);
                        }
                        break;
                    case 2:
                        try {
                            String marca = marcaTextField.getText();
                            String modelo = modeloTextField.getText();
                            String tamanhoDaTela = tamanhoDaTelaTextField.getText();
                            float preco = Float.parseFloat(precoTextField.getText());
                            String qntSimCard = Integer.toString((Integer) qntSIMCardSpinner.getValue());
                            int qntCamera = (int) qntCameraSpinner.getValue();
                            boolean NFC = Boolean.parseBoolean(NFCCheckBox.getText());
                            boolean impressaoDigital = Boolean.parseBoolean(impressaoDigitalCheckBox.getText());
                            String armazenamento = armazenamentoTextField.getText();

                            Smartphone smartphone = new Smartphone(marca, modelo, tamanhoDaTela, preco, qntSimCard, qntCamera, NFC, impressaoDigital, armazenamento);
                            Menu.addToList(smartphone);

                            marcaTextField.setText("");
                            modeloTextField.setText("");
                            tamanhoDaTelaTextField.setText("");
                            precoTextField.setText("");
                            qntSIMCardSpinner.setValue(0);
                            qntCameraSpinner.setValue(0);
                            NFCCheckBox.setSelected(false);
                            impressaoDigitalCheckBox.setSelected(false);
                            armazenamentoTextField.setText("");

                            Info info = new Info("Eletec");
                            info.setInfoLabel("Smartphone salvo com sucesso!");
                            info.setVisible(true);
                            InfoEquipamento.super.setVisible(false);
                            InfoEquipamento.super.dispose();
                        } catch (NumberFormatException e){
                            Info info = new Info("Eletec");
                            info.setInfoLabel("Preco deve ser um numero.");
                            info.setVisible(true);
                        }
                        break;
                    case 3:
                        try{
                            String marca = marcaTextField.getText();
                            String modelo = modeloTextField.getText();
                            String tamanhoDaTela = tamanhoDaTelaTextField.getText();
                            float preco = Float.parseFloat(precoTextField.getText());
                            String tipoDePulseira = tipoDePulseiraTextField.getText();
                            boolean resistenteAAgua = Boolean.parseBoolean(resistenteAAguaCheckBox.getText());
                            boolean slotSDCard = Boolean.parseBoolean(slotSDCardCheckBox.getText());
                            String peso = pesoTextField.getText();
                            String armazenamento = armazenamentoTextField.getText();

                            Smartwatch smartwatch = new Smartwatch(marca, modelo, tamanhoDaTela, preco, tipoDePulseira, resistenteAAgua, slotSDCard, peso, armazenamento);
                            Menu.addToList(smartwatch);

                            marcaTextField.setText("");
                            modeloTextField.setText("");
                            tamanhoDaTelaTextField.setText("");
                            precoTextField.setText("");
                            tipoDePulseiraTextField.setText("");
                            resistenteAAguaCheckBox.setSelected(false);
                            slotSDCardCheckBox.setSelected(false);
                            pesoTextField.setText("");
                            armazenamentoTextField.setText("");

                            Info info = new Info("Eletec");
                            info.setInfoLabel("Smartwatch salvo com sucesso!");
                            info.setVisible(true);
                            InfoEquipamento.super.setVisible(false);
                            InfoEquipamento.super.dispose();
                        } catch (NumberFormatException e){
                            Info info = new Info("Eletec");
                            info.setInfoLabel("Preco deve ser um numero.");
                            info.setVisible(true);
                        }
                        break;
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InfoEquipamento.super.setVisible(false);
                InfoEquipamento.super.dispose();
            }
        });
    }
}
