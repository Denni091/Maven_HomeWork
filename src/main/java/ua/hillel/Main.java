package ua.hillel;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Tom", "Davidson", 22);
        System.out.println("Name: " + human.getName() +
                "\nSurname: " + human.getSurName() + "\nAge: " + human.getAge());
    }
}