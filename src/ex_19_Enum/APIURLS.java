package ex_19_Enum;

enum APIURLS{
    katalon("https://katalon.com"),
    google("http://google.com");

    private String url;

    APIURLS(String url){
        this.url=url;
    }

    String getUrl(){
        return this.url;
    }
}

