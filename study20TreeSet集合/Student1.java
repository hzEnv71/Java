package study20TreeSet集合;

public class Student1 {
    private String name;
    private int chinese;
    private int math;

    public Student1() {
    }

    public Student1(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;

    }
    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }
    public int sum(){
        return (chinese+math);
    }


}
