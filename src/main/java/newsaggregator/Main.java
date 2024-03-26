package newsaggregator;

import callapi.CallNewsApi;
import callapi.CallTwitterApi;

public class Main {

    public static void main(String[] args) {
//        CallNewsApi newsapi = new CallNewsApi();
//        newsapi.call();
    	
    	CallTwitterApi twitterapi = new CallTwitterApi();
    	twitterapi.call(); // ERROR 
    }

}