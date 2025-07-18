package com.java.advanced.records;

import java.math.BigDecimal;
import java.util.Objects;

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

    // in test cases, if we don't want to compare each and every property of record class we need to override
    // equals and hashcode
    // in the test case method createProductComparison(), where we changed the type "Electronics1" earlier
    // and tested it is failing, because it compares each and every attribute
    // Now we commented out the 'type' as below, now if we execute the test case it will get succeed. because
    // 'type' will not be considered for equality check now.

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name)
               // && Objects.equals(type, product.type)
                && Objects.equals(cost, product.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cost, type);
    }
}
