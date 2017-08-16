package com.endava.calculator;

public interface Calculator {
    public Long add(Integer a, Integer b, Integer... list);
    public  Double add(Double a, Double b, Double... list);
    public Long add(Long a, Long b, Long... list);
    public Integer fact(Integer a);
}
