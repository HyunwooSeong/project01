package d.util.practice;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalculateDate {

    private final long DAY_IN_MILLISECOND = 1000 * 60 * 60 * 24;

    public static void main(String[] args) {
        CalculateDate sample = new CalculateDate();
        sample.compareDates();
    }

    public String getCalendarString(Calendar calendar) {
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);

        String cal = year + "/" + month + "/" + date;
        return cal;
    }

    public void printDateGap(Calendar from, Calendar to) {

        long fromMillis = from.getTimeInMillis();
        long toMillis = to.getTimeInMillis();
        long gap = (toMillis - fromMillis) / DAY_IN_MILLISECOND;
        gap = Math.abs(gap);

        System.out.println("Day gap : " + getCalendarString(from) + " ~ " + getCalendarString(to) + " = " + gap);
    }

    public void compareDates() {
        Calendar from = new GregorianCalendar(2000, 0, 1);
        Calendar to = new GregorianCalendar(2000, 11, 31);

        printDateGap(from, to);
        printDateGap(to, from);

    }
}
