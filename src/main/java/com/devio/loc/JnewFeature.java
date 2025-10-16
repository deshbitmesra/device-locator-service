package com.devio.loc;

import java.util.function.Consumer;

public class JnewFeature {
    public static void main(String[] args) {
        Consumer<String> msgConsumer1 = (msg) -> System.out.println("1 : "+msg) ;

        msgConsumer1.andThen(JnewFeature::acceptAlt).andThen(JnewFeature::acceptAlt2).accept("Amit");

    }

    static void acceptAlt(String msg){
        System.out.println("consumed "+ msg);
    }
    static void acceptAlt2(String msg){
        System.out.println("consumedfsd "+ msg);
    }
}
