import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-loyalty-point-admin-dashboard.vercel.app/login')

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Negative/email'), '')

WebUI.setText(findTestObject('Login/Login_Negative/password'), '')

WebUI.click(findTestObject('Login/Login_Negative/login.btn'))

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login_negative'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-loyalty-point-admin-dashboard.vercel.app/login')

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Negative/email'), 'adminweb@gmail.com')

WebUI.setText(findTestObject('Login/Login_Negative/password'), '')

WebUI.click(findTestObject('Login/Login_Negative/login.btn'))

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login_negative'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-loyalty-point-admin-dashboard.vercel.app/login')

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Negative/email'), '')

WebUI.setText(findTestObject('Login/Login_Negative/password'), 'admin567')

WebUI.click(findTestObject('Login/Login_Negative/login.btn'))

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login_negative'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-loyalty-point-admin-dashboard.vercel.app/login')

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Negative/email'), 'adminweb@gmail.com')

WebUI.setText(findTestObject('Login/Login_Negative/password'), 'admin')

WebUI.click(findTestObject('Login/Login_Negative/login.btn'))

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login_negative'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-loyalty-point-admin-dashboard.vercel.app/login')

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Negative/email'), 'admin')

WebUI.setText(findTestObject('Login/Login_Negative/password'), 'admin567')

WebUI.click(findTestObject('Login/Login_Negative/login.btn'))

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login_negative'), 0)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://fe-loyalty-point-admin-dashboard.vercel.app/login')

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Negative/email'), 'admin')

WebUI.setText(findTestObject('Login/Login_Negative/password'), 'admin')

WebUI.click(findTestObject('Login/Login_Negative/login.btn'))

WebUI.verifyElementPresent(findTestObject('Login/Login_Negative/validate_login_negative'), 0)

WebUI.closeBrowser()

