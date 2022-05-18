import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

import models.Equipamento;
import models.Notebook;
import models.Smartphone;
import models.Smartwatch;

public class Main {

    public static void serializarObjeto(ArrayList<Object> equipamentos, String file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(equipamentos);
            oos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ArrayList<Object> deserializarObjeto(String file){
        ArrayList<Object> equipamentos = new ArrayList<Object>();
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            equipamentos = (ArrayList<Object>)ois.readObject();
            return equipamentos;
        } catch (FileNotFoundException e) {
            return equipamentos;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    public static Notebook adicionarNotebook(){
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Marca: ");
                String marcaNote = sc.nextLine();

                System.out.print("Modelo: ");
                String modeloNote = sc.nextLine();

                System.out.print("Tamanhop da tela: ");
                String tamanhoDaTelaNote = sc.nextLine();

                System.out.print("Preco: ");
                float precoNote = sc.nextFloat();

                System.out.print("Processador: ");
                sc.nextLine();
                String processadorNote = sc.nextLine();

                System.out.print("Memoria: ");
                String memoriaNote = sc.nextLine();

                System.out.print("Teclado retroiluminado: ");
                boolean tecladoRetroiluminadoNote = sc.nextBoolean();

                System.out.print("Quantidade de portas USB: ");
                int qntDePortasUsbNote = sc.nextInt();

                System.out.print("Sistema Operacional: ");
                sc.nextLine();
                String sistemaOperacionalNote = sc.nextLine();

                return new Notebook(marcaNote, modeloNote, tamanhoDaTelaNote, precoNote, processadorNote, memoriaNote, tecladoRetroiluminadoNote, qntDePortasUsbNote, sistemaOperacionalNote);
            } catch(InputMismatchException e) {
                System.out.println("Tipo de dado invalido");
            }
        }
    }

    public static Smartphone adicionarSmartphone() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Marca: ");
                sc.nextLine();
                String marcaPhone = sc.nextLine();

                System.out.print("Modelo: ");
                String modeloPhone = sc.nextLine();

                System.out.print("Tamanhop da tela: ");
                String tamanhoDaTelaPhone = sc.nextLine();

                System.out.print("Preco: ");
                float precoPhone = sc.nextFloat();

                System.out.print("Quantidade de sim card: ");
                int qntSimCardPhone = sc.nextInt();

                System.out.print("Quantidade de cameras: ");
                int qntDeCamerasPhone = sc.nextInt();

                System.out.print("NFC: ");
                boolean NFCPhone = sc.nextBoolean();

                System.out.print("Impressao digital: ");
                boolean impressaoDigitalPhone = sc.nextBoolean();

                System.out.print("Armazenameto: ");
                sc.nextLine();
                String armazenamentoPhone = sc.nextLine();

