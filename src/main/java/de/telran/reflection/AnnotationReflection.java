package de.telran.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationReflection {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Person person = new Person();
        Class<? extends Person> personClass = person.getClass();

        Constructor<?>[] constructors = personClass.getConstructors();
        Constructor<?> constructor = constructors[0];

        Object object = constructor.newInstance();
        Person generatedPerson = (Person) object;

        System.out.println("--------");
        System.out.println(generatedPerson);
        System.out.println("--------");



        Field[] fields = personClass.getDeclaredFields();

        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(MyFirstAnnotation.class)) {
                 field.setAccessible(true);
                 field.set(generatedPerson, "John");
                }
            }
        }
        System.out.println(person.getName());
        System.out.println(person.getSurname());
        System.out.println(person.getCity());
    }
}

