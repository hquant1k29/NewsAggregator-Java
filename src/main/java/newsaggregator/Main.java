package newsaggregator;

import callapi.CallNewsApi;
import callapi.CallTwitterApi;

import crawlers.FacebookCrawler;

public class Main {

    public static void main(String[] args) {
//        CallNewsApi newsapi = new CallNewsApi();
//    newsapi.call();
    	
//    	CallTwitterApi twitterapi = new CallTwitterApi();
//    	twitterapi.call(); // ERROR 
    	FacebookCrawler crawler = new FacebookCrawler();
    	crawler.run();
    }

}