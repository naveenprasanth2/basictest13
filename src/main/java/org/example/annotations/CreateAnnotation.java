package org.example.annotations;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreateAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        @SuppressWarnings("unused")
        Cat cat = new Cat("Naveen", 21);
        if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("This class is very important");
        } else {
            System.out.println("This class is not very important");
        }

        Method[] methods = cat.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                int val = method.getAnnotation(RunImmediately.class).times();
                while (val > 0) {
                    System.out.println(method.invoke(cat));
                    val--;
                }
            }
        }

        Field[] fields = cat.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                int val = field.getAnnotation(ImportantString.class).times();
                while (val > 0) {
                    Object object = field.get(cat);
                    if (object instanceof Integer intVal) {
                        System.out.println(intVal);
                    }
                    val--;
                }

            }
        }
    }
}
