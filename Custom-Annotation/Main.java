import annotations.CatAnnotation;
import annotations.DogAnnotation;
import annotations.ImportantNote;
import models.Cat;
import models.Dog;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Jack");
        System.out.println(cat.getClass().isAnnotationPresent(CatAnnotation.class)); // true

        try {
            for (Method method : cat.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(CatAnnotation.class)) {
                    System.out.println(method.invoke(cat));
                }
            }//Jack

            Dog dog = new Dog("Saro");
            for (Method method : dog.getClass().getDeclaredMethods()) {
                if (method.isAnnotationPresent(ImportantNote.class)) {
                    ImportantNote annotation = method.getAnnotation(ImportantNote.class);
                    int value = annotation.time();
                    System.out.println(value);
                    while (value-- > 0) {
                        System.out.println(method.invoke(dog));
                    }
                } // 5 times printed Saro.......
            }

                for (Field field : dog.getClass().getDeclaredFields()) {
                    if (field.isAnnotationPresent(DogAnnotation.class)) {
                        if (field.getType() == String.class) {
                            System.out.println(field.getName());
                            Method getter = dog.getClass().getMethod("get" + Character.toUpperCase(field.getName().charAt(0)) + field.getName().substring(1));
                            Object value = getter.invoke(dog);
                            System.out.println(value);
                        } //Saro.....
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            System.out.println(e.getMessage());
        }
    }
}
