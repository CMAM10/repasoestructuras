package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String usuarioRegistradoBD="user024";
        String contraseñaRegistradaBD="admin123";
        String usuarioDigitado;
        String contarseñaDigitada;

        Scanner leerTeclado=new Scanner(System.in);
        Integer contador=0;
        String colorAzul="\u001B[34m";
        String colorVerde="\u001B[32m";
        String colorRojo="\u001B[31m";

        System.out.println(colorAzul+"\nBienvenido al sistema de control SAS: 🤖");

        while(contador<3){

            System.out.print(colorAzul+"\nDigita tu nombre de usuario: ");
            usuarioDigitado=leerTeclado.nextLine();

            System.out.print(colorAzul+"Digita tu contarseña: ");
            contarseñaDigitada=leerTeclado.nextLine();

            if(usuarioDigitado.equals(usuarioRegistradoBD) && contarseñaDigitada.equals(contraseñaRegistradaBD)){
                System.out.println(colorVerde+"\nBienvenido 🚀");
            }else{
                System.out.println(colorRojo+"\nRevisa los datos ingresados 💩");
                contador++;
            }



        }

    }
}