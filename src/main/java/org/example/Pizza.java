package org.example;

import java.util.Objects;

public class Pizza {

    private final String name;
    private final Double cena;

    public Pizza(String name, Double cena) {
        this.name = name;
        this.cena = cena;
    }

    public String getName() {
        return name;
    }

    public Double getCena() {
        return cena;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        return Objects.equals(name, pizza.name) && Objects.equals(cena, pizza.cena);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cena);
    }
}
