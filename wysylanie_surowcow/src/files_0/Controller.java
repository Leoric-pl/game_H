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
            switch (splitCommand[0]) {
                case "ba0":
                    turn.basicTurn0(teamIndex, playerIndex);
                    break;
                case "ba1":
                    turn.basicTurn1(teamIndex, playerIndex);
                    break;
                case "city":
                    int cityIndex = parseInt(splitCommand[1]);
                    if (splitCommand[2].equals("upgrade")) {
                        switch (splitCommand[3]) {
                            case "unit":
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
                                break;
                            case "income":
                                Cities.get(0).increaseLevelOfCity();
                                break;
                            case "defense":
                                Cities.get(0).increaseCityDefences();
                                break;
                        }
                    } else if (splitCommand[2].equals("show")) turn.showCity(teamIndex, playerIndex, cityIndex);
                    else if (splitCommand[3].equals("give")) {
                            if (splitCommand[5].equals("to") || splitCommand.equals("(to)"))
                                loadCityTaker(teamIndex, playerIndex, splitCommand, 6, splitCommand[4]);
                            else loadCityTaker(teamIndex, playerIndex, splitCommand, 5, splitCommand[4]);
                    }
                    break;
            }


        }
    }
 private void loadCityTaker( int teamIndex,int playerIndex, String[] splitCommand, int startingIndex, String source)
    {
        switch (splitCommand[startingIndex]) {
            case "hero": case "Hero": case "HERO":
                switch (source) {
                    case "gold": case  "Gold": case "GOLD":
                        Giving.giveGoldToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex + 1])), Cities.get(parseInt(splitCommand[1])), parseInt(splitCommand[startingIndex + 2]));
                        break;
                    case "wood": case "Wood": case "WOOD":
                        Giving.giveWoodToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex + 1])), Cities.get(parseInt(splitCommand[1])), parseInt(splitCommand[startingIndex + 2]));
                        break;
                    case "crystal": case "Crystal": case "CRYSTAL":
                        Giving.giveCrystalToHero(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex + 1])), Cities.get(parseInt(splitCommand[1])), parseInt(splitCommand[startingIndex + 2]));
                        break;
                }
                break;
            case "city": case "City": case "CITY":
                switch (source) {
                    case "gold": case  "Gold": case "GOLD":
                        Giving.giveGoldToCity(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex + 1])), Cities.get(parseInt(splitCommand[1])), parseInt(splitCommand[startingIndex + 2]));
                        break;
                    case "wood": case "Wood": case "WOOD":
                        Giving.giveWoodToCity(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex + 1])), Cities.get(parseInt(splitCommand[1])), parseInt(splitCommand[startingIndex + 2]));
                        break;
                    case "crystal": case "Crystal": case "CRYSTAL":
                        Giving.giveCrystalToCity(teams.get(teamIndex).players.get(playerIndex).heroes.get(parseInt(splitCommand[startingIndex + 1])), Cities.get(parseInt(splitCommand[1])), parseInt(splitCommand[startingIndex + 2]));
                        break;
                }
                break;
        }
    }
}