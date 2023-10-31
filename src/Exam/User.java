package Exam;

import java.util.ArrayList;

public class User {
    private final int id;
    private String name;
    private ArrayList<String> rules = new ArrayList<>();

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, ArrayList<String> rules){
        this.id = id;
        this.name = name;
        for(String i: rules) {
            this.rules.add(i);
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getRules() {
        return rules;
    }

    public void setRules(ArrayList<String> rules) {
        this.rules = rules;
    }
}
