package org.study.practice.entity;

public class SumData {

    private int a ;
    private int b ;
    private int result ;
    private String message;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "SumData{" +
                "a=" + a +
                ", b=" + b +
                ", result=" + result +
                ", message='" + message + '\'' +
                '}';
    }
}