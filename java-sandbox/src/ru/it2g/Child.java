package ru.it2g;

import ru.it2g.BaseClass;
import ru.it2g.MyInterface;

/**
 * Author: timofeevdv
 * Date: 15.06.2016
 */
public class Child extends BaseClass<Child> implements MyInterface
{
    private String name;
    private Integer id;

    public Child() {
        super();
        this.name = "Child name";
        setClassName(this.getClass().getName());
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

}
