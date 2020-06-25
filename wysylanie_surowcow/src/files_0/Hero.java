package files_0;

public class Hero {
    int wood_amount;
    int gold_amount;
    int crystal_amount;
    int poz_x, poz_y;

    Hero(int starting_poz_x, int starting_poz_y) {
        this.poz_x = starting_poz_x;
        this.poz_y = starting_poz_y;
    }

    void addWood(int amount) {
        wood_amount += amount;
    }

    int subtractWood(int amount) {
        if (wood_amount >= amount)
            wood_amount -= amount;
        else {
            amount = wood_amount;
            wood_amount = 0;
        }
        return amount;
    }

    void addGold(int amount) {
        gold_amount += amount;
    }

    int subtractGold(int amount) {
        if (gold_amount >= amount) gold_amount -= amount;
        else {
            amount = gold_amount;
            gold_amount = 0;
        }
        return amount;
    }

    void addCrystal(int amount) {
        crystal_amount += amount;
    }

    int subtractCrystal(int amount) {
        if (crystal_amount >= amount) crystal_amount -= amount;
        else {
            amount = crystal_amount;
            crystal_amount = 0;
        }
        return amount;
    }

}
