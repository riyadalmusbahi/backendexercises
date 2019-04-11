public class NotNull implements Condition {

    @Override
    public Boolean isVerified(String password) {
        return !(password.equals(null)) && !password.equals("");
    }
}
