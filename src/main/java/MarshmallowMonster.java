public class MarshmallowMonster {
    private int arms;
    private int eyes;
    private int buttons;
    private String name;
    private int legs;

public MarshmallowMonster(int arms, int eyes, int buttons, int legs, String name){
    this.arms = arms;
    this.eyes = eyes;
    this.buttons = buttons;
    this.name = name;
    this.legs = legs;
}
public int getArms(){
    return arms;
}
public int getEyes(){
    return eyes;
}
public int getButtons(){
    return buttons;
}
public String getName(){
    return name;
}
public int legs(){
    return legs;
}
public void setArms(int arms){
    this.arms = arms;
}
public void setEyes(int eyes){
    this.eyes = eyes;
}
public void setButtons(int buttons){
    this.buttons - buttons;
}
public void setName(String name){
    this.name = name;
}
public void setLegs(int legs){
    this.legs = legs;
}
public String toString() {
        return "MarshmallowMonster" +
               "name='" + name + '\'' +
               ", arms=" + arms +
               ", eyes=" + eyes +
               ", buttons=" + buttons + ", legs=" + legs
               ;
    }
    public static void main(String[] args) {
        MarshmallowMonster monster = new MarshmallowMonster(2, 3, 1, "Dominic", 4);
        System.out.println(monster.toString());
}
}