public class CourseTest {
    public static void main (String[] args) {
        
        Course c1 = new Course("CPSC-39", 4, true);
        Course c2 = new Course("CPSC-42", 4, true);
        System.out.println("Name: " + c1.getName() + ", Credits: " + c1.getCredits() + ", Taking Course: " + c1.getTakingCourse());
        System.out.println("Name: " + c2.getName() + ", Credits: " + c2.getCredits() + ", Taking Course: " + c2.getTakingCourse());
    }
}
