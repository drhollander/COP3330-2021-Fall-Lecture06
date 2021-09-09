package examples;

public class Person {
    // attributes
    int energyLevel;
    int focusLevel;
    int thirstLevel;
    int hungerLevel;

    // behaviors

    void sleep(Time currentTime, Duration sleepDuration) {
        // we don't want to allow sleep during working hours

        // if currentTime > 5pm and currentTime + sleepDuration < 8am
        //    rest(sleepDuration)
    }

    void rest(Duration sleepDuration) {
        // increase energy by 1 for every minute of sleepDuration
    }

    void exercise(ExerciseMethod exerciseMethod, Duration exerciseDuration) {
        exerciseMethod.exercise(exerciseDuration);

        /*
        if type(exerciseMethod) == Rowing.class {
            ((Rowing) exerciseMethod).exercise()
        } else if type(exerciseMethod) == Rowing.class {
            ((Rowing) exerciseMethod).exercise()
        }
         */
    }
    // void study(Duration studyDuration)
    // Waste eat(Food food)
    // Waste drink(Liquid liquid)
    // Tears cry()
    void die(boolean zombieInfected, boolean vampireInfected) {
        energyLevel = 0;
        focusLevel = 0;

        // zombies?
        if(zombieInfected) {
            hungerLevel = Integer.MAX_VALUE;
        } else if(vampireInfected) {
            // vampires?
            thirstLevel = Integer.MAX_VALUE;
        }
    }
}
