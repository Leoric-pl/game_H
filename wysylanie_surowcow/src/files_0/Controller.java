package files_0;

import java.util.Scanner;

import static files_0.Main.Cities;
import static files_0.Main.teams;
import static java.lang.Integer.parseInt;

public class Controller {
    void loadAll(int teamIndex, int playerIndex)
    {
        Turn turn=new Turn();
        Scanner textInput=new Scanner(System.in);
        int numberOfCommands=100;
        while(numberOfCommands>0){
            numberOfCommands--;String command=textInput.nextLine();
            String[] splitCommand=command.split(" ");
            if(splitCommand[0].equals("ba0"))turn.basicTurn0(teamIndex,playerIndex);
            else if(splitCommand[0].equals("ba1")) turn.basicTurn1(teamIndex, playerIndex);
            else if(splitCommand[0].equals("city")){
                int cityIndex=parseInt(splitCommand[1]);
                if(splitCommand[2].equals("upgrade")) {
                    if (splitCommand[3].equals("unit")) {
                        switch (splitCommand[4]) {
                            case "attack":
                                Cities.get(cityIndex).upgradeAttackOfUnit();
                                break;
                            case "defense":
                                Cities.get(cityIndex).upgradeDefenseOfUnit();
                                break;
                            case "frequency":
                                Cities.get(cityIndex).upgradeAttackFrequencyOfUnit();
                                break;
                            case "hp":
                                Cities.get(cityIndex).upgradeHitPointsOfUnit();
                                break;
                        }
                    } else if (splitCommand[3].equals("income")) Cities.get(0).increaseLevelOfCity();
                    else if (splitCommand[3].equals("defense")) Cities.get(0).increaseCityDefences();
                }
                else if(splitCommand[2].equals("show")) turn.showCity(teamIndex,playerIndex,cityIndex);
            else if(splitCommand[3].equals("give"))
                {if(splitCommand[4].equals("gold"))
                if(splitCommand[5].equals("to")||splitCommand.equals("(to)"))
                loadTaker(teamIndex, playerIndex, splitCommand,6,"gold");
                else loadTaker(teamIndex, playerIndex, splitCommand,5,"gold");
                }
            }


        }
    }
    void loadTaker( int teamIndex,int playerIndex, String[] splitCommand, int startingIndex, String source)
    {
        if(splitCommand[startingIndex].equals("hero"))
        {if(source.equals("gold"))Giving.giveGoldToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex+1])), Cities.get(parseInt(splitCommand[1])),parseInt(splitCommand[startingIndex+2]));
           else if(source.equals("wood"))Giving.giveWoodToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex+1])), Cities.get(parseInt(splitCommand[1])),parseInt(splitCommand[startingIndex+2]));
           else if(source.equals("crystal"))Giving.giveCrystalToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex+1])), Cities.get(parseInt(splitCommand[1])),parseInt(splitCommand[startingIndex+2]));
        }
    }
}