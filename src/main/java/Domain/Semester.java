package Domain;

import java.util.Calendar;

public class Semester {
    private int semesterNumber;

    public Semester() {
        semesterNumber = getSemester();
    }

    public int getCurrentWeek() {
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        if (semesterNumber == 1) {
            return week - 40 + 1;
        } else {
            return week - 9 + 1;
        }
    }

    private int getSemester() {
        Calendar calendar = Calendar.getInstance();
        int week = calendar.get(Calendar.WEEK_OF_YEAR);
        if (week >= 40)
            return 1;
        return 2;
    }
}
