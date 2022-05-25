package views;

import controllers.Adicionar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AdicionarEquipamento extends JFrame {
    private JPanel mainPanel;
    private JButton okButton;
    private JButton cancelButton;
    private JTextField optionField;

    public AdicionarEquipamento(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int option = Integer.parseInt(optionField.getText());
                    switch (option) {
                        case 1:
                        case 2:
                        case 3:
                            JFrame infoEquipamento = new InfoEquipamento("Eletec - Informacoes do Equipamento", Integer.parseInt(optionField.getText()));
                            optionField.setText("");
                            infoEquipamento.setVisible(true);
                            break;
                        default:
                            Info info = new Info("Eletec");
                            info.setInfoLabel("Opcao Invalida!");
                            optionField.setText("");
                            info.setVisible(true);
                            break;
                    }
                }catch (NumberFormatException e){
                    Info info = new Info("Eletec");
                    info.setInfoLabel("Opcao Invalida!");
                    optionField.setText("");
                    info.setVisible(true);
                }
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AdicionarEquipamento.super.setVisible(false);
                AdicionarEquipamento.super.dispose();
            }
        });
    }
}
