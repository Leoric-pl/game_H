package com.company;

class Giving {
    /***********************************************gold***************************************************************/
    static void give_gold_to_city(Hero hero,City city,int amount)
    {
        amount=hero.subtract_gold(amount);
        city.add_gold(amount);
    }
    static void give_gold_to_hero(Hero hero,City city,int amount)
    {
       amount= city.subtract_gold(amount);
        hero.add_gold(amount);
    }

    static void give_gold_to_hero(Hero hero_giving,Hero hero_taking,int amount)
    {
        amount=hero_giving.subtract_gold(amount);
        hero_taking.add_gold(amount);
    }
    /**                                             sending-optional***************************************************/
//    static void send_gold_to_city(City city_giving,City city_taking,int amount)
//    {
//        amount=city_giving.subtract_gold(amount);
//        int way=abs((city_taking.poz_y)-(city_giving.poz_y))+abs((city_taking.poz_x)-(city_giving.poz_x));
//        city_taking.addpackage(current_turn+way,"gold",amount);
//    }
//
//    static void send_wood_to_city(City city_giving,City city_taking,int amount)
//    {
//        amount=city_giving.subtract_wood(amount);
//        int way=abs((city_taking.poz_y)-(city_giving.poz_y))+abs((city_taking.poz_x)-(city_giving.poz_x));
//        city_taking.addpackage(current_turn+way,"wood",amount);
//    }
//
//    static void send_crystal_to_city(City city_giving,City city_taking,int amount)
//    {
//        amount=city_giving.subtract_crystal(amount);
//        int way=abs((city_taking.poz_y)-(city_giving.poz_y))+abs((city_taking.poz_x)-(city_giving.poz_x));
//        city_taking.addpackage(current_turn+way,"crystal",amount);
//    }
    /*******************************************************wood******************************************************/
    static void give_wood_to_city(Hero hero,City city,int amount)
    {
        amount=hero.subtract_wood(amount);
        city.add_wood(amount);
    }
    static void give_wood_to_hero(Hero hero_giving,Hero hero_taking,int amount)
    {
        amount=hero_giving.subtract_wood(amount);
        hero_taking.add_wood(amount);
    }
    static void give_wood_to_hero(Hero hero,City city,int amount)
    {
        amount=city.subtract_wood(amount);
        hero.add_wood(amount);
    }

    /****************************************************crystal*******************************************************/
    static void give_crystal_to_city(Hero hero,City city,int amount)
    {
       amount= hero.subtract_crystal(amount);
        city.add_crystal(amount);
    }
    static void give_crystal_to_hero(Hero hero_giving,Hero hero_taking,int amount)
    {
       amount= hero_giving.subtract_crystal(amount);
        hero_taking.add_crystal(amount);
    }
    static void give_crystal_to_hero(Hero hero,City city,int amount)
    {
       amount= city.subtract_crystal(amount);
        hero.add_crystal(amount);
    }

    /*************************************************Cities?!********************************************************/
   // void CaptureCity
}
