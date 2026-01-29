public class Course {
    private String name;
    private int credits;
    private Boolean takingCourse;

    public Course() {
        name = "unknown";
        credits = 0;
        takingCourse = false;
    }

    public Course (String name, int credits, boolean takingCourse) {
        this.name = name;
        this.credits = credits;
        this.takingCourse = takingCourse;
    }

    public String getName () {
        return name;
    }

    public int getCredits () {
        return credits;
    }

    public boolean getTakingCourse () {
        return takingCourse;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setCredits (int credits) {
        if (credits > 0) {
            this.credits = credits;
        }
    }

    public void setTakingCourse (boolean takingCourse) {
        this.takingCourse = takingCourse;
    }

    @Override
    public String toString() {
        return "Course: " + name + " | Credits: " + credits + " | Taking Course: " + takingCourse;
    }
}