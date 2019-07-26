package cn.itcast.domain;

import java.util.Date;

public class User2 {
    private String username;
    private int age;
    private Date date;

    public String getUsername() {
        return username;
    }

    public void setUsernanme(String useranme) {
        this.username = useranme;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User2{" +
                "useranme='" + username + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
