package json;

public class UserFields implements Pojo {

    public String title;
    public String body;
    public String userId;

    public UserFields(String title, String body, String userId) {
        this.title = title;
        this.body = body;
        this.userId = userId;
    }

}
