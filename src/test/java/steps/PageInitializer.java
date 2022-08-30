package steps;

import pages.*;

public class PageInitializer {
    // Creating static objects of the pages we're working on
    public static LoginPage login;


    public static void initializePageObjects() {
        login = new LoginPage();
    }

}
