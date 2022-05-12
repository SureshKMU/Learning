package com.JavaPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddEven {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(21,2,44,32,10,6,9);

     List<Integer> evenList=   intList.stream()
                .filter(i->i%2 == 0)
                .sorted()
                .collect(Collectors.toList());

        List<Integer> oddList=   intList.stream()
                .filter(i->i%2 != 0)
                .sorted()
                .collect(Collectors.toList());

     evenList.forEach(System.out::println);
        System.out.println();
        oddList.forEach(System.out::println);
    }

}
