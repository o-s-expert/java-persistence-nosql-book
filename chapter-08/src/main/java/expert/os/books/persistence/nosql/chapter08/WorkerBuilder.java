package expert.os.books.persistence.nosql.chapter08;

import java.util.Collections;
import java.util.List;

public class WorkerBuilder {
    private String nickname;
    private String name;
    private boolean working;
    private String bio;
    private int age;
    private String email;
    private List<String> skills = Collections.emptyList();

    WorkerBuilder() {
    }

    public WorkerBuilder nickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public WorkerBuilder name(String name) {
        this.name = name;
        return this;
    }

    public WorkerBuilder working(boolean working) {
        this.working = working;
        return this;
    }

    public WorkerBuilder bio(String bio) {
        this.bio = bio;
        return this;
    }

    public WorkerBuilder age(int age) {
        this.age = age;
        return this;
    }

    public WorkerBuilder email(String email) {
        this.email = email;
        return this;
    }

    public WorkerBuilder skills(List<String> skills) {
        this.skills = skills;
        return this;
    }

    public Worker build() {
        return new Worker(nickname, name, working, bio, age, email, skills);
    }
}