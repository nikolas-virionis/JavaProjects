package br.com.bandtec;

import java.util.Arrays;

import main.java.br.com.bandtec.LocalEnum;

public class App {
    public static void main(String[] args) {
        for (LocalEnum local : LocalEnum.values()) {
            System.out.println(local.getAbreviacaoUpper());
        }
        System.out.println(Arrays.asList(LocalEnum.values()));
    }
}
