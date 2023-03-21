package edu.julia.synthax;

public class FirstClass {
    public static void main(String[] args) {
        String firstName = "Julia";
        String lastName = "Kalazans";

        String fullName = fullName(firstName, lastName);
        System.out.println(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
