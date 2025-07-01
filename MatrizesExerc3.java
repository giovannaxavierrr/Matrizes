import java.util.Random;

public class MatrizesExerc3 {
    
    public static void main(String[] args) {

        int [][] matriz = new int[4][4];
        Random random = new Random();

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(101);
            }
        }

        System.out.println("Matriz gerada: ");

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta: ");

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(matriz[j][i]+" ");
            }
            System.out.println();
        }

        System.out.println("Diagonal principal:");
        for(int i = 0; i < 4; i++) {
            System.out.print(matriz [i][i]+" ");
        }

        System.out.println("\nDiagonal secundaria:");
        for(int i = 0; i < 4; i++) {
            System.out.print(matriz[i][3-i]+" ");
        }

    }
}
