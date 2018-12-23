package my.web;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;


// 等同于web.xml文件
@HandlesTypes({SpringWeb.class})
public class MyWebConfig implements ServletContainerInitializer {
    @Override
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        System.out.println("hello wrold");

        for (Class<?> aclass : set) {
            SpringWeb o = null;
            try{
                o = (SpringWeb) aclass.newInstance();
                o.config();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }

    }
}