                return new Smartphone(marcaPhone, modeloPhone, tamanhoDaTelaPhone, precoPhone, qntSimCardPhone, qntDeCamerasPhone, NFCPhone, impressaoDigitalPhone, armazenamentoPhone);
            }catch (InputMismatchException e){
                System.out.println("Tipo de dado invalido");
            }
        }
    }

    public static Smartwatch adicionarSmartwatch() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("Marca: ");
                sc.nextLine();
                String marcaWatch = sc.nextLine();

                System.out.print("Modelo: ");
                String modeloWatch = sc.nextLine();

                System.out.print("Tamanho da tela: ");
                String tamanhoDaTelaWatch = sc.nextLine();

                System.out.print("Preco: ");
                float precoWatch = sc.nextFloat();

                System.out.print("Tipo de pulseira: ");
                sc.nextLine();
                String tipoPulseiraWatch = sc.nextLine();

                System.out.print("Resistente a agua: ");
                boolean resistenteAguaWatch = sc.nextBoolean();

                System.out.print("Slot para sd card: ");
                boolean slotSdCardWatch = sc.nextBoolean();

                System.out.print("Peso: ");
                sc.nextLine();
                String pesoWatch = sc.nextLine();

                System.out.print("Armazenamento: ");
                String armazenamentoWatch = sc.nextLine();

                return new Smartwatch(marcaWatch, modeloWatch, tamanhoDaTelaWatch, precoWatch, tipoPulseiraWatch, resistenteAguaWatch, slotSdCardWatch, pesoWatch, armazenamentoWatch);
            } catch (InputMismatchException e){
                System.out.println("Tipo de dado invalido");
            }
        }
    }

    public static void exibirMenuPrincipal(){
        System.out.println("Bem vindo A loja Eletec");
        System.out.println("Selecione uma das opcoes:");
        System.out.println("1 - Adicionar Equipamento");
        System.out.println("2 - Exibir Equipamento");
        System.out.println("3 - Limpar Equipamento");
        System.out.println("4 - Gravar Equipamento");
        System.out.println("5 - Recuperar Equipamento");
        System.out.println("9 - Sair");
        System.out.println("");
        System.out.print("Digite uma opcao: ");
    }

    public static void exibirMenuEquipamentos(){
        System.out.println("Escolha um tipo de equipamento");
        System.out.println("1 - Notebook");
        System.out.println("2 - Smartphone");
        System.out.println("3 - Smartwatch");
        System.out.println("9 - Voltar");
        System.out.print("\nEquipamento: ");
    }

    public static void main(String[] args){
        boolean executar = true;
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> equipamentos = new ArrayList<Object>();

        while (executar) {
            exibirMenuPrincipal();

            int opcao;

            try {
                opcao = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opcao invalida");
                sc.nextLine();
                continue;
            }
            while(executar) {
                switch (opcao) {
                    case 1:
                        exibirMenuEquipamentos();

                        int equipamento;

                        try {
                            equipamento = sc.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Opcao invalida");
                            sc.nextLine();
                            continue;
                        }

                        switch (equipamento) {
                            case 1:
                                System.out.println("Insira os dados para adicionar um notebook");
                                Notebook notebook = adicionarNotebook();
                                equipamentos.add(notebook);
                                System.out.print("\nNotebook salvo com sucesso!\n\n");
                                break;
                            case 2:
                                System.out.println("Insira os dados para adicionar um Smartphone");
                                Smartphone smartphone = adicionarSmartphone();
                                equipamentos.add(smartphone);
                                System.out.print("\nSmartphone salvo com sucesso!\n\n");
                                break;
                            case 3:
                                System.out.println("Insira os dados para adicionar um Smartwatch");
                                Smartwatch smartwatch = adicionarSmartwatch();
                                equipamentos.add(smartwatch);
                                System.out.print("\nSmartwatch salvo com sucesso!\n\n");
                                break;
                            case 9:
                                System.out.println("Sair");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("\nTodos os equipamentos na memoria:");

                        for (Object equip : equipamentos) {
                            System.out.println(equip.toString());
                        }

                        System.out.println("\n");
                        break;
                    case 3:
                        equipamentos.clear();

                        System.out.println("Todos os objetos foram limpados da memoria.\n");
                        break;
                    case 4:
                        System.out.print("\nDigite o nome do arquivo para salvar: ");
                        sc.nextLine();
                        String salvarArquivo = sc.nextLine();
                        serializarObjeto(equipamentos, salvarArquivo);
                        System.out.println("Arquivo salvo com sucesso\n");
                        break;
                    case 5:
                        System.out.print("Digite o nome do arquivo para recuperar: ");
                        sc.nextLine();
                        String recuperarArquivo = sc.nextLine();
                        equipamentos = deserializarObjeto(recuperarArquivo);
                        if (equipamentos.isEmpty()) {
                            System.out.println("Arquivo nao encontrado\n");
                        } else {
                            System.out.println("Arquivo recuperado com sucesso\n");
                        }
                        break;
                    case 9:
                        executar = false;
                        break;
                    default:
                        System.out.println("Opcao invalida, digite um numero de 1 a 5, ou digite 9 para sair.");
                }
                break;
            }
        }
    }


}
