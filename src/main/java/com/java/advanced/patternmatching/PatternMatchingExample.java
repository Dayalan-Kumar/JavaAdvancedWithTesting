package com.java.advanced.patternmatching;

public class PatternMatchingExample {

    public String pattern(Object o){
        if(o instanceof Integer){
            var i = (Integer) o;
            return "Integer:"+i;
        }
        if(o instanceof String){
            var i = (String) o;
            return "String of length:"+i.length();
        }
        return "Not a string or Integer";
    }


}
