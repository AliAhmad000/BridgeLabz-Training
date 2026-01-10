package com.skillforge;

class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(Course course) {
        System.out.println("Course uploaded by " + name);
    }

	public String getname() {
		return this.name=name;
		
	}
}
