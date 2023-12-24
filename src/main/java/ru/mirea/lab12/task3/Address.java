package ru.mirea.lab12.task3;

import java.util.StringTokenizer;

public class Address {
    String country;
    String region;
    String city;
    String street;
    String house;
    String corpus;
    String flat;

    public Address(String country, String region, String city, String street, String house, String corpus, String flat) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.corpus = corpus;
        this.flat = flat;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", corpus='" + corpus + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

    public static Address newAddressSpl(String addstr) {
        String[] words = addstr.split(", ");
        return new Address(words[0], words[1], words[2], words[3], words[4], words[5], words[6]);
    }

    public static Address newAddressTok(String addstr) {
        StringTokenizer st;
        if(addstr.indexOf(",") != -1) {
            st = new StringTokenizer(addstr, ", ");
        }
        else if(addstr.indexOf(".") != -1) {
            st = new StringTokenizer(addstr, ". ");
        }
        else {
            st = new StringTokenizer(addstr, "; ");
        }
        return new Address(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
    }

    public static void main(String[] args) {
        String ad = "Russia, Center, Moscow, Vernandskogo st, 86, 1, 94";
        Address address = Address.newAddressSpl(ad);
        System.out.println(address);
        ad = "USA; Texas; Dallas; First; 56; 4; 14";
        address = Address.newAddressTok(ad);
        System.out.println(address);
        ad = "Russia, Leningradskaya obl, St Petersburg, Pushkina, 13, 1, 13";
        address = Address.newAddressSpl(ad);
        System.out.println(address);
        ad = "Russia. Kirovaskaya obl. Kirov. 30 let oktyabrya. 67. 1. 22";
        address = Address.newAddressTok(ad);
        System.out.println(address);
    }
}
