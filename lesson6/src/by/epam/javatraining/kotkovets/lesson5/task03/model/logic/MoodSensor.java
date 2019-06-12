package by.epam.javatraining.kotkovets.lesson5.task03.model.logic;

public class MoodSensor {

    private static final int GOOD_MOOD_SMILEY_NUMBER = 0;  // :’-)
    private static final int BAD_MOOD_SMILEY_NUMBER = 1;   // :’-(
    private static final int SURPRISE_MOOD_SMILEY_NUMBER = 2;  // *_*
    private static final int SAD_MOOD_SMILEY_NUMBER = 3;  // :-<
    private static final int CALM_MOOD_SMILEY_NUMBER = 4; // :-|

    private static final String GOOD_MOOD_SMILEY_ = ":’-)";
    private static final String BAD_MOOD_SMILEY = ":’-(";
    private static final String SURPRISE_MOOD_SMILEY = "*_*";
    private static final String SAD_MOOD_SMILEY = ":-<";
    private static final String CALM_MOOD_SMILEY = ":-|";
    private static final String ANXIOUS_MOOD_SMILEY = "*#*";


    private static String makeMood(int moodNumber) {

        String mood = ANXIOUS_MOOD_SMILEY;

        switch (moodNumber) {
            case GOOD_MOOD_SMILEY_NUMBER:
                mood = GOOD_MOOD_SMILEY_;
                break;
            case BAD_MOOD_SMILEY_NUMBER:
                mood = BAD_MOOD_SMILEY;
                break;
            case SURPRISE_MOOD_SMILEY_NUMBER:
                mood = SURPRISE_MOOD_SMILEY;
                break;
            case SAD_MOOD_SMILEY_NUMBER:
                mood = SAD_MOOD_SMILEY;
                break;
            case CALM_MOOD_SMILEY_NUMBER:
                mood = CALM_MOOD_SMILEY;
                break;
        }

        return mood;
    }

    public static String makeRandomMood() {
        int randMoodNumber = Random.makeRandomNumber();
        return makeMood(randMoodNumber);
    }

    public static String wrapMethod(int moodNumber){
        return makeMood(moodNumber);
    }

}
