package com.java.advanced.records;

import java.math.BigDecimal;

// Records classes are immutable data holders - just to hold data
// Available from java 17
// Record classes are final , so no inheritance is supported
// it has auto generated equals(), hashcode(), toString() functions

public record Product(String name,
                      BigDecimal cost,
                      String type) {
}
