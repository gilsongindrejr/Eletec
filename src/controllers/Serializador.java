package controllers;

import views.Info;

import java.io.*;
import java.util.ArrayList;

public class Serializador {

    public static void serializarObjeto(ArrayList<Object> equipamentos, String file){
        try{
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(equipamentos);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
            e.printStackTrace();
            return equipamentos;
        } catch (IOException e) {
            e.printStackTrace();
            return equipamentos;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return equipamentos;
        }
    }

    public static boolean checarArquivo(String file){
        ArrayList<Object> equipamentos = new ArrayList<Object>();
        try{
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            equipamentos = (ArrayList<Object>)ois.readObject();
            return true;
        } catch (IOException e) {
            return false;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }
}
