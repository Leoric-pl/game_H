package files_0;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<City> Cities = new ArrayList<>();
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
        loadmap.loadStatic();
        Controller controller=new Controller();
        test3();
        Turn turn = new Turn();
        test();int i=0;
        while(i<5){
        controller.loadAll(1,0);
        controller.loadAll(2,0);
        controller.loadAll(2,1);
        controller.loadAll(2,2);
        i++;}
        turn.wait(1, 0);
        turn.give(1,0);
        turn.upgrade0(1,0,0);
        turn.upgrade1(1,0,1);
        turn.battle(teams.get(1).players.get(0).heroes.get(0),teams.get(1).players.get(0).heroes.get(1));
    }

    /***********************************to tests:*********************/
    private static void test()
    {
        show();
        test1();
        show();
    test2();
    show();
    test3();
    }
    private static void test1() {
        int zmienna = 3;
        teams.get(1).getPlayer(0).getHero(0).addGold(zmienna * 5);
        Giving.giveGoldToCity(teams.get(1).getPlayer(0).getHero(0), Cities.get(0), zmienna + 1);
        Giving.giveGoldToCity(teams.get(1).getPlayer(0).getHero(0), Cities.get(1), zmienna - 1);
        teams.get(1).getPlayer(0).getHero(1).addGold(10000);
    }

    private static void test2() {
        int zmienna = 3;
        Giving.giveGoldToCity(teams.get(1).getPlayer(0).getHero(0), Cities.get(0), zmienna + 50);
    }
    private static void show() {
        System.out.println("bo1:" + teams.get(1).getPlayer(0).getHero(0).getGoldAmount());
        System.out.println("ci1:" + Cities.get(0).goldAmount);
        System.out.println("ci2:" + Cities.get(1).goldAmount);
        System.out.println();
    }
    private static void test3(){
        System.out.println(Cities.get(0).name);
        System.out.println(Cities.get(1).name);
        System.out.println(teams.get(Cities.get(0).ownerTeam).getPlayer(Cities.get(0).ownerPlayer).name);
        System.out.println(teams.get(Cities.get(1).ownerTeam).getPlayer(Cities.get(1).ownerPlayer).name);
    }
}
