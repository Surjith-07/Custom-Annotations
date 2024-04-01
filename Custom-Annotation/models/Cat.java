package models;

import annotations.CatAnnotation;
import annotations.DogAnnotation;

@CatAnnotation
public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    @CatAnnotation
    public String getName() {
        return name;
    }
}
