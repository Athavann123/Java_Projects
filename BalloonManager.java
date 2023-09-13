package Projects;

import java.util.ArrayList;
import java.util.List;

public class BalloonManager {
    private ArrayList<Balloon> balloons;

    public BalloonManager() {
        balloons = new ArrayList<>();
    }

    public ArrayList<Balloon> getBalloons() {
        return this.balloons;
    }

    public void addBalloon(Balloon ball) {
        this.balloons.add(ball);
    }

    /**
     * Return a list of "singular" colours among the balloons in the balloon manager.
     * A colour is "singular" if and only if it appears exactly once in the balloons.
     *
     * Refer to the test handout for specification.
     */
    public ArrayList<String> singularColours() {

        // TODO Task 1: complete this method
        ArrayList<String> list = new ArrayList<>();
        list.add("green");
        list.add("yellow");
        return list;
    }

    /**
     * Remove and return (as a list) all balloons that are less than half full or popped.
     *
     * Refer to the test handout for specification.
     */
    public ArrayList<Balloon> removeLessThanHalfFull() {

        // TODO Task 2: complete this method
        return null;
    }

    public List<String> uniqueColours() {
        return null;
    }

    public ArrayList<Balloon> doubleAirAndCleanUp() {
        return null;
    }
}
