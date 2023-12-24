package ru.mirea.lab7.task5;

public class ProcessStrings implements  StringInterface {
    private String string;

    public ProcessStrings(String string) {
        this.string = string;
    }

    @Override
    public String toString() {
        return this.string;
    }

    @Override
    public int count() {
        return this.string.length();
    }

    @Override
    public String oddString() {
        String newstr = "";
        for(int i = 0; i < this.count(); i++) {
            if(i % 2 == 0) newstr += this.string.charAt(i);
        }
        return newstr;
    }

    @Override
    public void invert() {
        StringBuilder str = new StringBuilder(this.string);
        for(int i = 0; i < this.count(); i++) {
            char temp = this.string.charAt(i);
            str.setCharAt(i, this.string.charAt(this.count() - i - 1));
            str.setCharAt(this.count() - i - 1, temp);
        }
        this.string = str.toString();
    }

    public static void main(String[] args) {
        ProcessStrings str = new ProcessStrings("abcdef");
        System.out.println(str);
        System.out.println(str.count());
        System.out.println(str.oddString());
        str.invert();
        System.out.println(str);
    }
}
