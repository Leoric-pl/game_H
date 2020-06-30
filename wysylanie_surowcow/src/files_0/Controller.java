package files_0;

import java.util.Scanner;

import static files_0.Main.Cities;

public class Controller {
    void loadAll(int teamIndex, int playerIndex)
    {
        Turn turn=new Turn();
        Scanner textInput=new Scanner(System.in);
        int numberOfCommands=100;
        while(numberOfCommands>0){
            numberOfCommands--;String command=textInput.nextLine();
            if(command.equals("ba0")) turn.basicTurn0(teamIndex,playerIndex);
            else if(command.equals("ba1")) turn.basicTurn1(teamIndex, playerIndex);
            else if(command.startsWith("city ")){System.out.println("command0 found "+command);
                int cityIndex=command.charAt(5)-48;
                command=command.substring(7);
                if(command.startsWith("upgrade ")) {System.out.println("command1 found "+command);
                    command = command.substring(8);
                    if (command.startsWith("unit ")) { System.out.println("command2 found "+command);
                        command = command.substring(5);
                        switch (command) {
                            case "attack":
                                Cities.get(0).cityBattleUnit.incrementBasicAttack();
                                break;
                            case "defense":
                                Cities.get(0).cityBattleUnit.incrementBasicDefense();
                                break;
                            case "frequency":
                                Cities.get(0).cityBattleUnit.incrementAttackFrequency();
                                break;
                            case "hp":
                                Cities.get(0).cityBattleUnit.incrementHitPoints();
                                break;
                        }
                    } else if (command.equals("income")) Cities.get(0).increaseLevelOfCity();
                    else if (command.equals("defense")) Cities.get(0).increaseCityDefences();
                }
                else if(command.equals("show")) turn.showCity(teamIndex,playerIndex,cityIndex);}

        }
    }
}