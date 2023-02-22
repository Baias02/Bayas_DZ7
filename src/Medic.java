public class Medic extends Hero{
    public int healing;
    public Medic(int healing){
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }

    public void setHealing(int healing) {
        this.healing = healing;
    }
    public String increaseExperience() {
        System.out.println("Boost healing : " + (healing * 0.1));
        setHealing((int) (getHealing() + healing * 0.1));

        return null;
    }

    @Override
    public void applySuperAbility() {
        System.out.println( "Medic применил суперспособность Treatment");
    }

}
