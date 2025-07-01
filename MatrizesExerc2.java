import java.util.Scanner;
import java.util.HashSet;

public class MatrizesExerc2 {
    
    public static void main (String[] args) {

        int [][] matriz = new int[3][5];
        Scanner scanner = new Scanner(System.in); 
        int i = 0; int j = 0; int pares = 0; int impares = 0;

        for(i = 0; i < 3; i++) {
            for(j = 0; j < 5; j++) {
                System.out.print("Digite um numero: ");
                matriz[i][j] = scanner.nextInt();

                if(matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
                
            }
        }

        System.out.println("Matriz gerada: ");
        for(int a = 0; a < 3; a++) {
            for(int b = 0; b < 5; b++) {
                System.out.print(matriz[a][b]+" ");
            }
            System.out.println();
        }

        if(repetido(matriz)) {
            System.out.println("A matriz contem numeros repetidos");
        } else {
            System.out.println("Todos os numeros da matriz sao unicos");
        } 

        System.out.println("Dentre os numeros digitados, "+pares+" sao pares e "+impares+" sao impares");
    }

    public static boolean repetido(int[][] matriz) {
        HashSet<Integer> numeros = new HashSet<>();

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz.length; j++) {
                if(numeros.contains(matriz[i][j])) {
                    return true;
                }
                numeros.add(matriz[i][j]);
            }
        }

        return false;
    }
}
