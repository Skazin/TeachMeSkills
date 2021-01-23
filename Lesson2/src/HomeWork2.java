import java.util.Scanner;

public class HomeWork2 {

        public static void main(String[] args) {

//            System.out.println(sum(10, 20));
//            System.out.println(sum(Integer.MAX_VALUE, Integer.MAX_VALUE));
//            System.out.println(max(50, 49));
//            System.out.println(max(49, 50));
//            System.out.println(max(50, 50));
//            System.out.println(average(new int[]{1, 2, 3, 4, 5}));
//            System.out.println(max(new int[]{1, 2, 3, 4, 5, 100, 99}));
            System.out.println(calculateHypotenuse());
        }

        /**
         * Method returns sum of "a" and "b",
         * @param a term of addition №1
         * @param b term of addition №2
         * @return result of addition, if sum of a and b is more then int can store -- returns -1;
         **/
        public static int sum(int a, int b) {
            long c = (long) a + b;
            if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE) return -1;
            else return a + b;
        /*
        без else:
        if (c > Integer.MAX_VALUE || c < Integer.MIN_VALUE) return -1;
        if (c < Integer.MAX_VALUE || c > Integer.MIN_VALUE) return a + b;
         */
        }

        /**
         * Method returns larger of two numbers ("a" and "b")
         * @param a first number
         * @param b second number
         * @return the biggest of the two numbers, if the two numbers are equal returns -1
         */
        public static int max(int a, int b) {
            if(a > b) return a;
            else if(a == b) return -1;
                else return b;
        /*
        без else:
        if (a > b) return a;
        if (a < b) return b;
        if (a == b) return -1;
         */
        }

        /**
         * Method returns avg. value of given array (sum of all elements of array divided by array length).
         * @param array investigated array
         * @return average value of investigated array
         */
        public static double average(int[] array) {
            int sum = 0;
            int result;
            for (int j : array) {
                sum += j;
            }
            result = sum / array.length;
            return result;
        }

        /**
         * Method returns max element of array
         * @param array investigated array
         * @return max element of that array
         **/
        public static int max(int[] array) {
            int max = array[0];
            for (int j : array) {
                max = Math.max(max, j);
            }
            return max;
        }

        /**
         * 1. Method reads two ints from console
         * 2. Using the Pythagorean theorem calculates value of hypotenuse if value of two given ints -- value of triangle legs
         * @return hypotenuse
         */
        public static double calculateHypotenuse() {
            Scanner in = new Scanner(System.in);
            System.out.println("Необходимо ввести два катета.");
            System.out.print("Введите катет №1: ");
            double a = in.nextDouble();
            System.out.print("Введите катет №2: ");
            double b = in.nextDouble();
            return Math.hypot(a, b);
        }
        /*
        Без Math.hypot
        double c = a * a + b * b;
        return Math.sqrt(c);
         */
}

