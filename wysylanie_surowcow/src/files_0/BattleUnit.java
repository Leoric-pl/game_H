package files_0;

public class BattleUnit {
    final static double BASIC_MODIFIER=500/3;
    int sizeOfUnit=0;
    int basicAttack=1;
    int basicDefense=1;
    int attack=basicAttack;
    int defense=basicDefense;
    double attackFrequency=1.0;
    int damageReduction;
    int hitPoints=1;
    int cuttentHitPoints=hitPoints;

    double hireCostPerUnit=BASIC_MODIFIER;
    double countCostPerUnit()
    {hireCostPerUnit=BASIC_MODIFIER*getBasicDefense()*getBasicAttack()*hitPoints*getAttackFrequency();
    return hireCostPerUnit;}
    void setSizeOfUnit(){sizeOfUnit=1;}
    int getSizeOfUnit(){return  sizeOfUnit;}
    void incrementSizeOfUnit(){sizeOfUnit++;}
    int getBasicAttack(){return  basicAttack;}
    void incrementBasicAttack(){basicAttack++;}
    int getBasicDefense(){return  basicDefense;}
    void incrementBasicDefense(){basicDefense++;}
    double getAttackFrequency(){return  attackFrequency;}
    void incrementAttackFrequency(){attackFrequency+=0.1;}
}
