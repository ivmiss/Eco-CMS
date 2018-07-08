
package indexSlider;

import framework.Configuration;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pages.DashboardPage;
import pages.IndexSliderPage;
import pages.LoginPage;

public class TestIndexSlider {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static IndexSliderPage indexSliderPage;
    
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
        indexSliderPage = dashboardPage.goToIndexSliderPage();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testEditFirstSliderWithNoLink(){
        indexSliderPage.editFirstSliderWithNoLink();
    }
    
    @Test
    public void testEditRandomSliderWithExternalLink(){
        indexSliderPage.editRandomSliderWithExternalLink();
    }

    @Test
    public void testEditLastSliderWithIntrnalLink(){
        indexSliderPage.editLastSliderWithInternalLink();
    }
    
    @Test
    public void testDisableLastSlider(){
        indexSliderPage.disableLastSlider();
    }
    
    @Test
    public void testDeleteLastSlider(){
        indexSliderPage.deleteLastSlider();
    }
    
    @Test
    public void testDeleteRandomSlider(){
        indexSliderPage.deleteRandomSlider();
    }
    
    @Test
    public void testSaveNewOrder(){
        indexSliderPage.saveNewOrder();
    }
    
    @Test
    public void testCancelNewOrder(){
        indexSliderPage.cancelNewOrder();
    }
}
