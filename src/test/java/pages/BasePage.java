package pages;

public class BasePage {

    protected void sleep(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException var4) {
            var4.printStackTrace();

        }

    }

}
