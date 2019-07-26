package cn.itcast.domain;

public class User {
    private String useranme;
    private int age;

    public String getUseranme() {
        return useranme;
    }

    public void setUseranme(String useranme) {
        this.useranme = useranme;
    }

    @Override
    public String toString() {
        return "User{" +
                "useranme='" + useranme + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
