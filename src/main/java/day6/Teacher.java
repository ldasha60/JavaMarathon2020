package day6;


public class Teacher {
    private String name;
    private String subject;
    private String mark = null;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int score = (int) (Math.random() * ((5 - 2) + 1) + 2);
        switch (score) {
            case 2: {
                mark = "неудовлетворительно";
                break;
            }
            case 3: {
                mark = "удовлетворительно";
                break;
            }
            case 4: {
                mark = "хорошо";
                break;
            }
            case 5: {
                mark = "отлично";
                break;
            }

        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + mark);


    }
}
