package files_0;

public class Hero {

    private int woodAmount;
    private int goldAmount;
    private int crystalAmount;
    int pozX, pozY;
    final int maxMove=5;
    int currentMove=0;
  private   int experience=0;
    int experienceToNextLevel=5000;
    private int heroLevel=1;
    BattleUnit heroBattleUnit=new BattleUnit();
    Hero(int startingPozX, int startingPozY) {
        this.pozX = startingPozX;
        this.pozY = startingPozY;
        heroBattleUnit.setSizeOfUnit();
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
    private boolean upgradeOfBattleUnit(String param)//avaliable: attack, defense, hitPoints,attackFrequency
    {
        heroBattleUnit.setHireCostPerUnit();
        double OldCost=heroBattleUnit.valueOfUnit();
    double newCost=heroBattleUnit.valueOfUpgradedUnit(param);
        int cost=(int)(newCost)-(int)(OldCost);
        if(cost<=goldAmount)
        {goldAmount-=cost; return  true;}
        else System.out.println("Not enough money, You need "+cost+" gold and You have only "+goldAmount);return false;
        }

        void upgradeAttackOfUnit(){if(upgradeOfBattleUnit("attack"))heroBattleUnit.incrementBasicAttack();}
        void upgradeDefenseOfUnit(){if(upgradeOfBattleUnit("defense"))heroBattleUnit.incrementBasicDefense();}
        void upgradeHitPointsOfUnit(){if(upgradeOfBattleUnit("hitPoints"))heroBattleUnit.incrementHitPoints();}
        void upgradeAttackFrequencyOfUnit(){if(upgradeOfBattleUnit("attackFrequency"))heroBattleUnit.incrementAttackFrequency();}

    void addExperience(int amount){
experience+=amount;
    if(experience>=experienceToNextLevel){
        System.out.println("level up! To "+ ++heroLevel);experience-=experienceToNextLevel;experienceToNextLevel*=3;}}
    int getExperience(){return experience;}
    int getGoldAmount(){return  goldAmount;}
    int getWoodAmount(){return woodAmount;}
    int getCrystalAmount(){return crystalAmount;}

}
