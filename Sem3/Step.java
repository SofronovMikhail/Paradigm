import java.util.Scanner;

public class Step {
    Scanner in = new Scanner(System.in);

    public void stepedX(String[][] arr) {

        System.out.print("Введите номер строки от 0 до 2: ");
        int row = in.nextInt();
        while (row < 0 || row > 2) {
            System.out.println("Введите значение от 0 до 2");
            row = in.nextInt();
        }
        System.out.print("Введите номер столбца от 0 до 2: ");
        int col = in.nextInt();
        while (col < 0 || col > 2) {
            System.out.println("Введите значение от 0 до 2");
            col = in.nextInt();
        }
        while(arr[row][col]=="x"|| arr[row][col]=="o"){
            System.out.println("Ячейка занята, попробуйте снова");
            System.out.print("Введите номер строки от 0 до 2: ");
            row = in.nextInt();
            System.out.print("Введите номер столбца от 0 до 2: ");
            col = in.nextInt();
        }
        arr[row][col] = "x";
    }

    public void stepedO(String[][] arr) {
        System.out.print("Введите номер строки от 0 до 2: ");
        int row = in.nextInt();
        while (row < 0 || row > 2) {
            System.out.println("Введите значение от 0 до 2");
            row = in.nextInt();
        }
        System.out.print("Введите номер столбца от 0 до 2: ");
        int col = in.nextInt();
        while (col < 0 || col > 2) {
            System.out.println("Введите значение от 0 до 2");
            col = in.nextInt();
        }
        while(arr[row][col]=="x"|| arr[row][col]=="o"){
            System.out.println("Ячейка занята, попробуйте снова");
            System.out.print("Введите номер строки от 0 до 2: ");
            row = in.nextInt();
            System.out.print("Введите номер столбца от 0 до 2: ");
            col = in.nextInt();
        }
        arr[row][col] = "o";
        
    }
    
}

