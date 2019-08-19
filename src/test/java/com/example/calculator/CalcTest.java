package com.example.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcTest {
    @Test
    public void testadd(){
        Calc c = new Calc();
        int result = c.add(5,4);

        assertEquals("ADD 함수의 결과는 9여야함.",9,result);
    }

    @Test
    public void test_음수테스트(){

    }

}
