package classwork;
import java.util.Scanner;
import java.util.Random;
public class Lesson10 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        /*
-------23.08.2022--------------------------------------------------------------------------------------------------
         */
        //#1
        /*
        int sum = 0;
        int[]a = new int[12];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(12)-5;
        }
        for (int i = 0;i<a.length;i++){
            //System.out.print(a[i]+" ");
            sum=sum+a[i];
        }
        System.out.println("\n"+sum);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //#2
        /*
        int mult = 1;
        int[]a = new int[13];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(21)-12;
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]<0)mult = mult * a[i];
        }
        System.out.println("\n"+mult);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //#3
        /*
        int quant = 0;
        int[] a = new int[11];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(20);
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]%3==0||a[i]%5==0||a[i]%7==0)quant++;
        }
        System.out.println("\n"+quant);
         */
        /*
-------------------------------------------------------------------------------------------------------------------
         */
        //#4
        /*
        int sum = 0;
        int[] a = new int[15];
        for (int i = 0;i<a.length;i++){
            a[i] = gen.nextInt(25);
        }
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
            if (a[i]%2==0)sum=sum+a[i];
        }
        System.out.println("\n"+sum);
         */
        /*
------------------------------------------------------------------------------------------------------------------
         */
        //#4
        /*
        int[] a = new int[15];
        fillArray(a);
        showArray(a);
        sumChet(a);
        */
        /*
------------------------------------------------------------------------------------------------------------
         */
        /*
        int[] arr = new int[10];
        fillRandom(arr,-10,10);
        showArray(arr);
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Series1. Дан массив из целых чисел. Найти их сумму.
        /*
        int[] array = new int[10];
        fillRandom(array, -5, 15);
        System.out.println("Сумма целых чисел: "+sumOfArray(array));
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Series2. Дан массив из десяти целых чисел. Найти их произведение.
        /*
        int[] array = new int[10];
        fillRandom(array, -5, 15);
        System.out.println("Произведение целых чисел: "+multOfArray(array));
        */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Series3. Даны массив из десяти вещественных чисел. Найти их среднее арифметическое.
        /*
        int[] array = new int[10];
        fillRandom(array, -5, 15);
        System.out.println("Среднее арифметическое: "+avgArray(array));
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Series14. Дано целое число K и массив из десяти целых чисел.
        //Вывести количество чисел в наборе, меньших K
        /*
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        int[] array = new int[10];
        fillRandom(array, -10, 10);
        showArray(array);
        System.out.println("Количество элементов меньше К: "+countLessK(array, k));
         */
        /*
------------------------------------------------------------------------------------------------------------
         */
        //Series15. Дано целое число K и массив из десяти целых чисел.
        //Вывести номер первого числа в наборе, большего K. Если таких чисел нет, то вывести -1.
        /*
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        int[] array = new int[10];
        fillRandom(array, -10, 10);
        System.out.println("Номер первого числа больше К:"+findNumLessK(array,k));
        */
        /*
-----------------------------------------------------------------------------------------------------------
         */
        //Series20. Дано целое число N (> 1) и массив из N целых чисел. Вывести те
        //элементы массива, которые меньше своего правого соседа, и количество K
        //таких элементов.
        System.out.print("Введите число N>1: ");
        int n = in.nextInt();
        int[] array = new int[n];
        fillRandom(array, -10, 10);
        printLessRight(array);
        System.out.println("Количество элементов массива меньших правого соседа: "+countLessRight(array));

    }
    static int countLessRight(int[] array){
        int qnt = 0;
        for (int i = 0;i<array.length-1;i++){
            if(array[i]<array[i+1])qnt++;
        }
        return qnt;
    }
    static void printLessRight(int[] array){
        for (int i = 0;i<array.length-1;i++){
            if(array[i]<array[i+1]) System.out.println(array[i]);
        }
    }
    static int findNumLessK(int[] array, int k){
        int num = -1;
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
            if (array[i]>k){
                num = i;
                break;
            }
        }
        return num;
    }
    static int countLessK(int[] array, int k){
        int qnt = 0;
        for (int i = 0;i<array.length;i++){
            if (array[i]<k)qnt++;
        }
        return qnt;
    }
    static double avgArray (int[] arr) {
        int sum = 0;
        for (int i = 0;i<arr.length;i++)sum+=arr[i];
        return (double)sum/arr.length; //return sum*1.0/arr.length;   --- можно так
    }
    static int multOfArray (int[] arr){
        int mult = 1;
        for (int i = 0;i<arr.length;i++)mult*=arr[i];
        return mult;
    }
    static int sumOfArray (int[] arr){
        int sum = 0;
        for (int i = 0;i<arr.length;i++)sum+=arr[i];
        return sum;
    }
    static void fillRandom (int[] arr, int left, int right){
        Random gen = new Random();
        for (int i = 0;i<arr.length;i++){
            arr[i] = gen.nextInt(right - left +1) + left; //+ left - прибавление левой границы (прибавляем потому, что минус на минус = плюс)
        }
    }
    static void showArray (int[] a){
        for (int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    static void sumChet (int[] a){
        int sum = 0;
        for (int i = 0;i<a.length;i++){
            if (a[i]%2==0)sum+=a[i];
        }
        System.out.println("\n"+sum);
    }
}
