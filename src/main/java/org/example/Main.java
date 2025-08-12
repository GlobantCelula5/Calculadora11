package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\u001B[35m*** CALCULADORA ***");

        String opcionMenu;
        do {
            System.out.print("\nQue quieres hacer?" +
                    "\n 1. Sumar dos numeros" +
                    " 2. Restar dos numeros" +
                    " 3. Multiplicar dos numeros" +
                    " 4. Dividir dos numeros " +
                    " 5. salir " +
                    "Elije el numero de opcion: ");
            opcionMenu = scanner.nextLine();
        }while (opcionMenu.equalsIgnoreCase("2"));
    }

    public static Integer sumarDosNumero(Integer numeroUno, Integer numeroDos){
        return numeroUno+numeroDos;

    }

    public static Integer restarDosNumero(Integer numeroUno, Integer numeroDos){
        return numeroUno-numeroDos;
    }

    public static Integer multiplicarDosNumero(){

    }

    public static Integer dividirDosNumero(Integer numero1, Integer numero2){
        return numero1/numero2;

    }
}