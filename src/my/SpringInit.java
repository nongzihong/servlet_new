package my;

import my.web.SpringWeb;

public class SpringInit implements SpringWeb {
    @Override
    public void config() {
        System.out.println("大家好");
    }
}
