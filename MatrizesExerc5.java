import java.util.Scanner;

public class MatrizesExerc5 {
    
    public static void main (String[] args) {

        int [][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os 9 numeros da matriz 3x3: ");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print("[ "+i+"][ "+j+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        boolean magico = true;
        int somaEsperada = 0;

        //soma da primeira linha como referencia
        for(int j = 0; j < 3; j++) {
            somaEsperada += matriz[0][j];
        }

        //verifica as outras linhas
        for(int i = 0; i < 3; i++) {
            int somaLinha = 0;
            for(int j = 0; j < 3; j++) {
                somaLinha += matriz[i][j];
            }
            if(somaLinha != somaEsperada) {
                magico = false;
            }
        }

        //verifica as colunas
        for(int j = 0; j < 3; j++) {
            int somaColuna = 0;
            for(int i = 0; i < 3; i++) {
                somaColuna += matriz[i][j];
            }
            if(somaColuna != somaEsperada) {
                magico = false;
            }
        }

        //verifica a diagonal principal
        int diagPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        if(diagPrincipal != somaEsperada) {
            magico = false;
        }

        //verifica a diagonal secundaria
        int diagSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if(diagSecundaria != somaEsperada) {
            magico = false;
        }

        if(magico == true) {
        System.out.print("Essa matriz eh um quadrado magico!");
        } else {
            System.out.print("Essa matriz nao eh um quadrado magico");
        }
    }
}
