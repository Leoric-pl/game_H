package files_0;

public class Hero {

    int woodAmount;
    int goldAmount;
    int crystalAmount;
    int pozX, pozY;
    final int maxMove=15;
    int currentMove=0;
    BattleUnit battleUnit=new BattleUnit();
    Hero(int startingPozX, int startingPozY) {
        this.pozX = startingPozX;
        this.pozY = startingPozY;
        battleUnit.setSizeOfUnit();
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
    private void upgradeOfBattleUnit(String param)//avaliable: attack, defense, hitPoints,attackFrequency
    {double OldCost=battleUnit.valueOfUnit();
    double newCost=battleUnit.valueOfUpgradedUnit(param);
        int cost=(int)(newCost-OldCost);
        if(cost<=goldAmount)
        {goldAmount-=cost;
        battleUnit.incrementBasicAttack();}
        else System.out.println("Not enough money, You need "+cost+" gold and You have only "+goldAmount);
        }
        void upgradeAttackOfUnit()
        {upgradeOfBattleUnit("attack");}
        void upgradeDefenseOfUnit(){upgradeOfBattleUnit("defense");}
        void upgradeHitPointsOfUnit(){upgradeOfBattleUnit("hitPoints");}
        void upgradeAttackFrequencyOfUnit(){upgradeOfBattleUnit("attackFrequency");}

}
