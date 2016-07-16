package com.nowcoder;

import java.util.Objects;

/**
 * Created by white and black on 2016/7/15.
 */
public class Main {
    public static void print(int index, Object object){
        System.out.println(String.format("(%d):%s",index,object.toString()));
    }
    public static void main(String[] args){
        System.out.println("hello world!");
        System.out.println("i have some change");
        print(1,"helloworld");
    }
}
