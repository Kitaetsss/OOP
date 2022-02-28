package ru.skypro;

public class Hogwards {
    private String name;
    private int strenght;
    private int transgres;
    public Hogwards(String name, int strenght, int transgres) {
        this.name = name;
        this.strenght = strenght;
        this.transgres = transgres;
    }
    public String getName() {
        return name;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getTransgres() {
        return transgres;
    }

    @Override
    public String toString() {
        return "Студент " + name + " Обладает силой магии " + strenght + " и может трансгрессировать на расстояние " + transgres;
    }
    public void compareStudents(Hogwards student) {
        if (this.strenght > student.getStrenght()) {
            System.out.println("Сила магии " + this.name + " выше чем у " + student.getName());
        } else if (this.strenght == student.getStrenght()) {
            System.out.println("Сила магии " + this.name + " равна силе магии " + student.getName());
        }
        else if (this.strenght < student.getStrenght()) {
            System.out.println("Сила магии " + this.name + " меньше чем у " + student.getName());
        }
        if (this.transgres > student.getTransgres()) {
            System.out.println("Расстояние трансгрессии " + this.name + " выше чем у " + student.getName());
        } else if (this.transgres == student.getTransgres()) {
            System.out.println("Расстояние трансгрессии " + this.name + " и " + student.getName() + " равны");
        }
        else if (this.transgres < student.getTransgres()) {
            System.out.println("Расстояние трансгрессии " + this.name + " меньше чем у " + student.getName());
        }
    }
    public static void main(String[] args) {
                Hogwards harryPotter = new Griffindor("Гарри Поттер", 85, 90, 45, 50, 54);
                Hogwards germionaGrenjer = new Griffindor("Гермиона Грейнджер", 75, 95, 28, 64, 48);
                Hogwards ronYizly = new Griffindor("Рон Уизли", 70, 86, 58, 49, 50);

                Hogwards chjoyChang = new Kogtevran("Чжоу Чанг", 58, 68, 45, 48, 59);
                Hogwards padmaPatil = new Kogtevran("Падма Патил", 64, 48, 64, 49, 82);
                Hogwards markysBelby = new Kogtevran("Маркус Белби", 58, 69, 59, 91, 28);

                Hogwards zaxariyaSmitt = new Puffendui("Захария Смит", 58, 34, 29, 39, 74);
                Hogwards sendrikDiggory = new Puffendui("Седрик Диггори", 49, 85, 76, 84, 97);
                Hogwards djastinFinch = new Puffendui("Джастин Финч-Флетчли", 46, 58, 84, 97, 15);

                Hogwards drakoMalfoi = new Slizerin("Драко Малфой", 58, 69, 43, 58, 94, 21, 15);
                Hogwards grehemMontegu = new Slizerin("Грэхэм Монтегю", 76, 50, 58, 69, 48, 28, 43);
                Hogwards gregoryGoil = new Slizerin("Грегори Гойл", 39, 80, 54, 58, 97, 71, 21);

        harryPotter.compareStudents(gregoryGoil);
        chjoyChang.compareStudents(zaxariyaSmitt);
        drakoMalfoi.compareStudents(ronYizly);
        System.out.println(harryPotter);
        System.out.println(drakoMalfoi);
        System.out.println(sendrikDiggory);
    }
}
