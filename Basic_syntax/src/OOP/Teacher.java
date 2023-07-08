package OOP;

public class Teacher {
    private String name;
    private String subject;
    private int experience;

    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", experience=" + experience +
                '}';
    }
}
class Test2{
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Иван Иванович", "философия", 15);
        Teacher t2 = new Teacher("Зинаида Аркадьевна", "основы игры на волынке", 7);
        Teacher t3 = new Teacher("Сергей Александрович", "управление газоном", 40);

        System.out.println(t1.getName());
        t1.setName("Пётр Петрович");
        System.out.println(t1.getName());
        System.out.println("------------------------");
        System.out.println(t1);
        System.out.println("------------------------");

        System.out.println(t2.getSubject());
        t2.setSubject("история");
        System.out.println(t2.getSubject());
        System.out.println("-------------------------");

        System.out.println(t3.getExperience());
        t3.setExperience(8);
        System.out.println(t3.getExperience());

    }
}
