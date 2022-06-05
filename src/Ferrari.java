public class Ferrari extends Car {
    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Ferrari", "Supercar", 4, 3, 4, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate){
        // rate = dif in speed from cur speed
        // automatic means x speed = y gear
        int newSpeed = getCurrentSpeed() + rate;
        if(newSpeed == 0){
            stop();
            changeGear(1);
        }else if (newSpeed >= 0 && newSpeed <= 10) {
            changeGear(1);
        }else if (newSpeed > 10 && newSpeed <= 20) {
            changeGear(2);    
        }else if (newSpeed > 20 && newSpeed <= 30) {
            changeGear(3);
        }else{
            changeGear(4);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
