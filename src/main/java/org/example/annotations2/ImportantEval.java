package org.example.annotations2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ImportantEval {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        ImportantImpl important = new ImportantImpl();
        Class<?> impClass = important.getClass();
        Method[] impMethods = impClass.getDeclaredMethods();

        for (Method method : impMethods){
          ImportantString importantString =  method.getAnnotation(ImportantString.class);
          for (int i = 0; i < importantString.times(); i++){
              method.invoke(important);
          }
        }
    }
}
