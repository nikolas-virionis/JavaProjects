package secondsminutes;

public class SecondsMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(605300));
    }
    public static String getDurationString(long minute, long second) {
        if (minute < 0 || second < 0 || second >= 60) return "Invalid Value";
        long hour = minute / 60;
        minute %= 60;
        String hours = hour >= 0 && hour < 10 ? "0" + hour : "" + hour; 
        String minutes = minute >= 0 && minute < 10 ? "0" + minute : "" + minute; 
        String seconds = second >= 0 && second < 10 ? "0" + second : "" + second; 
        return hours + "h " + minutes + "m " + seconds + "s";
    }
    public static String getDurationString(long seconds) {
        if (seconds < 0) return "Invalid value";
        long minutes = seconds / 60;
        seconds %= 60;
        return getDurationString(minutes, seconds);
    }
}
