package com.nesterrovv.leetcode75.arraysAndStrings;

public class Problem605 {

    public static void main(String[] args) {
        int[] flowerbed1 = new int[] {1, 0, 0, 0, 1};
        int[] flowerbed2 = new int[] {1, 0, 0, 0, 1};
        int[] flowerbed3 = new int[] {1, 0, 0};
        int[] flowerbed4 = new int[] {0, 0, 1};
        int[] flowerbed5 = new int[] {0};
        int[] flowerbed6 = new int[] {1};
        int n1 = 1;
        int n2 = 2;
        System.out.println(canPlaceFlowers(flowerbed1, n1));
        System.out.println(canPlaceFlowers(flowerbed2, n2));
        System.out.println(canPlaceFlowers(flowerbed3, n1));
        System.out.println(canPlaceFlowers(flowerbed4, n1));
        System.out.println(canPlaceFlowers(flowerbed5, n1));
        System.out.println(canPlaceFlowers(flowerbed6, n1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int places = 0;
        if (flowerbed.length == 1 && flowerbed[0] == 0) {
            flowerbed[0] = 1;
            places++;
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            flowerbed[0] = 1;
            places++;
        }
        if (flowerbed[flowerbed.length - 1] == 0 && flowerbed[flowerbed.length - 2] == 0) {
            flowerbed[flowerbed.length - 1] = 1;
            places++;
        }
        for (int i = 1; i < flowerbed.length - 1; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                places++;
            }
        }
        return n <= places;
    }

}
