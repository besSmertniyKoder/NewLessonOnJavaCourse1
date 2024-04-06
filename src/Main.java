import test.Main2;

public class Main {
    public  String text2;
    public static void main(String[] args) {
        Main2 main2 = new Main2();


        System.out.println("hello world!");//sout - intelliji
        int a = 10;                                 // sysout - vs
        System.out.println("hello my age is " + a);
        String text = "i love java";
        boolean b = true; //false by default
        byte byt = 127;
        short sh = 10000;
        int it = sh;
        byt = (byte) it;
//        System.out.println(byt);
        long l = 1000000000;
        double d = 45.6;
        float f = 78.0f;
        int[] intArray = new int[1000]; // просто задаем размерность массива
        int[] array = {1, 4, 6, 8, 4, 9, 3, 5, 85, 3, 6, 9, 4, 2, 8, 2, 8, 2, 9};
        System.out.println(intArray.length);
        System.out.println(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 85) {
                array[i] = 709;

                System.out.println("Мы нашли заданное число, ура! :" + array[i]);
            } else if (array[i] == 9) {
                System.out.println("Мы нашли девятку!");

            }
            System.out.println("числа в массиве: " + array[i]);

        }



    }
}
