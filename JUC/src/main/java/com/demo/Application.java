package com.demo;

import javax.annotation.Resource;
import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 * @author zhang pan
 * @Description 启动类
 */
public class Application {


    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("hello world");

        System.out.println("=========================");
        LocalDateTime begin = LocalDateTime.of(1998, 1, 10, 0, 0);
        LocalDateTime end = LocalDateTime.of(2021, 4, 23, 0, 0);
        System.out.println(Duration.between(begin, end).toDays());

        


    }

}
