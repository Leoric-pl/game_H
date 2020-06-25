package files_0;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int PlayerID;
    static final int basic_max_move=15;
    int move_left=0;

    Player(String name, int PlayerID) {
        this.name = name;
        this.PlayerID = PlayerID;
    }

    String name;
    static List<Hero> heroes = new ArrayList<>();
    static List<City> cities = new ArrayList<>();

    void AddHero() {
        heroes.add(new Hero(1, 2));
    }

    Hero GetHero(int index_of_hero) {
        return heroes.get(index_of_hero);
    }

    City GetCity(int index_of_city) {
        return cities.get(index_of_city);
    }
    String getName()
    {return name;}

}
