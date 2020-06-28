package piscina;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author lucasmorgado
 */
public class Piscina {

    public static void main(String[] args) {

        /*
        Usando o computador portátil dela, os dois informam um inteiro N e uma 
        sequência aleatória de inteiros de tamanho N é gerada.
         */
        Scanner ler = new Scanner(System.in);
        Random gerador = new Random();

        int n;
        int lista[];

        System.out.println("Digite o tamanho da lista a ser criada: ");
        n = ler.nextInt();

        lista = new int[n];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = gerador.nextInt(5);
            System.out.print(lista[i] + " ");
        }

        ordena(lista, n);

        System.out.println("\nNumeros Ordenados: ");
        for (int numero : lista) {
            System.out.print(numero + " ");
        }

    }

    public static void ordena(int lista[], int n) {
        int aux;
        int cont = 0;
        for (int x = 0; x < n; x++) {
            for (int y = x + 1; y < lista.length; y++) {
                if (lista[x] > lista[y] && lista[x] != lista[y]) {
                    aux = lista[x];
                    lista[x] = lista[y];
                    lista[y] = aux;
                    cont++;
                }
            }
        }
        if (cont%2 == 0) {
            System.out.println("\nVencedor: Carlos\n");
            System.out.print("\nPassos: \n" + cont);
        } else {
            System.out.println("\nVencedor: Marcelo\n");
            System.out.println("\nPassos: \n" + cont);
        }
    }
}
