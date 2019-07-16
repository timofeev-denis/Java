package ru.code4fun.demo.springsecuritykerberos;

import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.listener.AbstractAuditListener;
import org.springframework.stereotype.Component;

/**
 * Created by: Denis Timofeev
 * Date: 15.07.2019
 */

@Component
public class AuditListener extends AbstractAuditListener {

    @Override
    protected void onAuditEvent(AuditEvent event) {
        System.err.println("************* AUDIT **************");
    }
}
