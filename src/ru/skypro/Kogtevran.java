package ru.skypro;

public class Kogtevran extends Hogwards{
    private int mind;
    private int wisdom;
    private int creation;
    public Kogtevran(String name, int strenght, int transgres, int mind, int wisdom, int creation) {
        super(name, strenght, strenght);
        this.mind = mind;
        this.wisdom = wisdom;
        this.creation = creation;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCreation() {
        return creation;
    }
    public void setCreation(int creation) {
        this.creation = creation;
    }
        @Override
        public String toString() {
            return super.toString() + ", Ум " + mind + ", мудрость " + wisdom + ", креативность " + creation + ".";
        }
    public void compareKogtevran(Kogtevran student) {

        if (this.mind > student.getMind()) {
            System.out.println("Ум " + this.getName() + " выше чем у " + student.getName());
        } else if (this.mind == student.getMind()) {
            System.out.println("Ум " + this.getName() + " и " + student.getName() + " равны.");
        } else {
            System.out.println("Ум " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.wisdom > student.getWisdom()) {
            System.out.println("Мудрость " + this.getName() + " выше чем у " + student.getName());
        } else if (this.wisdom == student.getWisdom()) {
            System.out.println("Мудрость " + this.getName() + " и " + student.getName() + " равны.");
        } else {
            System.out.println("Мудрость " + this.getName() + " ниже чем у " + student.getName());
        }
        if (this.creation > student.getCreation()) {
            System.out.println("Креативность " + this.getName() + " выше чем у " + student.getName());
        } else if (this.creation == student.getCreation()) {
            System.out.println("Креативность " + this.getName() + " и " + student.getName() + " равны.");
        } else {
            System.out.println("Креативность " + this.getName() + " ниже чем у " + student.getName());
        }
    }
}
