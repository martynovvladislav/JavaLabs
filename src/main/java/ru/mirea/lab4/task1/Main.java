package ru.mirea.lab4.task1;
enum Seasons {
    SPRING("Тает снег, птички начинают петь", 13.5),
    SUMMER("Тепло, солнышко, купаться можно", 24.8),
    AUTUMN("Листья опадают, становится холоднее, учеба начинается", 2.4),
    WINTER("Дубак конкретный, новый год", -15.4)
    ;
    private final String info;
    private final double temp;
    private Seasons(String info, double temp) {
        this.info = info;
        this.temp = temp;
    }

    public String getInfo() {
        return info;
    }
    public String getDescription() {
        if(this.equals(Seasons.SUMMER)) return "Теплое время года";
        return "Холодное время года";
    }

    @Override
    public String toString() {
        return (this.name() + " " + this.temp + " " + this.info);
    }
}

public class Main {

    public static void out(Seasons season) {
        switch(season) {
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }

    public static void main(String[] args) {
        Seasons season = Seasons.WINTER;
        System.out.println(season.getInfo());
        Seasons season1 = Seasons.SUMMER;
        out(season1);
        System.out.println(season.getDescription());
        System.out.println(season1.getDescription());
        for(Seasons s : Seasons.values()) {
            System.out.println(s);
        }
    }
}
