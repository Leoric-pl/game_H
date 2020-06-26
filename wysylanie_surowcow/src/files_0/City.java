package files_0;

public class City {
    int pozX, pozY;
    int woodAmount;
    int goldAmount;
    int crystalAmount;
    int goldIncome=500;
    int ownerTeam = 0;
    int ownerPlayer = 0;
    int levelOfCity=1;
    String name;

    City(int pozX, int pozY, String name) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.name = name;
    }

    String getCityName() {
        return name;
    }

    void addWood(int amount) {
        woodAmount += amount;
    }

    int subtractWood(int amount) {
        if (woodAmount >= amount)
            woodAmount -= amount;
        else {
            amount = woodAmount;
            woodAmount = 0;
        }
        return amount;
    }

    void addGold(int amount) {
        goldAmount += amount;
    }

    int subtractGold(int amount) {
        if (goldAmount >= amount) goldAmount -= amount;
        else {
            amount = goldAmount;
            goldAmount = 0;
        }
        return amount;
    }

    void addCrystal(int amount) {
        crystalAmount += amount;
    }

    int subtractCrystal(int amount) {
        if (crystalAmount >= amount) crystalAmount -= amount;
        else {
            amount = crystalAmount;
            crystalAmount = 0;
        }
        return amount;
    }

    void addPackage(int destinationTime, String kind, int value) {
        PackageReinforce packagePlayer1 = new PackageReinforce(destinationTime, kind, value);
    }

    void changeOwner(int teamNumber, int playerNumber) {
        this.ownerPlayer = playerNumber;
        this.ownerTeam = teamNumber;
    }
    void increaseLevelOfCity()
    {if(goldAmount>=goldIncome*3)
    {
    goldAmount-=goldIncome*3;
    goldIncome*=2;
    levelOfCity++;}
    else System.out.println("not enough gold");
    }
    void buyUnit(){}

}
