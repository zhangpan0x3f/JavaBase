package com.demo.unsafe;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * @author zhang pan
 * @Description 类描述
 */
/**
 * 同理可证 ： ConcurrentModificationException
 * //1、Set<String> set = Collections.synchronizedSet(new HashSet<>());
 * //2、
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        // hashmap
        // Set<String> set = Collections.synchronizedSet(new HashSet<>());
        // Set<String> set = new CopyOnWriteArraySet<>();
        for(int i = 0;i < 10;i++){
            new Thread(()->{
                set.add(UUID.randomUUID().toString().substring(0,5));
                System.out.println(set);
            },String.valueOf(i)).start();
        }
        System.out.println(set);
    }
}
