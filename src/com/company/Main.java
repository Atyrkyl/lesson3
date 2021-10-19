package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите имя");
//        String string = scanner.nextLine();

        String[] names = new String[3];
        names[0] = "Mike";
        names[1] = "John";
        names[2] = "Kate";
//        sj;lkafd;
        for (String person : names){

        switch (person){
            case "Mike" :
                System.out.println("Доброе утро, "+ person+"!");
                break;
            case "John" :
                System.out.println("Добрый день, "+ person+"!");
                break;
            case "Kate" :
                System.out.println("Добрый вечер, "+ person+"!");
                break;
            default:
                System.out.println("Ошибка");



        }}

        }


        }














