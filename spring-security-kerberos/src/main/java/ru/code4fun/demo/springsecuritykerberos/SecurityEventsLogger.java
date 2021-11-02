//package ru.code4fun.demo.springsecuritykerberos;
//
//import org.springframework.boot.actuate.audit.AuditEvent;
//import org.springframework.boot.actuate.audit.listener.AuditApplicationEvent;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
///**
// * Created by: Denis Timofeev
// * Date: 15.07.2019
// */
//@Component
//public class SecurityEventsLogger {
//
//    @EventListener(AuditApplicationEvent.class)
//    public  void auditEventHandler(AuditApplicationEvent auditApplicationEvent) {
//        AuditEvent auditEvent = auditApplicationEvent.getAuditEvent();
//        System.out.println("*************** " + auditEvent.getPrincipal() + " - " + auditEvent.getType());
//    }
//}
