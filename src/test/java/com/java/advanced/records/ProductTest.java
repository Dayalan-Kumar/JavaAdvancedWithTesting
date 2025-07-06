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

    @Test
    void createProduct_nameNotValid(){
        //given
        var product = new Product("IPhone",
                new BigDecimal("99.99"),
                "Electronics");
        //when
        var exception = assertThrows(IllegalArgumentException.class,
                ()->new Product("",
                new BigDecimal("99.99"),
                "Electronics"));
        //then
        assertEquals("name is not valid", exception.getMessage());

    }

    @Test
    void createProduct_costNotValid(){
        //given

        //when
        var exception = assertThrows(IllegalArgumentException.class,
                ()->new Product("IPhone",
                        new BigDecimal("-99.99"),
                        "Electronics"));
        //then
        assertEquals("cost value is not valid", exception.getMessage());
    }

    @Test
    void createProduct_customConstructor(){
        //given
        //not passing type below, in order to call the custom constructor
        var product = new Product("IPhone",
                new BigDecimal("99.99")
                );
        //when
        System.out.println("product---"+product);
        assertEquals("IPhone", product.name());
        assertEquals("GENERAL", product.type());

    }

}