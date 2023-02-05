package Lesson4.Lesson4_4;

import java.util.LinkedList;
import java.util.List;

public class Cannon {
    private String canonName;

    public Cannon(String canonName) {
        this.canonName = canonName;
    }

    private boolean loaded = false;

    public void fire() {
        if (this.loaded == false) {
            System.out.println("Brak kuli w armacie");
            this.loaded = true;
            System.out.println("Kula znajduje sie w  armacie");
        }
    }

    public static void main(String[] args) {
        List<Cannon> cannonList = new LinkedList<>();
        cannonList.add(new Cannon("Armata1"));
        cannonList.add(new Cannon("Armata2"));
        cannonList.add(new Cannon("Armata3"));
        cannonList.add(new Cannon("Armata4"));
        cannonList.add(new Cannon("Armata5"));

        for (Cannon c : cannonList) {
            c.fire();
        }
    }
}
