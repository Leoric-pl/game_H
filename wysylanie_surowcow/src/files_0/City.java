package files_0;

 class City {
    static final int MAX_LEVEL_OF_CITY=5;
    int pozX, pozY;
    int woodAmount;
    int goldAmount;
    int crystalAmount;
    int goldIncome=500;
    int ownerTeam = 0;
    int ownerPlayer = 0;
    int levelOfCity=1;
    int levelOfDfences=0;
    String name;
    BattleUnit cityBattleUnit=new BattleUnit();

    City(int pozX, int pozY, String name) {
        this.pozX = pozX;
        this.pozY = pozY;
        this.name = name;
        cityBattleUnit.setSizeOfUnit();
    }
    City(int pozX, int pozY) {
        this.pozX = pozX;
        this.pozY = pozY;
        cityBattleUnit.setSizeOfUnit();
    }

//    String getCityName() {
//        return name;
//    }

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
    {if(goldAmount>=goldIncome*3&&levelOfCity<MAX_LEVEL_OF_CITY)
    {
    goldAmount-=goldIncome*3;
    goldIncome*=2;
    levelOfCity++;
    System.out.println("increased gold income to "+goldIncome);}
    else if(goldAmount<goldIncome*3) System.out.println("not enough gold");
    else System.out.println("Max income level reached");
    }

    private boolean upgradeOfBattleUnit(String param)//avaliable: attack, defense, hitPoints,attackFrequency
    {
        cityBattleUnit.setHireCostPerUnit();
        double OldCost=cityBattleUnit.valueOfUnit();
        double newCost=cityBattleUnit.valueOfUpgradedUnit(param);
        int cost=(int)(newCost)-(int)(OldCost);
        if(cost<=goldAmount)
        {goldAmount-=cost; return  true;}
        else System.out.println("Not enough money, You need "+cost+" gold and You have only "+goldAmount);return false;
    }

    void upgradeAttackOfUnit(){if(upgradeOfBattleUnit("attack"))cityBattleUnit.incrementBasicAttack();}
    void upgradeDefenseOfUnit(){if(upgradeOfBattleUnit("defense"))cityBattleUnit.incrementBasicDefense();}
    void upgradeHitPointsOfUnit(){if(upgradeOfBattleUnit("hitPoints"))cityBattleUnit.incrementHitPoints();}
    void upgradeAttackFrequencyOfUnit(){if(upgradeOfBattleUnit("attackFrequency"))cityBattleUnit.incrementAttackFrequency();}
    void increaseCityDefences()
    {if(woodAmount>=5+5*levelOfDfences)
    {
        woodAmount=woodAmount-(levelOfDfences+1)*5;
        levelOfDfences++;
        System.out.println("increased level of defences");
    }
    else if(woodAmount<5+5*levelOfDfences) System.out.println("not enough wood");
    else System.out.println("Max defense level reached");
    }
    void buyUnit(){}

}
