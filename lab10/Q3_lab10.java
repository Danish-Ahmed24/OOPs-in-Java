package lab10;
abstract class Character
{
    int health,attackPower;
    String name;
    public Character(String name,int health,int attackPower)
    {
        this.attackPower=attackPower;
        this.name=name;
        this.health=health;
    }
    abstract void specialAbility();
    public void attack(Character current,Character attack)
    {
        attack.health-=current.attackPower;
    }
    public void defend(Character current)
    {
        System.out.println("Defending boiz");
    }
}
class Warrior extends Character {
    public Warrior(String name,int health,int attackPower)
    {
        super(name,health,attackPower);
    }
    @Override
    void specialAbility() {
        this.attackPower*=2;
    }
}
class Mage extends Character {
    public Mage(String name,int health,int attackPower)
    {
        super(name,health,attackPower);
    }
    @Override
    void specialAbility() {
        this.attackPower+=20;
    }
}
class Archer extends Character {
    public Archer(String name,int health,int attackPower)
    {
        super(name,health,attackPower);
    }
    @Override
    void specialAbility() {
        this.attackPower+=15;
    }
}
class Game
{
    public static void main(String[] args) {
        Character archer = new Archer("Danish",100,20);
        Character warrior = new Warrior("Zeeshan",100,56);
        Character mage = new Mage("Omar",100,98);
        archer.attack(archer,warrior);
        warrior.defend(warrior);
        mage.specialAbility();
        archer.attack(mage,archer);
        System.out.println("archer health: "+archer.health);
        System.out.println("Warrior health: "+warrior.health);
        System.out.println("Mage health: "+mage.health);
    }
}

public class Q3_lab10 {
}
