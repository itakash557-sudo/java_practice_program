public class continuestatement {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; //skip the current iteration
            }
            System.out.println(i);
        }
    }
}
