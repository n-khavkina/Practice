package OOP.InterfaceEx;

public class ArrayOfNumber implements Sort {

    @Override
    public void sortCapacity(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
}
public void  printArray (int[] arr){
    for (int num : arr){
        System.out.println(num);
    }
    System.out.println();
    }
}

class Test {
    public static void main(String[] args) {
        ArrayOfNumber array = new ArrayOfNumber();
        int[] numbers = {23, 6865, 9, 125};
        System.out.println("Массив до сортировки: ");
        array.printArray(numbers);
        array.sortCapacity(numbers);
        System.out.println("Массив после сортировки: ");
        array.printArray(numbers);


    }
}
