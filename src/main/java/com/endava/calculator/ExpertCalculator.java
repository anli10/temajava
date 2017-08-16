package com.endava.calculator;

public class ExpertCalculator extends BasicCalculator{
    public Integer fact(Integer a)
    {
        if(a==0) return 1;
        return (a*fact(--a));
        }
    }

