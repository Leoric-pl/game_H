package files_0;

public class City {
    int poz_x, poz_y;
    int wood_amount;
    int gold_amount;
    int crystal_amount;
    int ownerteam = 0;
    int ownerplayer = 0;
    String name;

    City(int poz_x, int poz_y, String name) {
        this.poz_x = poz_x;
        this.poz_y = poz_y;
        this.name = name;
    }

    String getCityName() {
        return name;
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

    void addPackage(int destination_time, String kind, int value) {
        Package_reinforce package_player1 = new Package_reinforce(destination_time, kind, value);
    }

    void changeOwner(int teamnumber, int playernumber) {
        this.ownerplayer = playernumber;
        this.ownerteam = teamnumber;
    }
}
