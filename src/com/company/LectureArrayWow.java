package com.company;

public class LectureArrayWow {

    public static void main(String[] args) {
        int[] array = new int[4];
        array[0] = 7;
        array[1] = 11;
        array[2] = 3;
        array[3] = 2147483647;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        //TODO int[] array2 and copy all elements from array to array2

        int[] array2 = new int[4];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        //TODO change array in length 8

        array = new int[8];
        for (int i = 0; i < array2.length; i++) {
            array[i] = array2[i];
        }
        array[4] = 7;
        array[5] = 2;
        array[6] = 22;
        array[7] = 101;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

        //TODO user input array size and program generate array with randoms
//        System.out.println("введите размер массива");
//        Scanner scan = new Scanner(System.in);
//                int size = scan.nextInt();
//                int [] arrayRandom = new int[size];
//        Random rnd = new Random();
//        for (int i = 0; i < size; i++) {
//            arrayRandom[i]=rnd.nextInt();
//        }
//        for (int i = 0; i < arrayRandom.length; i++) {
//            System.out.print(arrayRandom[i]+ ", ");
//        }


//        Random rnd = new Random();
//        rnd.nextInt();
//        int n = rnd.nextInt();
//        System.out.println(n);

        //TODO do function to sort array
        int[] array3 = new int[array.length];
        for (int i = 0; i < array3.length; i++) {
            array3[i] = array[i];
        }

        int min = 0;
        for (int j = 0; j < array3.length; j++) {


            for (int i = 0; i < array3.length; i++) {
                if (array3[i] < array3[min]) {
                    min = i;
                }

            }
            array[j] = array3[min];
//        System.out.println(min + " " + array3[min] + " " + array[0]);
            array3[min] = 2147483647;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }



}

