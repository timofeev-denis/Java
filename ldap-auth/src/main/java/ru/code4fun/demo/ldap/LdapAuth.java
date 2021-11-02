package ru.code4fun.demo.ldap;

import javax.naming.ldap.LdapContext;

/**
 * Created by: Denis Timofeev
 * Date: 14.07.2019
 */
public class LdapAuth {
    public void auth() {
        try {
            LdapContext ctx = ActiveDirectory.getConnection("bob", "password", "some.domain");
            ctx.close();
        } catch (Exception e) {
            //Failed to authenticate user!
            e.printStackTrace();
        }
    }
}
