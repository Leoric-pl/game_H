package files_0;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<City> neutralCities = new ArrayList<>();
    static List<Team> teams = new ArrayList<>();

    public static void main(String[] args) throws FileNotFoundException {
        teams.add(new Team("Neutral"));
        teams.add(new Team("Red"));
        teams.add(new Team("Blue"));
        teams.get(0).addPlayer("Neutral", 0);
        teams.get(1).addPlayer("Player0", 0);
        teams.get(2).addPlayer("Player1", 0);
        teams.get(2).addPlayer("Player2", 1);
        teams.get(2).addPlayer("Player3", 2);
        teams.get(1).getPlayer(0).AddHero(1, 2);
        teams.get(1).getPlayer(0).AddHero(2, 3);

        Loadmap loadmap = new Loadmap();
        loadmap.load_static();
        test3();
    }



    private static void loop() {
        System.out.println(teams.get(0).getPlayer(0).name);
        System.out.println(teams.get(1).getPlayer(0).name);
        System.out.println(teams.get(2).getPlayer(0).name);
        System.out.println(teams.get(2).getPlayer(1).name);
        System.out.println(teams.get(2).getPlayer(2).name);

    }
    /***********************************to tests:*********************/
    private static void test1() {
        int zmienna = 3;
        teams.get(0).getPlayer(0).getHero(0).addGold(zmienna * 5);
        Giving.giveGoldToCity(teams.get(0).getPlayer(0).getHero(0), neutralCities.get(0), zmienna + 1);
        Giving.giveGoldToCity(teams.get(0).getPlayer(0).getHero(0), neutralCities.get(1), zmienna - 1);
    }

    private static void test2() {
        int zmienna = 3;
        Giving.giveGoldToCity(teams.get(0).getPlayer(0).getHero(0), neutralCities.get(0), zmienna + 50);
    }
    private static void show() {
        System.out.println("bo1:" + teams.get(0).getPlayer(0).getHero(0).gold_amount);
        System.out.println("ci1:" + neutralCities.get(0).gold_amount);
        System.out.println("ci2:" + neutralCities.get(1).gold_amount);
        System.out.println();
    }
    private static void test3(){
        System.out.println(neutralCities.get(0).name);
        System.out.println(neutralCities.get(1).name);
        System.out.println(teams.get(neutralCities.get(0).ownerteam).getPlayer(neutralCities.get(0).ownerplayer).name);
        System.out.println(teams.get(neutralCities.get(1).ownerteam).getPlayer(neutralCities.get(1).ownerplayer).name);
        neutralCities.get(0).changeOwner(1,0);
        System.out.println(neutralCities.get(0).ownerteam);
        System.out.println(neutralCities.get(0).ownerplayer);
        System.out.println(teams.get(neutralCities.get(0).ownerteam).getPlayer(neutralCities.get(0).ownerplayer).name);
        System.out.println(teams.get(neutralCities.get(1).ownerteam).getPlayer(neutralCities.get(1).ownerplayer).name);
    }
}
