package com.rocky.springbootdemo;

import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {

/*        int[] b={5,9,4,8,3,1,6,2,7};
        Test test = new Test();
        int[] ints = test.insertionSort(b,b.length);

        for (int i=0;i<b.length;i++){
            System.out.println(ints[i]);
        }*/


        String[] aa = "aaa|bbb|ccc".split("|");

        //String[] aa = "aaa|bbb|ccc".split("\\|"); 这样才能得到正确的结果

        for (int i = 0 ; i <aa.length ;i++) {

            System.out.println("--"+aa[i]);

        }


    }

    public int[] insertionSort(int[] A, int n) {
        int i, j, insertNum;

        for(i = 1; i < n; i++){
            insertNum = A[i];
            //要插入的数依次从后往前与排好序的序列作比较，找到插入的位置，跳出循环，进行插入
            for(j = i; j > 0 && A[j - 1] > insertNum; j-- ){
                A[j] = A[j - 1];
            }
            A[j] = insertNum;
        }
        return A;
    }





}
