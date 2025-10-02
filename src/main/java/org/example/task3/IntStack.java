package org.example.task3;

import java.util.Arrays;

public class IntStack {
    final int NEWSIZEMAS = 10;
    private int[] mas = new int[NEWSIZEMAS];

    private int lastIndex = -1;

    public IntStack(){
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException("Стек пустий");
        }
        int perem = mas[lastIndex];
        mas[lastIndex] = 0;
        lastIndex--;
        return perem;
    }

    public void push(int intNew){
        if(lastIndex == mas.length-1){
            mas = Arrays.copyOf(mas, mas.length+NEWSIZEMAS);
        }
        lastIndex++;
        mas[lastIndex] = intNew;
    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Стек пустий");
        }
        return mas[lastIndex];
    }

    public int size(){
        return lastIndex+1;
    }

    public boolean isEmpty(){
        return lastIndex == -1;
    }

    public void clear(){
        Arrays.fill(mas, 0);
        lastIndex = -1;
    }
}
