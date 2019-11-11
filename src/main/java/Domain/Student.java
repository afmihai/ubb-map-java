package Domain;

import java.util.Objects;

public class Student extends Entity<Integer> {
    private String firstName;
    private String lastName;
    private Integer group;
    private String email;
    private String teacher;

    public Student(Integer id, String firstName, String lastName, Integer group, String email, String teacher) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.email = email;
        this.teacher = teacher;
    }

    public Student(Student student) {
        super(student);
        group = student.group;
        firstName = student.firstName;
        lastName = student.lastName;
        email = student.email;
        teacher = student.teacher;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getFirstName().equals(student.getFirstName()) &&
                getLastName().equals(student.getLastName()) &&
                getGroup().equals(student.getGroup()) &&
                getEmail().equals(student.getEmail()) &&
                getTeacher().equals(student.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getGroup(), getEmail(), getTeacher());
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group=" + group +
                ", email='" + email + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
