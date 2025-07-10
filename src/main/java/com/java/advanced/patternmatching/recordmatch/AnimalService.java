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

    //Guarded pattern is where we can appply the checks on the binding variable
    public String retrieveNameUsingGuardedPattern(Animal animal){
        return switch (animal){
            case null -> "";
            case Cat(var name, var color) when name == null -> " ";
            case Cat(var name, var color) -> name;
            case Dog(var name, var color)-> name;
        };
    }
}

