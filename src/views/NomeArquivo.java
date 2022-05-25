package views;

import controllers.Serializador;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class NomeArquivo extends JFrame {
    private JPanel mainPanel;
    private JButton okButton;
    private JTextField nomeArquivoTextField;
    private JLabel InfoJanelaLabel;
    private JButton cancelButton;

    public NomeArquivo(String title, int operacao) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (operacao == 1) {
                    String arquivo = nomeArquivoTextField.getText();
                    Info info = new Info("Eletec");
                    if (arquivo.isEmpty()){
                        info.setInfoLabel("Digite um nome para o arquivo.");
                        info.setVisible(true);
                    } else {
                        Serializador.serializarObjeto(Menu.getList(), arquivo);
                        nomeArquivoTextField.setText("");
                        info.setInfoLabel("Equipamentos salvos com sucesso!");
                        info.setVisible(true);
                        NomeArquivo.super.setVisible(false);
                        NomeArquivo.super.dispose();
                    }
                } else if (operacao == 2) {
                    String arquivo = nomeArquivoTextField.getText();
                    Info info = new Info("Eletec");
                    if(Serializador.checarArquivo(arquivo)){
                        ArrayList<Object> equipamentos = Serializador.deserializarObjeto(arquivo);
                        Menu.substituirLista(equipamentos);
                        nomeArquivoTextField.setText("");
                        info.setInfoLabel("Equipamentos recuperados com sucesso!");
                        info.setVisible(true);
                        NomeArquivo.super.setVisible(false);
                        NomeArquivo.super.dispose();
                    } else{
                        info.setInfoLabel("Arquivo nao encontrado.");
                        info.setVisible(true);
                    }
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                NomeArquivo.super.setVisible(false);
                NomeArquivo.super.dispose();
            }
        });
    }
}