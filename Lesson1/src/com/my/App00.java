package com.my;

import com.sun.accessibility.internal.resources.accessibility;
import org.omg.CORBA.ACTIVITY_COMPLETED;
import sun.print.resources.serviceui_pt_BR;

public class App00 {
    public static void main(String[] args) throws Exception {
        UserDao dao = new UserDaoJdbc();
    }
}

class Res implements AutoCloseable {
    private String name;
    Res(String name) throws Exception {
        this.name = name;
        System.err.println("new: " + this.name);
    }
    public void echo() {
        System.err.println("echo:" + name );
    }
    public void close() throws Exception {
        System.err.println("close: " + this.name);
        throw new Exception( "close error" );
    }
}
