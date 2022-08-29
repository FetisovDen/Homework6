import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

//Задание 1
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (i == arr.length - 1) {
                System.out.println("Сумма трат за месяц составила " + sum + " рублей");
            }
        }
//Задание 2

        int maxWaste = -1;
        int minWaste = sum;
        for (int i1 : arr) {
            if (i1 > maxWaste) {
                maxWaste = i1;
            }
        }
        for (int i2 : arr) {
            if (i2 < minWaste) {
                minWaste = i2;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей");

//Задание 3
        double avgWaste = 0;
        double sum2 = 0;
        for (int i3 : arr) {
            sum2 += i3;
        }
        avgWaste = sum2 / arr.length;
        System.out.println("Средняя сумма трат за месяц составила " + avgWaste + " рублей");


//Задание 4

       char [] reverseFull = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for(int i9 = reverseFull.length -1 ; i9 >= 0; i9 = i9 - 1 ) {
            System.out.print(reverseFull[i9]);}




    }


int[] arr = generateRandomArray();
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;
        }

    }