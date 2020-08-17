package com.ru.alex.aasmc;

public class WebSiteRunner {
    public static void main(String[] args) {

        WebsiteTemplate welcome = new WelcomePage();
        WebsiteTemplate news = new NewsPage();

        welcome.showPage();
        System.out.println("========================================");
        news.showPage();
    }
}
