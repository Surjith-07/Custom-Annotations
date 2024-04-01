package models;

import annotations.DogAnnotation;
import annotations.ImportantNote;

public class Dog {
    @DogAnnotation
    String name;


    public Dog(String name) {
        this.name=name;
    }
    @ImportantNote(time=5)
    @DogAnnotation
    public String getName() {
        return name;
    }
}
