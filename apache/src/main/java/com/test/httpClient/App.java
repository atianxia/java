package com.test.httpClient;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        List<String> list1 = new ArrayList<String>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        List<String> list2 = new ArrayList<String>();
        list2.add("1");
        list2.add("2");
        
        b:for(String str2:list2){
            a:for(String str1: list1){
                if(str1.equals(str2)){
                    break b;
                }
            }
        }
        char i ="fds".charAt(1);
        System.out.println((int) i);
        System.out.println(NumberUtils.isDigits("123"));
        
        String abc = null;
        System.out.println("fdsfsfs"+abc);
    }
}
