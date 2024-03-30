package utils;

public enum AuthTypes {
	
	TWITTER_OAUTH2_API_KEY("8Kmzh6thXBsCMvEvQtOd1M1fA"),
	TWITTER_OAUTH2_API_KEY_SECRET("656VU7wiwWetRForzHZJcFuM1lOFbeX6BA3qV6BzcGYsHYcARb"),
	TWITTER_OAUTH2_ACCESS_TOKEN("1562659864316645377-QXBuJa2p7d7H14AoET87xeKnRBnNw2"),
	TWITTER_OAUTH2_ACCESS_TOKEN_SECRET("fI3uccRLPI4UDoz8hiuBhgFmc50GWFM12LkLK5SVpRm3S");
	
	private final String value;

	AuthTypes (String value) {
        this.value = value;
    }

    public String getValue () {
        return value;
    }
}