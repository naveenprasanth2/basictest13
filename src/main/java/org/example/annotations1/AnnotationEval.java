package org.example.annotations1;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class AnnotationEval {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("Naveen", 20);

        Annotation[] annotations = cat.getClass().getAnnotations();
        System.out.println(Arrays.toString(annotations));

        Method[] methods = cat.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                int val = method.getDeclaredAnnotation(RunImmediately.class).times();
                System.out.println(val);
                while (val > 0) {
                    System.out.println(method.invoke(cat));
                    val--;
                }
            }
        }
        Field[] fields = cat.getClass().getFields();
        for (Field field: fields){
            if(field.isAnnotationPresent(ImportantString.class)){
                int val = field.getAnnotation(ImportantString.class).times();
                while (val > 0){
                    System.out.println(field.get(cat));
                    val--;
                }
            }
        }
    }
}
