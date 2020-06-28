package files_0;

public class Battle {
    Battle(Hero attacker, Hero defender)
    {
        setup(attacker, defender);
        double attackerNextMove=1.0/attacker.heroBattleUnit.getAttackFrequency();
        double defenderNextMove=1.0/defender.heroBattleUnit.getAttackFrequency();

        while(attacker.heroBattleUnit.getSizeOfUnit()>0&&defender.heroBattleUnit.getSizeOfUnit()>0)
    {
        double sumOfFirstHitPoints=attacker.heroBattleUnit.hitPoints*(attacker.heroBattleUnit.getSizeOfUnit()-1)+attacker.heroBattleUnit.currentHitPoints;
        double sumOfSecondHitPoints=defender.heroBattleUnit.hitPoints*(defender.heroBattleUnit.getSizeOfUnit()-1)+defender.heroBattleUnit.currentHitPoints;
        if(attackerNextMove<defenderNextMove)
        {
            System.out.println("attacker makes move");
            double damage=attacker.heroBattleUnit.damageMultiplier()*attacker.heroBattleUnit.getSizeOfUnit();
        System.out.println("potencial damage: "+damage);
        damage=damage*defender.heroBattleUnit.getDamageReduced();
        System.out.println("final damage: "+damage);
        sumOfSecondHitPoints=sumOfSecondHitPoints-damage;
        if(sumOfSecondHitPoints<0)sumOfSecondHitPoints=0;
        int alive=0;while(sumOfSecondHitPoints>defender.heroBattleUnit.hitPoints){sumOfSecondHitPoints-=defender.heroBattleUnit.hitPoints;alive++;}
        defender.heroBattleUnit.currentHitPoints=sumOfSecondHitPoints;if(defender.heroBattleUnit.currentHitPoints>0)alive++;

        defender.heroBattleUnit.decrementSizeOfUnit(alive);
            System.out.println("there are more units:"+alive);
        attackerNextMove=attackerNextMove+1.0/attacker.heroBattleUnit.getAttackFrequency();
        }
        else {
            System.out.println("defender makes move");
            double damage=defender.heroBattleUnit.damageMultiplier()*defender.heroBattleUnit.getSizeOfUnit();
            System.out.println("potencial damage: "+damage);
            damage=damage*attacker.heroBattleUnit.getDamageReduced();
            System.out.println("final damage: "+damage);
            sumOfFirstHitPoints=sumOfFirstHitPoints-damage;
            if(sumOfFirstHitPoints<0)sumOfFirstHitPoints=0;
            int alive=0;while(sumOfFirstHitPoints>attacker.heroBattleUnit.hitPoints){sumOfFirstHitPoints-=attacker.heroBattleUnit.hitPoints;alive++;}
            attacker.heroBattleUnit.currentHitPoints=sumOfFirstHitPoints;if(attacker.heroBattleUnit.currentHitPoints>0)alive++;
            attacker.heroBattleUnit.decrementSizeOfUnit(alive);
            System.out.println("there are more units:"+alive);
            defenderNextMove=defenderNextMove+1.0/defender.heroBattleUnit.getAttackFrequency();
        }
    }
        if(attacker.heroBattleUnit.getSizeOfUnit()>0)System.out.println("attacker won");
        else System.out.println("Defender won");
    }
private void setup(Hero attacker, Hero defender)
{
    System.out.println();
    System.out.println("fight!");
    System.out.println();
    attacker.heroBattleUnit.setAttack();
    attacker.heroBattleUnit.setDefense();
    defender.heroBattleUnit.setDefense();
    defender.heroBattleUnit.setAttack();
    attacker.heroBattleUnit.currentHitPoints=attacker.heroBattleUnit.hitPoints;
    defender.heroBattleUnit.currentHitPoints=defender.heroBattleUnit.hitPoints;
}

}
