class Student {
    private String name;
    private String studentId;
    private int mark;

    public Student(String name, String studentId, int mark) {
        this.name = name;
        this.studentId = studentId;
        setMark(mark);
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public int getMark() {
        return mark;
    }

    public boolean setMark(int newMark) {
        if (newMark >= 0 && newMark <= 100) {
            this.mark = newMark;
            return true;
        }
        return false;
    }

    public boolean hasPassed() {
        return mark >= 50;
    }

    public String getClassification() {
        if (mark >= 80) return "Distinction";
        if (mark >= 50) return "Pass";
        return "Fail";
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', studentId='" + studentId + "', mark=" + mark + ", classification='" + getClassification() + "'}";
    }
}

public class StudentRecord {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "S001", 49);
        Student s2 = new Student("Bob", "S002", 50);
        Student s3 = new Student("Carol", "S003", 79);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        s3.setMark(80);
        System.out.println(s3);

        boolean updated = s1.setMark(150);
        System.out.println("Invalid update attempted (150): " + updated);
        System.out.println(s1);

        s1.setMark(85);
        System.out.println(s1);
    }
}