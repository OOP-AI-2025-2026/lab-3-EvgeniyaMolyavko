package org.example.task2;

import org.example.task1.Box;
import org.example.task3.IntStack;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        System.out.println("Task 1\n");
        Box box = new Box(2, 3, 4);
        System.out.println("Volume: " + box.volume());
        System.out.println("Lateral surface area: " + box.lateralSurfaceArea());
        System.out.println("Surface area: " + box.surfaceArea());

    }

    public static void task2(){
        System.out.println();
        System.out.println("********************************");
        System.out.println("Task 2\n");
        Cart cart = new Cart(new Item[10]);
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(5);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);
    }

    public static void task3() {
        System.out.println();
        System.out.println("********************************");

        System.out.println("Task 3\n");

        IntStack intStack = new IntStack();
        System.out.println(intStack.isEmpty());

        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        intStack.push(9);
        intStack.push(11);
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        intStack.push(9);
        intStack.push(11);
        intStack.push(1);
        intStack.push(3);
        intStack.push(5);
        intStack.push(7);
        intStack.push(9);
        intStack.push(11);


        System.out.println();
        System.out.println(intStack.isEmpty());

        System.out.println(intStack.pop());
        System.out.println(intStack.peek());
        System.out.println(intStack.size());
        intStack.clear();
        System.out.println(intStack.size());


    }


    }