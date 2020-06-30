package files_0;

import static files_0.Main.Cities;
import static files_0.Main.teams;

class Turn {
    void showCity(int teamIndex, int playerIndex, int cityIndex)
    {
        System.out.println("command done correctly");
        System.out.println(teamIndex);
        System.out.println(playerIndex);
        System.out.println(cityIndex);

    }
/*******************************************************testy**************************************************************/
   void basicTurn0(int teamIndex,int playerIndex)
    {
        if(Cities.get(0).ownerPlayer==playerIndex&&Cities.get(0).ownerTeam==teamIndex)Cities.get(0).goldAmount+=Cities.get(0).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove);
        Cities.get(0).changeOwner(teamIndex,playerIndex);
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove--;
        System.out.println(teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove);
        System.out.println(Cities.get(0).goldAmount);
        Cities.get(0).increaseLevelOfCity();
    }

    void basicTurn1(int teamIndex,int playerIndex)
    {
        if(Cities.get(0).ownerPlayer==playerIndex&&Cities.get(0).ownerTeam==teamIndex)Cities.get(0).goldAmount+=Cities.get(0).goldIncome;
        if(Cities.get(1).ownerPlayer==playerIndex&&Cities.get(1).ownerTeam==teamIndex)Cities.get(1).goldAmount+=Cities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(Cities.get(0).goldAmount);
        Cities.get(0).increaseLevelOfCity();
    }
    void wait(int teamIndex, int playerIndex)
    {if(Cities.get(0).ownerPlayer==playerIndex&&Cities.get(0).ownerTeam==teamIndex)Cities.get(0).goldAmount+=Cities.get(0).goldIncome;
        if(Cities.get(1).ownerPlayer==playerIndex&&Cities.get(1).ownerTeam==teamIndex)Cities.get(1).goldAmount+=Cities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        System.out.println(Cities.get(0).goldAmount);}
    void give(int teamIndex, int playerIndex)
    {if(Cities.get(0).ownerPlayer==playerIndex&&Cities.get(0).ownerTeam==teamIndex)Cities.get(0).goldAmount+=Cities.get(0).goldIncome;
        if(Cities.get(1).ownerPlayer==playerIndex&&Cities.get(1).ownerTeam==teamIndex)Cities.get(1).goldAmount+=Cities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(0).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(0).maxMove;
        Giving.giveGoldToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(0) ,Cities.get(0), 100000);
        System.out.println(Cities.get(0).goldAmount);
    System.out.println(teams.get(teamIndex).players.get(playerIndex).heroes.get(0).getGoldAmount());}
    void upgrade0(int teamIndex, int playerIndex, int heroIndex)
    {if(Cities.get(0).ownerPlayer==playerIndex&&Cities.get(0).ownerTeam==teamIndex)Cities.get(0).goldAmount+=Cities.get(0).goldIncome;
        if(Cities.get(1).ownerPlayer==playerIndex&&Cities.get(1).ownerTeam==teamIndex)Cities.get(1).goldAmount+=Cities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(heroIndex).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(heroIndex).maxMove;
        System.out.println(Cities.get(0).goldAmount);
        showstats(teamIndex,playerIndex,heroIndex);

        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeDefenseOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        Giving.giveGoldToCity(teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex),Cities.get(0),11000);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.incrementSizeOfUnit();
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.incrementSizeOfUnit();
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.incrementSizeOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
    }
    void upgrade1(int teamIndex, int playerIndex, int heroIndex)
    {if(Cities.get(0).ownerPlayer==playerIndex&&Cities.get(0).ownerTeam==teamIndex)Cities.get(0).goldAmount+=Cities.get(0).goldIncome;
        if(Cities.get(1).ownerPlayer==playerIndex&&Cities.get(1).ownerTeam==teamIndex)Cities.get(1).goldAmount+=Cities.get(1).goldIncome;
        teams.get(teamIndex).getPlayer(playerIndex).getHero(heroIndex).currentMove=teams.get(teamIndex).getPlayer(playerIndex).getHero(heroIndex).maxMove;
        System.out.println(Cities.get(0).goldAmount);
        showstats(teamIndex,playerIndex,heroIndex);

        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackFrequencyOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeDefenseOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeAttackOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).upgradeHitPointsOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
        Giving.giveGoldToCity(teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex),Cities.get(0),11000);
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.incrementSizeOfUnit();
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.incrementSizeOfUnit();
        teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.incrementSizeOfUnit();
        showstats(teamIndex,playerIndex,heroIndex);
    }
    void battle(Hero attacker, Hero defender)
    {
        Battle battle=new Battle();
        int currentExpOfAttacker=attacker.getExperience();
        int currentExpOfDefender=defender.getExperience();
    if(battle.battle(attacker, defender)==attacker)
    { Giving.giveGoldToHero(defender,attacker,defender.getGoldAmount());
        Giving.giveCrystalToHero(defender,attacker,defender.getCrystalAmount());
        Giving.giveWoodToHero(defender,attacker,defender.getWoodAmount());
        System.out.println("attacker got "+(attacker.getExperience()-currentExpOfAttacker));
        teams.get(1).getPlayer(0).removeHero(1);
    }
    else { Giving.giveGoldToHero(attacker,defender,attacker.getGoldAmount());
        Giving.giveCrystalToHero(attacker,defender,attacker.getCrystalAmount());
        Giving.giveWoodToHero(attacker,defender,attacker.getWoodAmount());
        System.out.println("defender got "+(defender.getExperience()-currentExpOfDefender));
        teams.get(1).getPlayer(0).removeHero(0);
    }
    }
    void showstats(int teamIndex, int playerIndex, int heroIndex){
        System.out.println();
        System.out.println("size: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getSizeOfUnit());
        System.out.println("attack: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getBasicAttack());
        System.out.println("defense: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getBasicDefense());
        System.out.println("attackFrequency: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getAttackFrequency());
        System.out.println("hitPoints: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).heroBattleUnit.getHitPoints());
        System.out.println("gold: "+teams.get(teamIndex).players.get(playerIndex).heroes.get(heroIndex).getGoldAmount());
    }

}
