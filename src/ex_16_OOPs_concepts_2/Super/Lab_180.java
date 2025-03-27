package ex_16_OOPs_concepts_2.Super;

public class Lab_180 {
    public static void main(String[] args) {
        TestCase1 t1=new TestCase1("chrome");
        t1.openBrowser();
        System.out.println("Testcase is running");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());

        TestCase1 t2=new TestCase1("Edge");
        System.out.println(t2.getBrowser());
    }


}

class BaseClass{

    private String browser;

    public BaseClass(String browser){
        this.browser=browser;
    }
    public String getBrowser(){
        return browser;
    }
    public void setBrowser(String browser,boolean isAdmin){
        if(isAdmin){
            this.browser=browser;
        }
        else{
            System.out.println("Change browser Not allowed, Not a Admin");
        }
    }

    void openBrowser(){
        System.out.println("Opening browser!!");
    }

    void openBrowser(String browsername){
        System.out.println(" Open Browser !! -> "+ browsername);
    }
    void closeBrowser(){
        System.out.println("Close Browser!!");
    }
}

class TestCase1 extends BaseClass{
    public TestCase1(String browser){
        super(browser);
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Overriding the parent Set Browser");
    }
}