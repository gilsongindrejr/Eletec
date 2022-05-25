import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

import models.Equipamento;
import models.Notebook;
import models.Smartphone;
import models.Smartwatch;
import views.Menu;

import javax.swing.*;

public class Main {

    public static void main(String[] args){
        JFrame frame = new Menu("Eletec");
        frame.setVisible(true);
    }
}
