package com.java.advanced.records;

import java.math.BigDecimal;

// Records classes are immutable data holders - just to hold data
// Available from java 17
// Record classes are final , so no inheritance is supported
// it has auto generated equals(), hashcode(), toString() functions

public record Product(String name,
                      BigDecimal cost,
                      String type) {
    // by default constructors are created by compiler those are called canonical constructors

    // below is not a constructor a simple code block that has access to all other parameters present above
    public Product{
        if(name!=null && name.isBlank()){
            throw new IllegalArgumentException("name is not valid");
        }
        if(cost.compareTo(BigDecimal.ZERO)<=0){
            throw new IllegalArgumentException("cost value is not valid");
        }
    }

    //create custom constructor
    //the custom constructor should always call the
    public Product(String name, BigDecimal cost){
        this(name,cost, "GENERAL");
    }
}
