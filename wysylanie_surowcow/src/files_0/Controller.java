package files_0;

import java.util.Scanner;

import static files_0.Main.Cities;
import static files_0.Main.teams;
import static java.lang.Integer.parseInt;

class Controller {
   private boolean endTurn=false;
    void loadAll(int teamIndex, int playerIndex)
    {
        Turn turn=new Turn();
        Scanner textInput=new Scanner(System.in);
        int numberOfCommands=100;
        System.out.println("turn of team "+teamIndex+" player "+playerIndex);
        while(numberOfCommands>0&&!endTurn){
            int cityIndex=0;
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
                    if(splitCommand[1] != null) {

                        cityIndex = parseInt(splitCommand[1]);

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
                                    default:System.out.println("command not recognised, try 'attack', 'defense', 'frequency' or 'hp'");
                                }
                                break;
                            case "income":
                                Cities.get(cityIndex).increaseLevelOfCity();
                                break;
                            case "defense":
                                Cities.get(cityIndex).increaseCityDefences();
                                break;
                            default:System.out.println("command not recognised, try 'unit', 'income' or 'defense'");
                        }
                    }} else if (splitCommand[2].equals("show")) turn.showCity(teamIndex, playerIndex, cityIndex);
                    else if (splitCommand[3].equals("give")) {
                            if (splitCommand[5].equals("to") || splitCommand[5].equals("(to)"))
                                loadCityTaker(teamIndex, playerIndex, splitCommand, 6, splitCommand[4]);
                            else loadCityTaker(teamIndex, playerIndex, splitCommand, 5, splitCommand[4]);
                    }
                    break;
                case "turn":
                    if(splitCommand[1].equals("finish")||splitCommand[1].equals("end")||splitCommand[1].equals("Finish")||splitCommand[1].equals("End")) endTurn();
                    else if(splitCommand[1].equals("save")) saveGame();//to do
                    else System.out.println("try finish 'turn' with 'save 'or 'end'");
                default:System.out.println("command not recognised, try begin with 'city', 'hero' or 'turn' in case what you want move");
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
                    case "source": System.out.println("haha, very funny");
                    default: System.out.println("add source: 'gold', 'wood' or 'crystal' ");
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
                    case "source": System.out.println("haha, very funny");
                    default: System.out.println("add source: 'gold', 'wood' or 'crystal' ");
                }
                break;
            default: System.out.println("try do it with 'city' or 'hero'");
        }
    }
private     void endTurn()
    {endTurn=true;}
private     void saveGame(){
        System.out.println("part to bulid");
    }
}