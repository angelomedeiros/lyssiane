package br.org.cesar.test.suite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;

import br.org.cesar.common.Property;
import br.org.cesar.common.Selenium;
import br.org.cesar.test.FormularioSimplesPageValidation;
import br.org.cesar.test.HomePageValidation;
/**
 * Classe que agrupa todas as classes de teste, funcionando com uma su�te de regress�o.
 * @author jcan
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	HomePageValidation.class,
	FormularioSimplesPageValidation.class,
	})

public class AllTests {
protected static WebDriver driver;
	
	public static Boolean isAllTestsExecution = false;
	
	@BeforeClass
	public static void beforeClass() throws Exception {
		isAllTestsExecution = true;
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}

}
