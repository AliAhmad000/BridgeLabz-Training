package com.skillforge;

class Course {
    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    private final String[] internalReviews; // read-only

    // Constructor with default modules
    public Course(String title, Instructor instructor) {
        this.title = title;
        this.instructor = instructor;
        this.modules = new String[] {"Intro", "Basics", "Advanced"};
        this.internalReviews = new String[] {"Good", "Very Good"};
    }

    // Constructor with custom modules
    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
        this.internalReviews = new String[] {"Excellent"};
    }

    // Protected rating logic
    protected void updateRating(double newRating) {
        if (newRating >= 0 && newRating <= 5) {
            rating = (rating + newRating) / 2;
        }
    }

    public double getRating() {
        return rating;
    }

    // Read-only internal reviews
    public String[] getInternalReviews() {
        return internalReviews.clone(); // prevents modification
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getTitle() {
        return title;
    }
}

