package ex_01_Java_Basics;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter browser name");
        String browser=s.next();
        browser=browser.trim().toLowerCase();
        if(browser.contains("google")){
            browser="chrome";
        }
        if(browser.contains("microsoft")) {
            browser="edge";
        }
        switch (browser){
            case "chrome":
                System.out.println("start chrome browser");
                break;
            case "firefox":
                System.out.println("start firefox browser");
                break;
            case "safari":
                System.out.println("start safari browser");
                break;
            case "edge":
                System.out.println("start edge");
                break;
            default:
                System.out.println("wrong browser name");
                break;
        }
    }
}
