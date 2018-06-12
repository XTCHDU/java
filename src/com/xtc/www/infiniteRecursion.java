package com.xtc.www;
import java.util.*;
public class infiniteRecursion {
    public String toString(){
        return "adress:" + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<infiniteRecursion> v = new ArrayList<infiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            v.add(new infiniteRecursion());
        }
        System.out.println(v);
        Iterator<infiniteRecursion> q = v.iterator();
        while (q.hasNext()){
            System.out.printf("the next is :%s",q.next());
        }
    }
}
