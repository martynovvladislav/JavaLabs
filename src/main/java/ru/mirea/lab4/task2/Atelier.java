package ru.mirea.lab4.task2;

public class Atelier implements MenClothing, WomanClothing {
    public Clothes[] clothes;
    @Override
    public void dressMan() {
        for(int i = 0; i < clothes.length; i++) {
            if(clothes[i].getClass().equals(TShirt.class) || clothes[i].getClass().equals(Pants.class) || clothes[i].getClass().equals(Tie.class)) {
                System.out.println("Тип: " + clothes[i].getClass().getSimpleName() + " Размер: " + clothes[i].size + " Стоимость " + clothes[i].cost + " Цвет: " + clothes[i].color);
            }
        }
    }

    @Override
    public void dressWoman() {
        for(int i = 0; i < clothes.length; i++) {
            if(clothes[i].getClass().equals(TShirt.class) || clothes[i].getClass().equals(Pants.class) || clothes[i].getClass().equals(Skirt.class)) {
                System.out.println("Тип: " + clothes[i].getClass().getSimpleName() + " Размер: " + clothes[i].size + " Стоимость " + clothes[i].cost + " Цвет: " + clothes[i].color);
            }
        }
    }

    public static void main(String[] args) {
        Atelier atelier = new Atelier();
        atelier.clothes = new Clothes[4];
        atelier.clothes[0] = new TShirt(Sizes.M, 123, "Blue");
        atelier.clothes[1] = new Pants(Sizes.L, 229, "Red");
        atelier.clothes[2] = new Skirt(Sizes.XS, 567, "Black");
        atelier.clothes[3] = new Tie(Sizes.L, 345, "White");
        System.out.println("Мужская одежда:");
        atelier.dressMan();
        System.out.println("\nЖенская одежда:");
        atelier.dressWoman();
    }
}
