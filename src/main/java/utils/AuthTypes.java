package utils;

public enum AuthTypes {
	
	TWITTER_OAUTH2_CLIENT_ID("tpIhd9W1Hf9wXdXAm2EOIVM8z"),
	TWITTER_OAUTH2_CLIENT_SECRET("hgJnG55as9oTZubmnrSbvhRJOVDhHkEkleZ8h2TuIdYmlTIsNS"),
	TWITTER_OAUTH2_ACCESS_TOKEN("1562659864316645377-eNF3jbSAVDWGEmRwLT8j9ufy7njIPV"),
	TWITTER_OAUTH2_REFRESH_TOKEN("zZLAPo7qMnYfLEJhQl397noKSRrUNCdPHwybnjYSDFrXw");
	
	private final String value;

	AuthTypes (String value) {
        this.value = value;
    }

    public String getValue () {
        return value;
    }
}