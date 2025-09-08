public class Student {
    private String name;
    private int rollNumber;
    private String grade;
    private int age;
    private String email;

    public Student(String name, int rollNumber, String grade, int age, String email) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.age = age;
        this.email = email;
    }

    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    public String getGrade() { return grade; }
    public int getAge() { return age; }
    public String getEmail() { return email; }

    public void setName(String name) { this.name = name; }
    public void setRollNumber(int rollNumber) { this.rollNumber = rollNumber; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setAge(int age) { this.age = age; }
    public void setEmail(String email) { this.email = email; }

    
    @Override
    public String toString() {
        return "Student Information:\n" +
               "Name       : " + name + "\n" +
               "Roll Number: " + rollNumber + "\n" +
               "Grade      : " + grade + "\n" +
               "Age        : " + age + "\n" +
               "Email      : " + email;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ayush Raj", 101, "A", 18, "ayushbth1501@gmail.com");
        System.out.println(student1); 
    }
}

