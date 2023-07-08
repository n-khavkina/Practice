package OOP;

public class Student {
    private String name;
    private int group;
    private double avgGrade;

    public Student(String name, int group, double avgGrade) {
        this.name = name;
        this.group = group;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group=" + group +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Student st1 = new Student("Иван", 3, 8.7);
        Student st2 = new Student("Михаил", 1, 6.9);
        Student st3 = new Student("Мария", 2, 8.4);

        System.out.println(st1.getName());
        st1.setName("Александр");
        System.out.println(st1.getName());
        System.out.println("------------------------");
        System.out.println(st1);
        System.out.println("------------------------");

        System.out.println(st2.getGroup());
        st2.setGroup(2);
        System.out.println(st2.getGroup());
        System.out.println("-------------------------");

        System.out.println(st3.getAvgGrade());
        st3.setAvgGrade(7.9);
        System.out.println(st3.getAvgGrade());
    }
}
