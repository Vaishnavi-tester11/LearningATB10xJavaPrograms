package ex_19_Enum;

enum Locators{
    page_button("#btn"),
    page_input("#input");

    private String locator;
    Locators(String locator){
        this.locator=locator;
    }

    String getLocator(){
        return  this.locator;
    }
}
