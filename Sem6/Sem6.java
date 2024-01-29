package Sem6;

public class Sem6 {
    int length = 10;
    int first = 0;
    int last = length - 1;

    public static void binarySearch(int[] array, int first, int last, int item) {
        int position;

        position = (first + last) / 2;

        while ((array[position] != item) && (first <= last)) {
            if (array[position] > item) {
                last = position - 1;
            } else {
                first = position + 1;
            }
            position = (first + last) / 2;
        }
        if (first <= last) {
            System.out.println(item + " является " + ++position + " элементом в массиве");

        } else {
            System.out.println("Элемент не найден в массиве");
        }
    }
}
