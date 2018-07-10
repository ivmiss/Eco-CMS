/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoGalleries;

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
import pages.PhotoGalleriesPage;

public class TestPhotoGalleries {
    
    private static LoginPage loginPage;
    private static DashboardPage dashboardPage;
    private static PhotoGalleriesPage photoGalleriesPage;
    
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
        photoGalleriesPage = dashboardPage.goToPhotoGalleriesPage();
    }
    
    @After
    public void tearDown() {
    }

   
    @Test
    public void testEditPhotoFirst() {
        photoGalleriesPage.editFirstPhoto();
    }
    
    @Test
    public void testEditPhotoRandom(){
        photoGalleriesPage.editRandomPhoto();
    }
    
    @Test
    public void testEditPhotoLast(){
        photoGalleriesPage.editLastPhoto();
    }
}
