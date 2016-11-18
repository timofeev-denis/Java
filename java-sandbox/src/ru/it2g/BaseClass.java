package ru.it2g;

import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.List;

/**
 * Author: timofeevdv
 * Date: 15.06.2016
 */
public abstract class BaseClass<T extends MyInterface> implements MyInterface {

    private Class<T> clazzOfT;
    private String className;

    public T createNew(Class<T> clazzOfT) throws IllegalAccessException, InstantiationException {
        this.clazzOfT = clazzOfT;
        return clazzOfT.newInstance();
    }

    public void test1() {

        Class<T> cls = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];

        try {
            T t2 = (T) Class.forName(cls.getName()).newInstance();
            T t3 = (T) Class.forName(className).newInstance();
            System.out.println(t3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setClassName(String className) {
        this.className = className;
    }

    public void foo(T t) {
        t.setId(5);
    }

}
