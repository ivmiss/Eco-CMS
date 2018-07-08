package dashboard;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.LoginPage;

public class TestDashboard {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
        loginPage = new LoginPage();
        dashboardPage = loginPage.logIn();
    }
    
    @AfterClass
    public static void tearDownClass() {
       
    }
    
    @Before
    public void setUp() {

    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAdmin() {
        dashboardPage.goToAdminLog();
    }
    
    @Test
    public void testEditProfile(){
        dashboardPage.goToAdminLog();
        dashboardPage.editProfile();
    }
    
    @Test
    public void testChangePasswoard(){
        dashboardPage.goToAdminLog();
        dashboardPage.changePassword();
    }

    @Test
    public void testLogOut(){
        dashboardPage.goToAdminLog();
        dashboardPage.logOut();
    }
   
}
