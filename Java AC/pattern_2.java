public class pattern_2 {
    public static void main(String[] args) {
        // *****
        // *   *
        // *   *
        // *****

        int n = 5;
        int m = 4;
        for (int i = 1;i <= m;i++){
            for (int j = 1;j <= n;j++){
                if (i == 1 || j == 1 || i == m || j == n){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
