package ru.code4fun.demo;

import ru.code4fun.demo.ldap.LdapAuth;

/**
 * Created by: Denis Timofeev
 * Date: 14.07.2019
 */
public class Application {
    public static void main(String[] args) {
        LdapAuth ldap = new LdapAuth();
        ldap.auth();
    }
}
