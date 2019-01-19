package com.android.admin.secondweekfridaytest;

import java.util.Arrays;

/* 3. Create a custom arraylist using generics.
        The size of the array would be doubled when array limit is reached. */

public class Generics<T> {
    private int i = 0;
    private Object obj[];
    private T t;

    public Generics() {
        obj = new Object[5];
    }

    public void add(T t) {
        this.t = t;
        if (i == obj.length - 1) {
            //Increase the Capacity of Array by 100% of it's size
            obj = Arrays.copyOf(obj, obj.length + obj.length);
            System.out.println(obj.length);
        }
        obj[i] = this.t;
        i++;
    }

    public Object get(int i) {
        if (obj[i] != null) {
            return obj[i];
        } else {
            throw new ArrayIndexOutOfBoundsException("index:" + i);
        }
    }

    public String toString() {
        String temp = "";
        for (Object ob : obj) {
            if (ob != null) {
                temp = temp + ob + ',';
            }
        }
        String temp1 = temp.substring(0, temp.length() - 1);
        return "[" + temp1 + "]";
    }

}