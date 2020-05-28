public class LinkedIn implements SocialShare {
    private String message;

    @Override
    public void setMessage(String str) {
        this.message =str;

    }

    @Override
    public void share() {
        System.out.println("share to LinkedIn: "+this.message);

    }
}
