package files_0;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Main {

    static List <City> neutralCities= new ArrayList<>();
    static List <Team> teams= new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        teams.add(new Team("Neutral"));
        teams.add(new Team("Red"));
        teams.add(new Team("Blue"));
        teams.get(0).addPlayer("Neutral",0);
        teams.get(1).addPlayer("Player0",0);
        teams.get(2).addPlayer("Player1",0);
        teams.get(2).addPlayer("Player2",1);
        teams.get(2).addPlayer("Player3",2);
        teams.get(1).getPlayer(0).AddHero(1,2);
        teams.get(1).getPlayer(0).AddHero(2,3);

        Loadmap loadmap=new Loadmap();
        loadmap.load_static();
        int zmienna = 3;
        teams.get(0).getPlayer(0).getHero(0).addGold(zmienna *5);
        show();
        Giving.giveGoldToCity(teams.get(0).getPlayer(0).getHero(0),neutralCities.get(0), zmienna +1);
        Giving.giveGoldToCity(teams.get(0).getPlayer(0).getHero(0),neutralCities.get(1), zmienna -1);
        show();
        Giving.giveGoldToCity(teams.get(0).getPlayer(0).getHero(0),neutralCities.get(0), zmienna +50);
        show();
        loop();
        teams.get(2).removePlayer(1);
        System.out.println();
        loop();


    }
private static void show(){
    System.out.println("bo1:"+teams.get(0).getPlayer(0).getHero(0).gold_amount);
    System.out.println("ci1:"+neutralCities.get(0).gold_amount);
    System.out.println("ci2:"+neutralCities.get(1).gold_amount);
    System.out.println();

}
private  static  void loop()
{
    System.out.println(teams.get(0).getPlayer(0).name);
    System.out.println(teams.get(1).getPlayer(0).name);
    System.out.println(teams.get(2).getPlayer(0).name);
    System.out.println(teams.get(2).getPlayer(1).name);
    System.out.println(teams.get(2).getPlayer(2).name);

}
}
