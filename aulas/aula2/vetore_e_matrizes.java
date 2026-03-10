package aula2;

import java.util.Scanner;

public class vetore_e_matrizes {

    public static void main(String[] args) {

            Scanner teclado = new Scanner(System.in);
        
    //     int[] vetor = new int[5];
    //     for (int i = 0; i < vetor.length; i++) {
    //         System.out.println("Digite um número inteiro para o vetor:");
    //         vetor[i] = teclado.nextInt();
    //     }

    //     for (int i = 0; i < vetor.length; i++) {
            
    //         System.out.println("vetor " + i + " = " + vetor[i]);

    //     }

    // }
    
    int [][] matriz = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digite um número inteiro para a matriz:");
                matriz[i][j] = teclado.nextInt();
            }
        }
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 2; j++) {
            System.out.print(matriz[i][j] + " \t");
            }
            System.out.println();
        }
        teclado.close();
    }
}
