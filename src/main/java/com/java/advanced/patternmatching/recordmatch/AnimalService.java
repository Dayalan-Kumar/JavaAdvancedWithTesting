package com.java.advanced.patternmatching.recordmatch;

public class AnimalService {

    public String retrieveName(Animal animal){
        return switch (animal){
            case null -> "";
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
        };
    }

    public String retrieveNameV2(Animal animal){
        return switch (animal){
            case null -> "";
            // instead of creating instance variable cat, we are directly using arguments
            // so we don't need to use instance variable cat to call name like cat.name()
            case Cat(var name, var color)-> name;
            case Dog(var name, var color)-> name;
        };
    }
}

