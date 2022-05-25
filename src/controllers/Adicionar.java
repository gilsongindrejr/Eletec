package controllers;

import models.Notebook;
import models.Smartphone;
import models.Smartwatch;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class Adicionar {
    public static Notebook Notebook(
            String marca,
            String modelo,
            String tamanhoDaTela,
            float preco,
            String processador,
            String memoria,
            boolean tecladoRetroiluminado,
            String qntDePortasUsb,
            String sistemaOperacional){
        while (true) {
            try {
                return new Notebook(marca, modelo, tamanhoDaTela, preco, processador, memoria, tecladoRetroiluminado, qntDePortasUsb, sistemaOperacional);
            } catch(InputMismatchException e) {
                e.printStackTrace();
            }
        }
    }

    public static Smartphone adicionarSmartphone(
            String marca,
            String modelo,
            String tamanhoDaTela,
            float preco,
            String qntSimCard,
            int qntDeCameras,
            boolean NFC,
            boolean impressaoDigital,
            String armazenamento) {
        while (true) {
            try {
                return new Smartphone(marca, modelo, tamanhoDaTela, preco, qntSimCard, qntDeCameras, NFC, impressaoDigital, armazenamento);
            }catch (InputMismatchException e){
                e.printStackTrace();
            }
        }
    }

    public static Smartwatch adicionarSmartwatch(
            String marca,
            String modelo,
            String tamanhoDaTela,
            float preco,
            String tipoPulseira,
            boolean resistenteAgua,
            boolean slotSdCard,
            String peso,
            String armazenamento
    ){while (true) {
        try {
            return new Smartwatch(marca, modelo, tamanhoDaTela, preco, tipoPulseira, resistenteAgua, slotSdCard, peso, armazenamento);
        } catch (InputMismatchException e){
            e.printStackTrace();
        }
    }}
}
