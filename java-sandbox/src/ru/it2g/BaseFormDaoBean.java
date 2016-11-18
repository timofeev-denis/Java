package ru.it2g;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * Author: timofeevdv
 * Date: 15.06.2016
 */
public abstract class BaseFormDaoBean<T> {

    public Type getEntityClass(Type type) {
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType.getRawType() == BaseFormDaoBean.class) {
                return parameterizedType;
            }
            return getEntityClass(((Class<?>) parameterizedType.getRawType()).getGenericSuperclass());
        }
        return getEntityClass(((Class<?>) type).getGenericSuperclass());
    }

    public Class<T> getEntityClass() {
        return (Class<T>) ((ParameterizedType) getEntityClass(getClass().getGenericSuperclass())).getActualTypeArguments()[0];
    }

    public static void main(String[] args) {
        BaseFormDaoBean inst = new Test();
        System.out.println(inst.getEntityClass().getName());
    }
}

class Test extends BaseFormDaoBean<String> {

}
