package br.com.dio.desafioreactor;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Question1 question1 =  new Question1();
        question1.inc(List.of(1L, 2L, 5L, 6L)).subscribe();
    }
}
