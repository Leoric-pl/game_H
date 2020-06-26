package files_0;

import static files_0.Main.neutralCities;
import static files_0.Main.teams;

public class Turn {
/*******************************************************testy**************************************************************/
   void basicTurn0(int teamIndex,int playerIndex)
    {
        if(neutralCities.get(0).ownerPlayer==playerIndex&&neutralCities.get(0).ownerTeam==teamIndex)neutralCities.get(0).goldAmount+=neutralCities.get(0).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove);
        neutralCities.get(0).changeOwner(teamIndex,playerIndex);
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove--;
        System.out.println(teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove);
        System.out.println(neutralCities.get(0).goldAmount);
        neutralCities.get(0).increaseLevelOfCity();
    }

    void basicTurn1(int teamIndex,int playerIndex)
    {
        if(neutralCities.get(0).ownerPlayer==playerIndex&&neutralCities.get(0).ownerTeam==teamIndex)neutralCities.get(0).goldAmount+=neutralCities.get(0).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(neutralCities.get(0).goldAmount);
        neutralCities.get(0).increaseLevelOfCity();
    }

}
