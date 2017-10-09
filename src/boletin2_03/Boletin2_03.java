package boletin2_03;

import java.util.Scanner;

public class Boletin2_03 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); //Inicia la entrada de datos
        float euros, dolares, cambio;   //Iniciamos las variables
        System.out.println("Introduce euros");
        euros= sc.nextFloat();
        System.out.println("introduce cambio");
        cambio= sc.nextFloat();
        dolares= euros*cambio;
        System.out.println(euros+" € son "+dolares+" $");
    }
    
}
