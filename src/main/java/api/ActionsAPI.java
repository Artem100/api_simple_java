package api;

import io.restassured.response.ValidatableResponse;
import json.UserFields;


public class ActionsAPI {

    public static ValidatableResponse newUser (UserFields userFields){
        return HTTPRequestSender.post(UrlPath.postUser, userFields);
    }

}
