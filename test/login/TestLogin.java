
package login;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.LoginPage;

public class TestLogin {
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        Configuration.init();
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp(){
 
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testLogin() {
    
        LoginPage loginPage = new LoginPage();
        loginPage.logIn();
    }
}
