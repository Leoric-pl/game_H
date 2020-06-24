package com.company;

public class City {
    int poz_x,poz_y;
    int wood_amount;
    int gold_amount;
    int crystal_amount;
    String name;

    City(int poz_x,int poz_y,String name){this.poz_x=poz_x;this.poz_y=poz_y;
    this.name=name;}
    String GetCityName(){return name;}

    void add_wood(int amount)
    {wood_amount+=amount;}
    int subtract_wood(int amount)
    {if(wood_amount>=amount)
        wood_amount-=amount;
    else {amount=wood_amount;wood_amount=0;}
        return amount;}
    void add_gold(int amount)
    {gold_amount+=amount;}
    int subtract_gold(int amount)
    {
        if(gold_amount>=amount)gold_amount-=amount;
        else {amount=gold_amount;gold_amount=0;}return amount;}
    void add_crystal(int amount)
    {crystal_amount+=amount;}
    int  subtract_crystal(int amount)
    {if(crystal_amount>=amount)crystal_amount-=amount;else {amount=crystal_amount;crystal_amount=0;}return amount;}
    void addpackage(int destination_time, String kind, int value)
    {Package_reinforce package_player1=new Package_reinforce(destination_time,kind,value);}

}
