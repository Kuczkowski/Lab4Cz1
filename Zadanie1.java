package com.company;
import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        System.out.println("Podaj liczbę potrzebną do wyliczenia: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        Kwadrat wynik = new Kwadrat(a);
        wynik.setPole();
        wynik.setObwod();
    } }