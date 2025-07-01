import java.util.Random;

public class MatrizesExerc1 {

    public static void main (String[] args) {

        int somaImpar = 0;
        int [][] matriz =  new int[5][5];
        Random random = new Random();
        int i = 0;
        int y = 0;
        int a = 0;
        int b = 0;
        int g = 0;
        int h = 0;

        for(i = 0; i < 5; i++) {
            for(y = 0; y < 5; y++) {
                matriz[i][y] = random.nextInt(51);
                if(matriz[i][y] % 2 != 0) {
                    somaImpar += matriz[i][y];
                }
            }
        }
        System.out.println("Matriz gerada: ");

        for(int x = 0; x < 5; x++) {
                for(int z = 0; z < 5; z++) {
                    System.out.print(matriz[x][z]+" ");
                }
                System.out.println();
        }

        System.out.println("\nSoma das linhas: ");
        for(a = 0; a < 5; a++) {
            int somaLinha = 0;
            for(b = 0; b < 5; b++) {
                somaLinha += matriz[a][b];
            }
            System.out.println("Linha "+(a+1)+": "+somaLinha);
        }

        System.out.println("\nSoma das colunas: ");
        for(g = 0; g < 5; g++) {
            int somaColuna = 0;
            for(h = 0; h < 5; h++) {
                somaColuna += matriz[h][g];
            }
            System.out.println("Coluna "+(g+1)+": "+somaColuna);

        }

        for(int c = 0; i < 5; c++) {
            for(int d = 0; d < 5; d++) {
                if(matriz[c][d] % 2 != 0) {
                    somaImpar += matriz[c][d];
                }
            }
        }
        System.out.println("\nSoma dos numeros impares: "+somaImpar);        
    }
}
