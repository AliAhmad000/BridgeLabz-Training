package com.skillforge;

class Student extends User implements ICertifiable {
    private int progress;     // percentage
    private int score;        // marks

    public Student(String name, String email) {
        super(name, email);
    }

    public void updateProgress(int completedModules, int totalModules) {
        // operators used
        progress = (completedModules * 100) / totalModules;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public void generateCertificate() {
        if (progress == 100 && score >= 60) {
            System.out.println("Certificate generated for " + name);
        } else {
            System.out.println("Course not completed. Certificate not available.");
        }
    }
}
