package files_0;

class Giving {
    /***********************************************gold***************************************************************/
    static void giveGoldToCity(Hero hero,City city,int amount)
    {
        amount=hero.subtractGold(amount);
        city.addGold(amount);
    }
    static void giveGoldToHero(Hero hero,City city,int amount)
    {
       amount= city.subtractGold(amount);
        hero.addGold(amount);
    }

    static void giveGoldToHero(Hero heroGiving,Hero heroTaking,int amount)
    {
        amount=heroGiving.subtractGold(amount);
        heroTaking.addGold(amount);
    }
    /***********************************************sending-optional***************************************************/
//    static void sendGoldToCity(City cityGiving,City cityTaking,int amount)
//    {
//        amount=cityGiving.subtractGold(amount);
//        int way=abs((cityTaking.pozY)-(cityGiving.pozY))+abs((cityTaking.pozX)-(cityGiving.pozX));
//        cityTaking.addPackage(currentTurn+way,"gold",amount);
//    }
//
//    static void sendWoodToCity(City cityGiving,City cityTaking,int amount)
//    {
//        amount=cityGiving.subtractWood(amount);
//        int way=abs((cityTaking.pozY)-(cityGiving.pozY))+abs((cityTaking.pozX)-(cityGiving.pozX));
//        cityTaking.addPackage(currentTurn+way,"wood",amount);
//    }
//
//    static void sendCrystalToCity(City cityGiving,City cityTaking,int amount)
//    {
//        amount=cityGiving.subtractCrystal(amount);
//        int way=abs((cityTaking.pozY)-(cityGiving.pozY))+abs((cityTaking.pozX)-(cityGiving.pozX));
//        cityTaking.addPackage(currentTurn+way,"crystal",amount);
//    }
    /*******************************************************wood******************************************************/
    static void giveWoodToCity(Hero hero,City city,int amount)
    {
        amount=hero.subtractWood(amount);
        city.addWood(amount);
    }
    static void giveWoodToHero(Hero heroGiving,Hero heroTaking,int amount)
    {
        amount=heroGiving.subtractWood(amount);
        heroTaking.addWood(amount);
    }
    static void giveWoodToHero(Hero hero,City city,int amount)
    {
        amount=city.subtractWood(amount);
        hero.addWood(amount);
    }

    /****************************************************crystal*******************************************************/
    static void giveCrystalToCity(Hero hero,City city,int amount)
    {
       amount= hero.subtractCrystal(amount);
        city.addCrystal(amount);
    }
    static void giveCrystalToHero(Hero heroGiving,Hero heroTaking,int amount)
    {
       amount= heroGiving.subtractCrystal(amount);
        heroTaking.addCrystal(amount);
    }
    static void giveCrystalToHero(Hero hero,City city,int amount)
    {
       amount= city.subtractCrystal(amount);
        hero.addCrystal(amount);
    }

    /*************************************************Cities?!********************************************************/
}
