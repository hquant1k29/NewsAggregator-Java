package callapi;

import io.github.redouane59.twitter.TwitterClient;
import io.github.redouane59.twitter.dto.tweet.Tweet;
import io.github.redouane59.twitter.signature.TwitterCredentials;
import utils.AuthTypes;

public class CallTwitterApi {
  public void call() {
	  
	String API_KEY = AuthTypes.TWITTER_OAUTH2_API_KEY.getValue();
	String API_KEY_SECRET = AuthTypes.TWITTER_OAUTH2_API_KEY_SECRET.getValue();
	String ACCESS_TOKEN = AuthTypes.TWITTER_OAUTH2_ACCESS_TOKEN.getValue();
	String ACCESS_TOKEN_SECRET = AuthTypes.TWITTER_OAUTH2_ACCESS_TOKEN_SECRET.getValue();
	
//	System.out.println(API_KEY);
//	System.out.println(API_KEY_SECRET);
//	System.out.println(ACCESS_TOKEN);
//	System.out.println(ACCESS_TOKEN_SECRET);
	
	TwitterClient twitterClient = new TwitterClient(TwitterCredentials.builder()
            .accessToken(ACCESS_TOKEN)
            .accessTokenSecret(ACCESS_TOKEN_SECRET)
            .apiKey(API_KEY)
            .apiSecretKey(API_KEY_SECRET)
            .build());
	
	Tweet  tweet   = twitterClient.getTweet("1224041905333379073");
	System.out.println(tweet.getText());
	System.out.println(tweet.getCreatedAt());
	System.out.println(tweet.getLang());
	System.out.println(tweet.getLikeCount());
	System.out.println(tweet.getRetweetCount());
	System.out.println(tweet.getReplyCount());
	System.out.println(tweet.getUser().getName());
  }
}

