import my.web.SpringWeb;

public class SpringWeblnitializer implements SpringWeb {
    @Override
    public void config() {
        System.out.println("你好，哈皮！");
    }
}
