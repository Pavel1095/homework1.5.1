public class Main {
    public static void main(String[] args) {
        System.out.println("Массивы");
        int[] arrayFirst = new int[3];
        arrayFirst[0] = 1;
        arrayFirst[1] = 2;
        arrayFirst[2] = 3;
        for (int i = arrayFirst.length - 1; i >= 0; i--)
            if (i == arrayFirst.length - 3) {
                System.out.print(arrayFirst[i]);
            } else {
                System.out.print(arrayFirst[i] + ",");
            }
        System.out.println("");
        double[] arraySecond = {1.57, 7.654, 9.986};
        for (int i = arraySecond.length - 1; i >= 0; i--)
            if (i == arraySecond.length - 3) {
                System.out.print(arraySecond[i]);
            } else {
                System.out.print(arraySecond[i] + ",");
            }
        System.out.println();
        int[] arrayThird = {1, 2, 3, 4, 5};
        for (int i = arrayThird.length - 1; i >= 0; i--)
            if (i == arrayThird.length - 5) {
                System.out.print(arrayThird[i]);
            } else {
                System.out.print(arrayThird[i] + ",");
            }
        System.out.println();
        for (int i = 0; i < arrayFirst.length; i++) {
            if (arrayFirst[i] % 2 != 0) {
                arrayFirst[i] = arrayFirst[i] + 1;
            }
            if (i < arrayFirst.length - 1)
                System.out.print(arrayFirst[i] + ",");
            else {
                System.out.print(arrayFirst[i]);
            }
        }
    }
}