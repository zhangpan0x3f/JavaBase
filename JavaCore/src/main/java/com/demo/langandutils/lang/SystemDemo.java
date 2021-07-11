package com.demo.langandutils.lang;

import com.demo.model.User;

import java.io.Console;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.channels.Channel;
import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

/**
 * @author : zhang pan
 * @date : 3:28 下午 2021/7/11
 * 描述：
 */
public class SystemDemo {

    public static void test1() throws IOException {
        //标准错误输出流
        System.err.println("test1");
        //标准输入流
        int read = System.in.read();
        System.out.println(read);
        //标准输出流
        System.out.println("test1");
    }

    public static void copyArray(){
        //源数组
        Integer[] src = new Integer[]{1,2,3,4,5};
        //目标数组
        Integer[] dest = new Integer[10];
        System.arraycopy(src,0,dest,1,5);
        System.out.println(Arrays.toString(dest));
    }

    public static void test2(){
        //返回一个Console对象
        //Console console = System.console();
        //console.printf("hello world");

        //以毫秒为单位返回当前时间,1s = 1000ms
        long l = System.currentTimeMillis();
        System.out.println(l);

        //终止当前运行的JVM
        //System.exit(1);

        //运行垃圾回收器
        //System.gc();

        //返回当前所有的系统环境
        //Map<String, String> env = System.getenv();
        //System.out.println(env);

        //获取指定环境变量的值
        //String nginx = System.getenv("PATH");
        //System.out.println(nginx);

        //确定当前系统属性
        //Properties properties = System.getProperties();
        //System.out.println(properties);

        //通过键值获取系统属性
        //String property = System.getProperty("sun.boot.library.path");
        //System.out.println(property);

        ////通过键值获取系统属性
        //String str = System.getProperty("dubboandzk", "sun.boot.library.path");
        //System.out.println(str);

        //获取系统安全接口
        //SecurityManager securityManager = System.getSecurityManager();
        //System.out.println(securityManager);

        //如果没有重写hashCode()
        /*User user = new User("zs", 18);
        int i = System.identityHashCode(user);
        System.out.println(i);
        System.out.println(user.hashCode());
         */

        /*try {
            Channel channel = System.inheritedChannel();
            System.out.println(channel);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //行分隔符,"\n"
        //String s = System.lineSeparator();
        //System.out.print(s);
        //System.out.println("hello world");

        //通过指定的文件名加载本地库
        //System.load("jvm");

        //通过指定的lib名来加载本地库
        //System.loadLibrary("jvm");

        //返回纳秒
        //long l1 = System.nanoTime();
        //System.out.println(l1);

        //System.runFinalization();

        //System.runFinalizersOnExit(true);

        //System.setErr();

//        System.setIn();

//        System.setOut();

//        System.setProperties();

//        System.setProperty()

//        System.setSecurityManager();

    }

    public static void main(String[] args) {
        /*try {
            test1();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //copyArray();

        test2();
    }

}
