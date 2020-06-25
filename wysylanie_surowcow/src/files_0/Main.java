package files_0;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
public class Main {

    static List <City> neutralcities= new ArrayList<>();
    static List <Team> teams= new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        teams.add(new Team("Neutral"));
        teams.add(new Team("Red"));
        teams.add(new Team("Blue"));
        teams.get(0).addplayer("Neutral",0);
        teams.get(1).addplayer("Player0",1);
        teams.get(2).addplayer("Player1",2);
        teams.get(2).addplayer("Player2",3);
        teams.get(1).getPlayer(1).AddHero(1,2);
        teams.get(1).getPlayer(1).AddHero(2,3);

        Loadmap loadmap=new Loadmap();
        loadmap.load_static();
        int zmienna = 3;
        teams.get(0).getPlayer(0).GetHero(0).add_gold(zmienna *5);
        show();
        Giving.give_gold_to_city(teams.get(0).getPlayer(0).GetHero(0),neutralcities.get(0), zmienna +1);
        Giving.give_gold_to_city(teams.get(0).getPlayer(0).GetHero(0),neutralcities.get(1), zmienna -1);
        show();
        Giving.give_gold_to_city(teams.get(0).getPlayer(0).GetHero(0),neutralcities.get(0), zmienna +50);
        show();
        loop();
        teams.get(1).removePlayer(2);
        System.out.println();
        loop();


    }
private static void show(){
    System.out.println("bo1:"+teams.get(0).getPlayer(0).GetHero(0).gold_amount);
    System.out.println("ci1:"+neutralcities.get(0).gold_amount);
    System.out.println("ci2:"+neutralcities.get(1).gold_amount);
    System.out.println();

}
private  static  void loop()
{
    for(int i=0;i<3;i++)
    if(teams.get(2).getPlayer(i)!=null)
    System.out.println(teams.get(2).getPlayer(i).getName());
}
}
