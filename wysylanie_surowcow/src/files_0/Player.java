package files_0;

import java.util.ArrayList;
import java.util.List;

public class Player {
    int PlayerID;

    Player(String name, int PlayerID) {
        this.name = name;
        this.PlayerID = PlayerID;
    }

    String name;
    List<Hero> heroes = new ArrayList<>();

    void AddHero(int startingPozX, int startingPozY) {
        heroes.add(new Hero(startingPozX, startingPozY));
    }

    Hero getHero(int indexOfHero) {
        return heroes.get(indexOfHero);
    }

  //  City getCity(int indexOfCity) {
   //     return cities.get(indexOfCity);}
    String getName()
    {return name;}

}
