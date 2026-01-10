package com.skillforge;

public class BeginnerStudent extends Student {

	public BeginnerStudent(String name, String email) {
		super(name, email);
	}

	@Override
	public void generateCertificate() {
		System.out.println("BEGINNER COURSE CERTIFICATE");
		super.generateCertificate();
	}
}
