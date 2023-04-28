package Home_Work.Dz8;

import Home_Work.Dz8.Task1.Cat;
import Home_Work.Dz8.Task1.Human;
import Home_Work.Dz8.Task1.Member;
import Home_Work.Dz8.Task1.Robot;
import Home_Work.Dz8.Task2.Obstacle;
import Home_Work.Dz8.Task2.RunningTrack;
import Home_Work.Dz8.Task2.Wall;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Member> members = new ArrayList<>();
        ArrayList<Obstacle> obstacles = new ArrayList<>();
        Collections.addAll(obstacles,
                new RunningTrack(7), new Wall(5),
                new Wall(5), new RunningTrack(4)
        );
        Collections.addAll(members,
                new Human(40, "Matvey"), new Cat(20, "Milo"),
                new Robot(55, "Alisa"), new Human(40, "Oleksandr")
        );

        while (true) {
            for (int i = 0; i < members.size(); i++) {
                for (Obstacle obstacle : obstacles) {
                    if (!members.get(i).overcome(obstacle)) {
                        if (members.size() == 1) {
                            members.remove(members.get(i));
                            System.out.println("Ran out of participants.");
                            System.exit(32);
                        } else {
                            members.remove(members.get(i));
                        }
                    }
                }
                System.out.println("=".repeat(25));
            }
        }

    }
}
