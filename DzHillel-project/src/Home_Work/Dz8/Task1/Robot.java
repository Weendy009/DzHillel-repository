package Home_Work.Dz8.Task1;

import Home_Work.Dz8.Task2.Obstacle;
import Home_Work.Dz8.Task2.RunningTrack;
import Home_Work.Dz8.Task2.Wall;

public class Robot extends Member {
    public Robot(int power, String name) {
        super(power, name);
    }

    @Override
    public void jump(int distance) {
        setPower(getPower() - distance);
        System.out.println("Robot: jumped " + distance + "m. power: " + getPower());
    }

    @Override
    public void run(int distance) {
        setPower(getPower() - distance);
        System.out.println("Robot: ran " + distance + "m. power: " + getPower());
    }

    @Override
    public boolean overcome(Obstacle obstacle) {
        if (obstacle instanceof Wall) {
            if (getPower() < ((Wall) obstacle).getHeight()) {
                System.out.println("Robot " + getName() + ": has little power left.");
                obstacle.undefeated();
                return false;
            } else {
                jump(((Wall) obstacle).getHeight());
                obstacle.defeated();
            }
        } else if (obstacle instanceof RunningTrack) {
            if (getPower() < ((RunningTrack) obstacle).getLength()) {
                System.out.println("Robot " + getName() + ": has little power left.");
                obstacle.undefeated();
                return false;
            } else {
                jump(((RunningTrack) obstacle).getLength());
                obstacle.defeated();
            }
        }
        return true;
    }
}
