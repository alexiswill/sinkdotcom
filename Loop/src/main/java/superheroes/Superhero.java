package superheroes;

import java.sql.SQLOutput;

public class Superhero {
    public String name;
    public String superpower;

    public Superhero(String name, String superPower) {
        this.name = name;
        this.superpower = superPower;

    }

    public void printSuperhero() {
        System.out.println(name + " 's special power is" + superpower);
    }


}
