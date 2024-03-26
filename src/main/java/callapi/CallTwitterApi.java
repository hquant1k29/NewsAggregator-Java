package callapi;


import java.util.HashSet;
import java.util.Set;
import com.twitter.clientlib.TwitterCredentialsOAuth2;
import com.twitter.clientlib.ApiException;
import com.twitter.clientlib.api.TwitterApi;
import com.twitter.clientlib.model.*;

import utils.AuthTypes;

public class CallTwitterApi {
  public void call() {
	  
	String CLIENT_ID = AuthTypes.TWITTER_OAUTH2_CLIENT_ID.getValue();
	String CLIENT_SECRET = AuthTypes.TWITTER_OAUTH2_CLIENT_SECRET.getValue();
	String ACCESS_TOKEN = AuthTypes.TWITTER_OAUTH2_ACCESS_TOKEN.getValue();
	String REFRESH_TOKEN = AuthTypes.TWITTER_OAUTH2_REFRESH_TOKEN.getValue();
	
    TwitterApi apiInstance = new TwitterApi(new TwitterCredentialsOAuth2(
          System.getenv(CLIENT_ID),
          System.getenv(CLIENT_SECRET),
          System.getenv(ACCESS_TOKEN),
          System.getenv(REFRESH_TOKEN))
    );

    Set<String> tweetFields = new HashSet<>();
    tweetFields.add("author_id");
    tweetFields.add("id");
    tweetFields.add("created_at");

    try {
     // findTweetById
     Get2TweetsIdResponse result = apiInstance.tweets().findTweetById("20")
       .tweetFields(tweetFields)
       .execute();
     if(result.getErrors() != null && result.getErrors().size() > 0) {
       System.out.println("Error:");

       result.getErrors().forEach(e -> {
         System.out.println(e.toString());
         if (e instanceof ResourceUnauthorizedProblem) {
           System.out.println(((ResourceUnauthorizedProblem) e).getTitle() + " " + ((ResourceUnauthorizedProblem) e).getDetail());
         }
       });
     } else {
       System.out.println("findTweetById - Tweet Text: " + result.toString());
     }
    } catch (ApiException e) {
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

