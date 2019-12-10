package demo1;

public class EXTENDS {
    public static void main(String[] args){
        System.out.println("extends");
        Student stu = new Student();
        stu.setName("zhangsan");
        stu.setAge(20);
        stu.setScore(100.00);

        stu.getName();
        stu.getAge();
        stu.getScore();
    }
}


class Person{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void getName(){
        System.out.println(this.name);
    }
    public void getAge(){
        System.out.println(this.age);
    }
}

class Student extends Person{
    private double score;

    public void setScore(double score){
        this.score = score;
    }

    public void getScore(){
        System.out.println(this.score);
    }
}