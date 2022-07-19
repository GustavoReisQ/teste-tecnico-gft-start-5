package br.com.gft.desafiotecnico.exercicio01.application;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);

        int[] valoresNumeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        String[] valoresRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        while(true){

        int numero = digitar.nextInt();
        if (numero == 0 && numero < 4000)
            break;
        System.out.printf("%-4d ", numero);

        int posicao = 0;
        while (numero > 0 && numero < 4000) {

            if (numero >= valoresNumeros[posicao]) {
                System.out.print(valoresRomanos[posicao]);
                numero -= valoresNumeros[posicao];
            } else {
                posicao++;
            }
            }
        break;
        }
        digitar.close();
    }
}
