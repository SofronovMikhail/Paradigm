public class Check {
    public boolean checked(String[][] arr) {
        int countX = 0;
        int count0 = 0;
        for (int i = 0; i < 3; i++) {
            countX = 0;
            count0 = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == "o") {
                    count0 = count0 + 1;
                }
                if (arr[i][j] == "x") {
                    countX = countX + 1;
                }
                if (count0 == 3) {
                    System.out.println("Победили Нули");
                    return true;

                }
                if (countX == 3) {
                    System.out.println("Победили Иксы");
                    return true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            countX = 0;
            count0 = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[j][i] == "o") {
                    count0 = count0 + 1;
                }
                if (arr[j][i] == "x") {
                    countX = countX + 1;
                }
                if (count0 == 3) {
                    System.out.println("Победили Нули");
                    return true;

                }
                if (countX == 3) {
                    System.out.println("Победили Иксы");
                    return true;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            if (arr[i][i] == "o") {
                count0 = count0 + 1;
            }
            if (arr[i][i] == "x") {
                countX = countX + 1;
            }
            if (count0 == 3) {
                System.out.println("Победили Нули");
                return true;
            }
            if (countX == 3) {
                System.out.println("Победили Иксы");
                return true;
            }
        }
        if (arr[2][0] == "o" && arr[1][1] == "o" && arr[0][2] == "o") {
            System.out.println("Победили Нули");
            return true;
        }
        if (arr[2][0] == "x" && arr[1][1] == "x" && arr[0][2] == "x") {
            System.out.println("Победили Иксы");
            return true;
        }

        return false;
    }
}