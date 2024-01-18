public class Program {

    public static void main(String[] args) {
        Check check = new Check();
        Step step = new Step();
        String[][] array = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = "n";
            }
        }
        for (int i = 0; i < 3; i++) {
                System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
            }
        while (check.checked(array) != true) {
            step.stepedX(array);
            for (int i = 0; i < 3; i++) {
                System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
            }
            check.checked(array);
            if(check.checked(array) != true){
                step.stepedO(array);
                for (int i = 0; i < 3; i++) {
                    System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                }
            }
            check.checked(array);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i][0] + " " + array[i][1] + " " + array[i][2]);
        }
    }
}