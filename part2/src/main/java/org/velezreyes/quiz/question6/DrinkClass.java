package org.velezreyes.quiz.question6;

public class DrinkClass implements Drink {

    String name;
    boolean fizzy;
    
    public DrinkClass(String name, boolean fizzy) {
        this.name = name;
        this.fizzy = fizzy;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public boolean isFizzy() {
        return this.fizzy;
    }
    
}
