package PraktikumPemrogramanLanjut3;

class Hero{
    private String Name;
    private double HP;
    private double Attack;
    private double Defence;

    Hero(String Name, double HP, double Attack, double Defence){
        this.Name = Name;
        this.HP = HP;
        this.Attack = Attack;
        this.Defence = Defence;
    }

    void Attack(Hero Opponent){
        double AttackPower = this.Attack;
        System.out.println( this.Name + " attacking " + Opponent.Name + " with power " + AttackPower);
        Opponent.Defence(AttackPower);
    }
    void Defence(double AttackPower){
        double Damage;
        if(this.Defence < AttackPower){
            Damage = AttackPower - this.Defence;
        } else{
            Damage = 0;
        }
        this.HP -= Damage;
        System.out.println(this.Name + " gets damage " + Damage);
    }


    Hero(){

    }

    public void setName(String Name){
        this.Name = Name;
    }

    public void setHP(double HP) {
        this.HP = HP;
    }

    public void setAttack(double attack) {
        Attack = attack;
    }

    public void setDefence(double defence) {
        Defence = defence;
    }

    public double getAttack() {
        return Attack;
    }

    public double getHP() {
        return HP;
    }

    public String getName() {
        return Name;
    }

    public double getDefence() {
        return Defence;
    }

    void display(){
        System.out.println("\nHero Name\t\t\t: " + this.Name);
        System.out.println("Hero Health Point\t: " + this.HP);
        System.out.println("Hero Attack Power\t: " + this.Attack);
        System.out.println("Hero Defence Power\t: " + this.Defence);
    }
}

