package views;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info extends JFrame {
    private JPanel mainPanel;
    private JButton okButton;
    private JLabel infoLabel;

    public Info(String title) {
        super(title);

        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Info.super.setVisible(false);
                Info.super.dispose();
            }
        });
    }

    public void setInfoLabel(String text){
        this.infoLabel.setText(text);
    }
}