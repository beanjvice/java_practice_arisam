package assignment1_arisam;

import java.time.*;

public class Assignment1_arisam
{
    public static void main(String[] args)
    {
                int age;
               long ID;
              String name,email;
            LocalDateTime dt;

            age = 19;
            ID = 12345678;

            name = "Arisa Moonsammy";
            email = "aricollegem@gmail.com";

            dt = LocalDateTime.now();

            System.out.println("My name is " + name);
            System.out.println("My age is " + age);
            System.out.println("My ID num is " + ID);
            System.out.println("My email address is " + email);
            System.out.println("Today's date is " + dt);
            System.out.println("\n\nIt is awesome sauce to program in java!\n\n");
    }
}
