package files_0;

public class Battle {
    Battle(Hero heroFirst, Hero heroSecond)
    {
        heroFirst.heroBattleUnit.currentHitPoints=heroFirst.heroBattleUnit.hitPoints;
        double sumOfFirstHitPoints=heroFirst.heroBattleUnit.hitPoints*(heroFirst.heroBattleUnit.getSizeOfUnit()-1)+heroFirst.heroBattleUnit.currentHitPoints;
        heroSecond.heroBattleUnit.currentHitPoints=heroSecond.heroBattleUnit.hitPoints;
        double sumOfSecondHitPoints=heroSecond.heroBattleUnit.hitPoints*(heroSecond.heroBattleUnit.getSizeOfUnit()-1)+heroSecond.heroBattleUnit.currentHitPoints;
        double heroFirstNextMove=1.0/heroFirst.heroBattleUnit.getAttackFrequency();
        double heroSecondNextMove=1.0/heroSecond.heroBattleUnit.getAttackFrequency();

        while(heroFirst.heroBattleUnit.getSizeOfUnit()>0&&heroSecond.heroBattleUnit.getSizeOfUnit()>0)
    {
        if(heroFirstNextMove<heroSecondNextMove)
        {double damage=heroFirst.heroBattleUnit.damageMultiplier()*heroFirst.heroBattleUnit.getSizeOfUnit();
        System.out.println("potencial damage: "+damage);
        damage=damage*heroSecond.heroBattleUnit.getDamageReduced();
        System.out.println("final damage: "+damage);
        sumOfSecondHitPoints=sumOfSecondHitPoints-damage;
        if(sumOfSecondHitPoints<0)sumOfSecondHitPoints=0;
        int alive=0;while(sumOfSecondHitPoints>heroSecond.heroBattleUnit.hitPoints){sumOfSecondHitPoints-=heroSecond.heroBattleUnit.hitPoints;alive++;}
        heroSecond.heroBattleUnit.currentHitPoints=sumOfSecondHitPoints;if(heroSecond.heroBattleUnit.currentHitPoints>0)alive++;
        heroSecond.heroBattleUnit.decrementSizeOfUnit(alive);
        heroFirstNextMove=heroFirstNextMove+1.0/heroFirst.heroBattleUnit.getAttackFrequency();
        }


        else {double damage=heroSecond.heroBattleUnit.damageMultiplier()*heroSecond.heroBattleUnit.getSizeOfUnit();
            System.out.println("potencial damage: "+damage);
            damage=damage*heroFirst.heroBattleUnit.getDamageReduced();
            System.out.println("final damage: "+damage);
            sumOfFirstHitPoints=sumOfFirstHitPoints-damage;
            if(sumOfFirstHitPoints<0)sumOfFirstHitPoints=0;
            int alive=0;while(sumOfFirstHitPoints>heroFirst.heroBattleUnit.hitPoints){sumOfFirstHitPoints-=heroSecond.heroBattleUnit.hitPoints;alive++;}
            heroFirst.heroBattleUnit.currentHitPoints=sumOfFirstHitPoints;if(heroFirst.heroBattleUnit.currentHitPoints>0)alive++;
            heroFirst.heroBattleUnit.decrementSizeOfUnit(alive);
            heroSecondNextMove=heroSecondNextMove+1.0/heroSecond.heroBattleUnit.getAttackFrequency();
        }
    }

    }


}
