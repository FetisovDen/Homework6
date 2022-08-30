import java.util.Arrays;



public class Main {
    public static void main(String[] args) {

//Задание 1
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        {System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        }
//Задание 2

        double maxWaste = -1;
        double minWaste = sum;
        for (int elem : arr) {
            if (elem > maxWaste) {
                maxWaste = elem;
            }
        }
        for (int part : arr) {
            if (part < minWaste) {
                minWaste = part;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWaste + " рублей. Максимальная сумма трат за день составила " + maxWaste + " рублей");

//Задание 3
        double avgWaste = sum / arr.length;
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