public class LongerThan8Charachters implements Condition {


    @Override
    public Boolean isVerified(String password) {
        Integer minimumLength = 8;
        return password.length() >= minimumLength;
    }

}

