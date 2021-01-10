package com.company;

import java.util.Scanner;

public class LectureIfElse {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько пачек печенья желаете получить?");
        int packet = scan.nextInt();
        int packetRemains = packet%12;
        int box = (packet-packetRemains)/12;
        int boxRemains = box%18;
        int chest = (box-boxRemains)/18;

        String nameChest = " ящиков";
        if (chest == 1) {
            nameChest = " ящик";
        }
        else if (chest == 2 || chest == 3 || chest == 4) {
            nameChest = " ящика";
        }


        String nameBox = "zoobr";
        if (boxRemains == 1) {
            nameBox = " коробку";
        }
        else if (boxRemains == 2 || boxRemains == 3 || boxRemains == 4) {
            nameBox = " коробки";
        } else {
            nameBox = " коробок";
        }

        String namePacket = "zoobr";
        if (packetRemains == 1) {
            namePacket = " пачку";
        }
        else if (packetRemains == 2 || packetRemains == 3 || packetRemains == 4) {
            namePacket = " пачки";
        }
        else {
            namePacket = " пачек";
        }



        // 1 вариант только один вид упаковки)//
        if (packet <12) {
            System.out.print("Вы смеетесь?!? Это же оптовые закупки. За парой пачек печенья идите в магазин на углу!");
        }
        else {
            ////
            System.out.print ("Ваше печенье будет упаковано в ");

                //если у нас только 1 коробка или только 1 ящик//
            if (packetRemains == 0 && boxRemains == 0) {
                System.out.print(chest + nameChest +".");
            }
            else if (packetRemains == 0 && chest == 0)
                System.out.print(boxRemains + nameBox+".");
            else {

                if (chest != 0) {
                    System.out.print(chest + nameChest);
                }

                if (chest != 0 && boxRemains != 0 && packetRemains != 0) {
                    System.out.print(", ");
                } else if (packetRemains == 0) {
                    System.out.print(" и ");
                }

                if (boxRemains != 0) {
                    System.out.print(boxRemains + nameBox);
                }

                if (packetRemains != 0) {
                    System.out.print(" и " + packetRemains + namePacket);
                }
                System.out.print(".");
            }
        }

    }
}