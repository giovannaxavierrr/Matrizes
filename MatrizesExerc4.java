public class MatrizesExerc4 {
    
    public static void main (String[] args) {

        int [][] matriz1 = {
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1},
            {1,1,1,1}
        };
        int [][] matriz2 = {
            {1,1,1,1},
            {1,0,0,1},
            {1,0,0,1},
            {1,1,1,1}
        };
        int [][] matriz3 = {
            {1,0,0,0},
            {1,1,0,0},
            {1,1,1,0},
            {1,1,1,1}
        };

        System.out.println("Matriz a)");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(matriz1[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Matriz b)");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(matriz2[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        System.out.println("Matriz c)");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                if(matriz3[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
