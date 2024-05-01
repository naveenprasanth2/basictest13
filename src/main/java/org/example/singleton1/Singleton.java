package org.example.singleton1;

import java.io.Serializable;

public final class Singleton implements Serializable, Cloneable {

    private Singleton() {
    }

    private static final class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
