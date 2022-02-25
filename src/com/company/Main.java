package com.company;
public class Main {
    public static void main(String[] args) {
        int arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10,120};
        int arr1[] = {13,54,67,78,67,67,13,54,78};
        int n = arr.length;
        int n1 = arr1.length;
        GG(arr1, n1);
        System.out.print("\n");
        GG(arr, n);
    }
    public static void GG (int[] g, int a){
        for (int i = 0; i < a; i++)
        {
            Integer j;
            for (j = 0; j < i; j++)
                if (g[i] == g[j])
                    break;
            if (i == j)
                System.out.print( g[i] + " ");
        }
    }
    }
