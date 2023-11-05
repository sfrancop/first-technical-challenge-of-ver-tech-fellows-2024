package org.velezreyes.quiz.question6;

public class VendingMachineClass implements VendingMachine {

    private int availableMoney;

    public VendingMachineClass() {
        this.availableMoney = 0;
    }

    @Override
    public void insertQuarter() {
        this.availableMoney += 25;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if (this.availableMoney  == 0) {
            throw new NotEnoughMoneyException();
        }
        else{
            if (name=="ScottCola") {
                if (this.availableMoney >= 75) {
                    this.availableMoney -= 75;
                    return new DrinkClass(name, true);
                }
                else {
                    throw new NotEnoughMoneyException();
                }
            }
            else if (name=="KarenTea") {
                if (this.availableMoney >= 100) {
                    this.availableMoney -= 100;
                    return new DrinkClass(name, false);
                }
                else {
                    throw new NotEnoughMoneyException();
                }
            }
            else {
                throw new UnknownDrinkException();
            }
        }
    }

}
