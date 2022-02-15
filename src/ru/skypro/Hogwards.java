package ru.skypro;

public class Hogwards {

    public static void main(String[] args) {
        Griffindor[] griffindor = {
                new Griffindor("Гарри Поттер", 85, 90, 45, 50, 54),
                new Griffindor("Гермиона Грейнджер", 75, 95, 28, 64, 48),
                new Griffindor("Рон Уизли", 70, 86, 58, 49, 50)
        };
        Kogtevran[] kogtevran = {
                new Kogtevran("Чжоу Чанг", 58, 68, 45, 48, 59),
                new Kogtevran("Падма Патил", 64, 48, 64, 49, 82),
                new Kogtevran("Маркус Белби", 58, 69, 59, 91, 28)
        };
        Puffendui[] puffendui = {
                new Puffendui("Захария Смит", 58, 34, 29, 39, 74),
                new Puffendui("Седрик Диггори", 49, 85, 76, 84, 97),
                new Puffendui("Джастин Финч-Флетчли", 46, 58, 84, 97, 15)
        };
        Slizerin[] slizerin = {
                new Slizerin("Драко Малфой", 58, 69, 43, 58, 94, 21, 15),
                new Slizerin("Грэхэм Монтегю", 76, 50, 58, 69, 48, 28, 43),
                new Slizerin("Грегори Гойл", 39, 80, 54, 58, 97, 71, 21)
        };
        griffindor[0].Opis();
        Griffindor.SravnenieBlago(griffindor, 0, 2);
        Slizerin.SreavnenieVlasti(slizerin, 1, 2);
        Puffendui.SravnenieVernosti(puffendui, 0, 2);
        Kogtevran.SravnenieUma(kogtevran, 0,1);
        Person.SravnenieSili(griffindor, slizerin, 0, 1);
    }
}
