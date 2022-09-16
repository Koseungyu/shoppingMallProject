package com.shop.exception;

public class OutOfStockException extends RuntimeException{

    public OutOfStockException(String messge) {
        super(messge);
    }
}
