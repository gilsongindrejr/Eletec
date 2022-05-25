package views;

import models.Notebook;
import models.Smartphone;
import models.Smartwatch;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Menu extends JFrame {
    private JPanel mainPanel;
    private JButton okButton;
    private JButton sairButton;
    private JTextField optionField;
    private static ArrayList<Object> equipamentos = new ArrayList<>();

    public static void addToList(Object equipamento){
        equipamentos.add(equipamento);
        System.out.println(equipamentos);
    }

    public static ArrayList getList(){
        return equipamentos;
    }

    public static void substituirLista(ArrayList<Object> newEquipamentos){
        equipamentos = newEquipamentos;
    }

    public Menu(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    int opcao = Integer.parseInt(optionField.getText());
                    switch (opcao){
                        case 1:
                            JFrame adicionarEquipamento = new AdicionarEquipamento("Eletec - Adicionar Equipamento");
                            adicionarEquipamento.setVisible(true);
                            optionField.setText("");
                            break;
                        case 2:
                            if(equipamentos.size() == 0){
                                Info info = new Info("Eletec");
                                info.setInfoLabel("Nenhum equipamento na memoria");
                                info.setVisible(true);
                            }else{
                                ExibirEquipamento exibirEquipamento = new ExibirEquipamento("Eletec - Exibir Equipamnto", equipamentos);
                                exibirEquipamento.setVisible(true);
                            }
                            optionField.setText("");
                            break;
                        case 3:
                            optionField.setText("");
                            equipamentos.clear();
                            System.out.println(equipamentos);
                            Info limparEquipamentos = new Info("Eletec");
                            limparEquipamentos.setInfoLabel("Equipamentos limpos com sucesso!");
                            limparEquipamentos.setVisible(true);
                            optionField.setText("");
                            break;
                        case 4:
                            JFrame nomeArquivoSalvar = new NomeArquivo("Eletec - Salvar Equipamento", 1);
                            nomeArquivoSalvar.setVisible(true);
                            optionField.setText("");
                            break;
                        case 5:
                            JFrame nomeArquivoRecuperar = new NomeArquivo("Eletec - Recuperar Equipamento", 2);
                            nomeArquivoRecuperar.setVisible(true);
                            optionField.setText("");
                            break;
                        case 9:
                            Menu.super.setVisible(false);
                            Menu.super.dispose();
                            optionField.setText("");
                            break;
                        default:
                            Info info = new Info("Eletec");
                            info.setInfoLabel("Opcao Invalida!");
                            optionField.setText("");
                            info.setVisible(true);
                            optionField.setText("");
                            break;
                    }
                } catch(NumberFormatException e){
                    Info info = new Info("Eletec");
                    info.setInfoLabel("Opcao Invalida!");
                    optionField.setText("");
                    info.setVisible(true);
                }

            }
        });
        sairButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Menu.super.setVisible(false);
                Menu.super.dispose();
            }
        });
    }

    public void addEquipamento(Object equipamento){
        equipamentos.add(equipamento);
    }
}
