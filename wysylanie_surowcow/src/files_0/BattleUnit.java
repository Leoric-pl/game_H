package files_0;

public class BattleUnit {
    final static double BASIC_MODIFIER = 100;
    int sizeOfUnit = 0;
    int basicAttack = 0;
    int basicDefense = 0;
    int attack = basicAttack;
    int defense = basicDefense;
    double attackFrequency = 1.0;
    double damageReduced;
    double hitPoints = 1;
    double cuttentHitPoints = hitPoints;

    double hireCostPerUnit = BASIC_MODIFIER;

    double countCostPerUnit() {
        double modifier;
        if (getBasicAttack()+getBasicDefense()<2) modifier=(2+getBasicAttack()+getBasicDefense())*getHitPoints()*getAttackFrequency()/2;
        else modifier=
            hireCostPerUnit = BASIC_MODIFIER * modifier;
        return hireCostPerUnit;
    }

    /*************************************size of unit*********************************************************************/
    void setSizeOfUnit() {
        sizeOfUnit = 1;
    }

    int getSizeOfUnit() {
        return sizeOfUnit;
    }

    void incrementSizeOfUnit() {
        sizeOfUnit++;
    }

    /**********************************************attack******************************************************************/
    int getBasicAttack() {
        return basicAttack;
    }

    void incrementBasicAttack() {
        basicAttack++;
    }

    double damageMultiplier() {
        return 1.0 + 0.5 * attack;
    }

    void decreaseAttack(int modifier) {
        attack -= modifier;
    }

    /**********************************************defense*****************************************************************/
    int getBasicDefense() {
        return basicDefense;
    }

    void incrementBasicDefense() {
        basicDefense++;
    }

    void decreaseDefense(int modifier) {
        if (defense >= modifier) defense -= modifier;
        else defense = 0;
    }

    double getDamageReduced() {
        if (defense < 2) damageReduced = defense * 2 / 3;
        else damageReduced = 1 / defense;
        return damageReduced;
    }

    /*******************************************AttackFrequency************************************************************/
    double getAttackFrequency() {
        return attackFrequency;
    }

    void incrementAttackFrequency() {
        attackFrequency += 0.1;
    }
    /*********************************************hitPoints******************************************/
    double getHitPoints(){return hitPoints;}

}
