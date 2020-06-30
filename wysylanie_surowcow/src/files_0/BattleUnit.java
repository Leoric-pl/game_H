package files_0;

public class BattleUnit {
    final static double BASIC_MODIFIER = 100;
    static int basicChanger=1;
    static double frequencyChanger=0.125;//if cost makes problem, make it int=1
    int sizeOfUnit = 0;
    int basicAttack = 0;
    int basicDefense = 0;
    int attack = basicAttack;
    int defense = basicDefense;
    double attackFrequency = 1.0;//if cost is problem, change it to int=1
    double damageReduced;
    double hitPoints = 1;
    double currentHitPoints = hitPoints;

    double hireCostPerUnit = BASIC_MODIFIER;

    void setHireCostPerUnit() {
        double modifier;
        if (getBasicAttack()+getBasicDefense()<2) modifier=(2+getBasicAttack()+getBasicDefense())*getHitPoints()*getAttackFrequency()/2;
        else modifier=(getBasicAttack()+getBasicDefense())*getHitPoints()*getAttackFrequency();
            hireCostPerUnit = BASIC_MODIFIER * modifier;
            System.out.println("current cost: "+hireCostPerUnit);
       // return hireCostPerUnit;
    }
    double getHireCostPerUnit(){return hireCostPerUnit;}

    double valueOfUnit()
    {double valueOfUnit=getHireCostPerUnit()*getSizeOfUnit();
    return valueOfUnit;}
    double valueOfUpgradedUnit(String param)//avaliable: attack, defense, hitPoints,attackFrequency
    {double newCost;
        switch (param) {
            case "attack":
            case "defense": {
                double modifier;
                if (getBasicAttack() + getBasicDefense() < 1)
                    modifier = (3 + getBasicAttack() + getBasicDefense()) * getHitPoints() * getAttackFrequency() / 2;
                else
                    modifier = (getBasicAttack() + basicChanger + getBasicDefense()) * getHitPoints() * getAttackFrequency();
                newCost = BASIC_MODIFIER * modifier * getSizeOfUnit();
                break;
            }
            case "hitPoints": {
                double modifier;
                if (getBasicAttack() + getBasicDefense() < 2)
                    modifier = (2 + getBasicAttack() + getBasicDefense()) * (getHitPoints() + basicChanger) * getAttackFrequency() / 2;
                else
                    modifier = (getBasicAttack() + getBasicDefense()) * (getHitPoints() + basicChanger) * getAttackFrequency();
                newCost = BASIC_MODIFIER * modifier * getSizeOfUnit();
                break;
            }
            case "attackFrequency": {
                double modifier;
                if (getBasicAttack() + getBasicDefense() < 2)
                    modifier = (2 + getBasicAttack() + getBasicDefense()) * getHitPoints() * (getAttackFrequency() + frequencyChanger) / 2;
                else
                    modifier = (getBasicAttack() + getBasicDefense()) * getHitPoints() * (getAttackFrequency() + frequencyChanger);
                newCost = BASIC_MODIFIER * modifier * getSizeOfUnit();
                break;
            }
            default:
                return -1;
        }
        return newCost;

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
    void decrementSizeOfUnit(int alive){
        if(alive<sizeOfUnit&&alive>=0)
        sizeOfUnit=alive;}

    /**********************************************attack******************************************************************/
    int getBasicAttack() {
        return basicAttack;
    }

    void incrementBasicAttack() {
        basicAttack++;
    }
    void setAttack(){attack=basicAttack;}

    double damageMultiplier() { return 1.0 + (0.5 * attack);}

    void decreaseAttack(int modifier) {
        attack -= modifier;
    }

    /**********************************************defense*****************************************************************/
    int getBasicDefense() {
        return basicDefense;
    }
    void setDefense(){defense=basicDefense;}

    void incrementBasicDefense() {
        basicDefense++;
    }

    void decreaseDefense(int modifier) {
        if (defense >= modifier) defense -= modifier;
        else defense = 0;
    }

    double getDamageReduced() {
        if (defense < 2) damageReduced = 1.0-(defense / 3.0);
        else damageReduced = 1.0 / defense;
        return damageReduced;
    }

    /*******************************************AttackFrequency************************************************************/
    double getAttackFrequency() {
        return attackFrequency;
    }

    void incrementAttackFrequency() {
        attackFrequency+=frequencyChanger;//if any problems, change to attackFrequency++ with 2 other fixes

    }
    /*********************************************hitPoints******************************************/
    double getHitPoints(){return hitPoints;}

    void  incrementHitPoints(){hitPoints++;}

}
