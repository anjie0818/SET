package com.hogwarts.interfaceDemo7;

// 接口 Hogwarts
public interface Hogwarts {
    public static final int age =20;
    public default void Expelliarmus(){
        System.out.println("hogwarts除你武器");
    }
}
