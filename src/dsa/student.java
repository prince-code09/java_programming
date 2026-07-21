package dsa;

public class student implements Comparable<student> {
    public int age;
    public String name;
    public int marks;

    public int getMarks() {
        return marks;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public student(int marks, String name, int age) {
        this.marks = marks;
        this.name = name;
        this.age = age;




    }

    @Override
    public int compareTo(student that) {
        return this.age - that.age;
    }
}
