public class Main {
    public static void main(String[] args) {
        HavingSuperAbility heroes[] = { new Magic(),new Warrior(),new Medic(50)};
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
            if (heroes[i] instanceof Medic){
                System.out.println("Medic healed : " + ((Medic) heroes[i]).getHealing());
                ((Medic) heroes[i]).increaseExperience();
                System.out.println("Medic healed : " + ((Medic) heroes[i]).getHealing());
                ( (Medic) heroes[i]).increaseExperience();
                System.out.println("Medic healed : " + ((Medic) heroes[i]).getHealing());
            }
            }
        }
    }




    //дз на сообразительность

