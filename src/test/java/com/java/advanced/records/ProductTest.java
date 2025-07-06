package com.java.advanced.records;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void createProduct(){
        //given
        var product = new Product("IPhone",
                new BigDecimal("99.99"),
                "Electronics");
        //when
        System.out.println("product---"+product);
        assertEquals("IPhone", product.name());
        assertEquals("Electronics", product.type());

    }

}