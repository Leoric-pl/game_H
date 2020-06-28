package files_0;

import static files_0.Main.neutralCities;
import static files_0.Main.teams;

class Turn {



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
        if(neutralCities.get(1).ownerPlayer==playerIndex&&neutralCities.get(1).ownerTeam==teamIndex)neutralCities.get(1).goldAmount+=neutralCities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(neutralCities.get(0).goldAmount);
        neutralCities.get(0).increaseLevelOfCity();
    }
    void wait(int teamIndex, int playerIndex)
    {if(neutralCities.get(0).ownerPlayer==playerIndex&&neutralCities.get(0).ownerTeam==teamIndex)neutralCities.get(0).goldAmount+=neutralCities.get(0).goldIncome;
        if(neutralCities.get(1).ownerPlayer==playerIndex&&neutralCities.get(1).ownerTeam==teamIndex)neutralCities.get(1).goldAmount+=neutralCities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(neutralCities.get(0).goldAmount);}
    void give(int teamIndex, int playerIndex)
    {if(neutralCities.get(0).ownerPlayer==playerIndex&&neutralCities.get(0).ownerTeam==teamIndex)neutralCities.get(0).goldAmount+=neutralCities.get(0).goldIncome;
        if(neutralCities.get(1).ownerPlayer==playerIndex&&neutralCities.get(1).ownerTeam==teamIndex)neutralCities.get(1).goldAmount+=neutralCities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        Giving.giveGoldToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(0) ,neutralCities.get(0), 100000);
        System.out.println(neutralCities.get(0).goldAmount);
    System.out.println(teams.get(teamIndex).players.get(playerIndex).heroes.get(0).goldAmount);}
    void upgrade(int teamIndex, int playerIndex)
    {if(neutralCities.get(0).ownerPlayer==playerIndex&&neutralCities.get(0).ownerTeam==teamIndex)neutralCities.get(0).goldAmount+=neutralCities.get(0).goldIncome;
        if(neutralCities.get(1).ownerPlayer==playerIndex&&neutralCities.get(1).ownerTeam==teamIndex)neutralCities.get(1).goldAmount+=neutralCities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(neutralCities.get(0).goldAmount);
        showstats(teamIndex,playerIndex,0);


        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeDefenseOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeAttackOfUnit();
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,0);
        Giving.giveGoldToCity(teams.get(teamIndex).players.get(playerIndex).heroes.get(0),neutralCities.get(0),11000);
        showstats(teamIndex,playerIndex,0);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(0).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,0);


    }
    void showstats(int teamIndex, int playerIndex, int heroIndex){
        System.out.println();
        System.out.println("size: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getSizeOfUnit());
        System.out.println("attack: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getBasicAttack());
        System.out.println("defense: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getBasicDefense());
        System.out.println("attackFrequency: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getAttackFrequency());
        System.out.println("hitPoints: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getHitPoints());
        System.out.println("gold: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).goldAmount);
    }

}
