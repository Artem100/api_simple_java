package api;

import json.UserFields;

public class JsonFixtures {

    public static UserFields createNewUser(String title, String body, String userId){
        UserFields newUserFields = new UserFields ( title, body, userId);
        return  newUserFields;
    }
}
