class Course {

    private String courseCode;
    private String title;
    private int capacity;
    private int enrolled;

    public Course(String courseCode, String title, int capacity) {
        this.courseCode = courseCode;
        this.title = title;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public boolean enroll() {
        if (isFull()) {
            return false;
        }
        enrolled++;
        return true;
    }

    public boolean withdraw() {
        if (enrolled == 0) {
            return false;
        }
        enrolled--;
        return true;
    }

    public boolean isFull() {
        return enrolled >= capacity;
    }

    public int getAvailableSeats() {
        return capacity - enrolled;
    }

    public String toString() {
        return "Course[" + courseCode + " " + title + ", "
                + enrolled + "/" + capacity + "]";
    }
}

public class CourseEnrollment {

    public static void main(String[] args) {
        Course math = new Course("MATH101", "Calculus", 3);
        System.out.println(math);

        System.out.println("Empty course - available seats: "
                + math.getAvailableSeats());
        System.out.println("Enroll 1: " + math.enroll());
        System.out.println("Enroll 2: " + math.enroll());
        System.out.println("One seat remaining - available seats: "
                + math.getAvailableSeats());
        System.out.println("Enroll 3 (fills course): " + math.enroll());
        System.out.println("Full? " + math.isFull());
        System.out.println("Over-enrollment attempt: " + math.enroll());
        System.out.println(math);

        System.out.println("Withdraw: " + math.withdraw());
        System.out.println(math);

        System.out.println("Withdraw again: " + math.withdraw());
        System.out.println("Withdraw again: " + math.withdraw());
        System.out.println("Withdraw from empty course: " + math.withdraw());
        System.out.println(math);
    }
}
