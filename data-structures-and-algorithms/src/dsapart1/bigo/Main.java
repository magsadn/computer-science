package dsapart1.bigo;

public class Main {
    public static void log1(int[] numbers) {
        //O(2) -> O(1)
        System.out.println(numbers[0]);
        System.out.println(numbers[0]);
    }

    public static void log2(int[] numbers) {
        //O(1+n+1) = O(2+n) -> O(n)
        System.out.println();//O(1)
        for (int number : numbers) {//O(n)
            System.out.println(number);
        }
        System.out.println();//O(1)
    }

    public static void log3(int[] numbers) {
        //O(n + n) = O(2n) -> O(n)
        for (int number : numbers) {//O(n)
            System.out.println(number);
        }
        for (int i = 0; i < numbers.length; i++) {//O(n)
            System.out.println(numbers[i]);
        }
    }

    public static void log4(int[] numbers, String[] names) {
        //O(n + m) -> O(n)
        for (int number : numbers) {//O(n)
            System.out.println(number);
        }
        for (String name : names) {//O(n)
            System.out.println(names);
        }
    }

    public static void log5(int[] numbers) {
        // O(n * n) = O(n^2)
        for (int first : numbers) //O(n)
            for (int second : numbers) //O(n)
                System.out.println(first + ", " + second);
    }

    public static void log6(int[] numbers) {
        // O(n + n * n) = O(n + n2) -> O (n^2)
        for (int number : numbers) //O(n)
            System.out.println(number);
        for (int first : numbers) //O(n)
            for (int second : numbers) //O(n)
                System.out.println(first + ", " + second);
    }

    public static void log7(int[] numbers) {
        // O(n * n * n) = O(n^3)
        for (int first : numbers) //O(n)
            for (int second : numbers) //O(n)
                for (int third : numbers) //O(n)
                System.out.println(first + ", " + second + ", " + third);
    }

    public static void greet1(String[] names) {
        //O(1) space
        for (int i = 0; i<names.length; i++){
            System.out.println("Hi " + names[i]);
        }
    }

    public static void greet2(String[] names) {
        //O(n) space
        String [] copy = new String[names.length];
        for (int i = 0; i<names.length; i++){
            System.out.println("Hi " + names[i]);
        }
    }
}
