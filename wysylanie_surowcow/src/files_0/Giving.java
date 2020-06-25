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

    static void giveGoldToHero(Hero hero_giving,Hero hero_taking,int amount)
    {
        amount=hero_giving.subtractGold(amount);
        hero_taking.addGold(amount);
    }
    /**                                             sending-optional***************************************************/
//    static void sendGoldToCity(City city_giving,City city_taking,int amount)
//    {
//        amount=city_giving.subtractGold(amount);
//        int way=abs((city_taking.poz_y)-(city_giving.poz_y))+abs((city_taking.poz_x)-(city_giving.poz_x));
//        city_taking.addPackage(current_turn+way,"gold",amount);
//    }
//
//    static void sendWoodToCity(City city_giving,City city_taking,int amount)
//    {
//        amount=city_giving.subtractWood(amount);
//        int way=abs((city_taking.poz_y)-(city_giving.poz_y))+abs((city_taking.poz_x)-(city_giving.poz_x));
//        city_taking.addPackage(current_turn+way,"wood",amount);
//    }
//
//    static void sendCrystalToCity(City city_giving,City city_taking,int amount)
//    {
//        amount=city_giving.subtractCrystal(amount);
//        int way=abs((city_taking.poz_y)-(city_giving.poz_y))+abs((city_taking.poz_x)-(city_giving.poz_x));
//        city_taking.addPackage(current_turn+way,"crystal",amount);
//    }
    /*******************************************************wood******************************************************/
    static void giveWoodToCity(Hero hero,City city,int amount)
    {
        amount=hero.subtractWood(amount);
        city.addWood(amount);
    }
    static void giveWoodToHero(Hero hero_giving,Hero hero_taking,int amount)
    {
        amount=hero_giving.subtractWood(amount);
        hero_taking.addWood(amount);
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
    static void giveCrystalToHero(Hero hero_giving,Hero hero_taking,int amount)
    {
       amount= hero_giving.subtractCrystal(amount);
        hero_taking.addCrystal(amount);
    }
    static void giveCrystalToHero(Hero hero,City city,int amount)
    {
       amount= city.subtractCrystal(amount);
        hero.addCrystal(amount);
    }

    /*************************************************Cities?!********************************************************/
}
