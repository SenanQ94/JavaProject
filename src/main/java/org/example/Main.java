package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //duplicate characters in a string
/*
        String str = new String("Sakkttkkeeeeett");
        int count = 0;
        char[] chars = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        System.out.println("Duplicate characters are:");
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(chars[i])) {
                count = map.get(chars[i]) + 1;
                map.put(chars[i], count);
            } else {
                map.put(chars[i], 1);
            }
        }
        for (Map.Entry ch : map.entrySet()) {
            System.out.println(ch.getKey() + " " + ch.getValue());
        } */
        //iterate ArrayList
/* ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("Advanced For Loop:");
        for (Object obj : list) {
            System.out.println(obj);
        }
        System.out.println("For Loop:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        //Fibonacci series.
/*int num, a = 0, b = 0, c = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of times");
        num = in.nextInt();
        System.out.println("Fibonacci Series of the number is:");
        for (int i = 0; i < num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.println(a + "");    //if you want to print on the same line, use print()
        }*/
        // iterate HashMap using While and advance for loop
/* HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");
        System.out.println(map.size());
        System.out.println("While Loop:");
        Iterator itr;
        itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is " + me.getKey() + " Value is " + me.getValue());
        }
        System.out.println("For Loop:");
        for (Map.Entry me2 : map.entrySet()) {
            System.out.println("Key is: " + me2.getKey() + " Value is: " + me2.getValue());
        }*/
        //prime number
/*
        int temp, num;
        boolean isPrime = true;
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        in.close();
        for (int i = 2; i <= num / 2; i++) {
            temp = num % i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(num + "number is prime");
        else
            System.out.println(num + "number is not a prime");*/
        //the number or String is palindrome
/*
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        int length;
        System.out.println("Enter the number or String");
        original = in.nextLine();
        length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("reverse is:" + reverse);

        if (original.equals(reverse))
            System.out.println("The number is palindrome");
        else
            System.out.println("The number is not a palindrome"); */
        //Number of words in a string
/*       String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < split.length; i++) {
            if (map.containsKey(split[i])) {
                int count = map.get(split[i]);
                map.put(split[i], count + 1);
            } else {
                map.put(split[i], 1);
            }
        }
        System.out.println(map); */
        //find 2 numbers in array equal to a target
/*        int[] nums = new int[]{1, 5, 9, 7, 12};
        int target = 17;
        Map<Integer, Integer> visitedNumbers = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int delta = target - nums[i];
            if (visitedNumbers.containsKey(delta)) {
                int[] res = new int[]{visitedNumbers.get(delta), i};
                return res[0] + " " + res[1];
            }
            visitedNumbers.put(nums[i], i);
        }
        return "[-1, -1]"; */
        //second-highest number in an array.
/* int arr[] = {100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89};
        int largest = 0;
        int secondLargest = 0;
        System.out.println("The given array is:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("\nSecond largest number is:" + secondLargest);
        System.out.println("Largest Number is: " + largest); */
        //check Armstrong number.
/*  int c = 0, a, temp;
        int n = 153;//It is the number to check Armstrong
        temp = n;
        while (n > 0) {
            a = n % 10;
            n = n / 10;
            c = c + (a * a * a);
        }
        if (temp == c)
            System.out.println("armstrong number");
        else
            System.out.println("Not armstrong number"); */
        //remove all white spaces from a string
/*   String str1 = "Saket Saurav        is a Quality     Analist";

        //1. Using replaceAll() Method

        String str2 = str1.replaceAll("\\s", "");

        System.out.println(str2);

        //2. without Using replaceAll() Method
        char[] chars = str1.toCharArray();

        StringBuffer sb = new StringBuffer();
        String res = "";

        for (int i = 0; i < chars.length; i++) {
            if ((chars[i] == ' ' && chars[i + 1] != ' ') || chars[i] != ' ') {
                res += chars[i];
            }

        }
        System.out.println(res); */

        int[][] array_2d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Two-dimensional Array is as follows:");

        System.out.println(Arrays.deepToString(array_2d));

        int ar[] = {2, 2, 1, 8, 3, 2, 2, 4, 2};

        // To fill complete array with a particular
        // value
        Arrays.fill(ar, 1, 7, 7);
        System.out.println("Array completely filled" +
                " with 10\n" + Arrays.toString(ar));
    }
}