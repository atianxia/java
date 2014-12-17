package com.test.jcs;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main1(String[] args) throws InterruptedException {
        /*System.out.println("Hello World!");
        UserInfo info = new UserInfo("luoyong");
        UserManager manager = UserManager.getInstance();
        manager.put("me", info, true);
        UserInfo in = manager.get("me");
        System.out.println(in.getUsername());*/
        WintimCache wc = new WintimCache();
        String me = "luoyong";
        wc.addCacheItem("me1", me.getBytes());
        Long start = System.currentTimeMillis();
        String response = new String(wc.getResponse("me1"));
        Thread.sleep(3000);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(response);
        start = System.currentTimeMillis();
        response = new String(wc.getResponse("me1"));
        Thread.sleep(3000);
        System.out.println(System.currentTimeMillis()-start);
        System.out.println(response);
    }
    public static void main(String[] args) {
        List<Long> ls = new ArrayList<Long>();
        ls.add(1L);
        ls.add(2l);
        String[] array = new String[ls.size()];
        ls.toArray(array);
        for(String str: array){
            System.out.println(str);
        }
    }
}
