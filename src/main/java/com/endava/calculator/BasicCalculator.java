package com.endava.calculator;

public class BasicCalculator implements Calculator {

    @Override
    public Long add(Integer a,Integer b,Integer...list) {
        Integer sum= a+b;
        for(Integer i:list){
            sum=sum+i;
        }
        return sum.longValue();
    }

    @Override
    public Double add(Double a,Double b,Double...list) {
        Double sum= a+b;
        for(Double i:list){
            sum=sum+i;
        }
        return sum;
    }

    @Override
    public Long add(Long a,Long b,Long...list) {
        Long sum= a+b;
        for(Long i:list){
            sum=sum+i;
        }
        return sum;
    }
    public Integer fact(Integer a){
        throw new RuntimeException("NU");
    }
}
