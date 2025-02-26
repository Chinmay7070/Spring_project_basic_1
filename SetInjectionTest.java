package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMsgenerator;

public class SetInjectionTest {
    public static void main(String[] args) {
    	
    	FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationcontext.xml");
        // Load Spring configuration file
       XmlBeanFactory factory = new XmlBeanFactory(res);
        // Get the bean
        WishMsgenerator gen = (WishMsgenerator) factory.getBean("wing");

        // Call method and print result
        String result = gen.generateWishMsg("raja");
        System.out.println("Result = " + result);
    }
}
