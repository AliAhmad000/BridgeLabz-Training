package com.skillforge;

public class AdvancedStudent extends Student {

    public AdvancedStudent(String name, String email) {
        super(name, email);
    }

    @Override
    public void generateCertificate() {
        System.out.println("ADVANCED COURSE CERTIFICATE");
        super.generateCertificate();
    }
}

