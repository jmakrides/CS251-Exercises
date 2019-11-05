public class ArrayMethods {

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5};
        printArray(reverse(array));
    }

    public static int[] reverse(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.println("The values are: ");
        for (int item : array) {
            System.out.println(item);
        }
    }

}
