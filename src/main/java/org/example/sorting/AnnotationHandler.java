package org.example.sorting;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationHandler {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestAnnotation testAnnotation = new TestAnnotation();
        Method[] methods = testAnnotation.getClass().getMethods();
        for (Method method : methods){
            if (method.isAnnotationPresent(MyMethodAnnotation.class)){
                for (int i = 0; i < method.getAnnotation(MyMethodAnnotation.class).count(); i++){
                    method.invoke(testAnnotation);
                }
            }
        }
    }
}
