package FILEIO;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String email;
    int age;
    String gender;
    double ratings;
    public User(){

    }

    public User(String name, String email, int age, String gender, double ratings) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", ratings=" + ratings +
                '}';
    }
}
