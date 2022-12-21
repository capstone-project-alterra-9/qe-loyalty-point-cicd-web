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

WebUI.verifyElementPresent(findTestObject('Login/Login_Positive/validate_login'), 0)

WebUI.setText(findTestObject('Login/Login_Positive/email'), 'adminweb123@gmail.com')

WebUI.setText(findTestObject('Login/Login_Positive/password'), 'admin123')

WebUI.click(findTestObject('Login/Login_Positive/login.btn'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Log_Out/Page_Loyalty Point App/verify_admin'), 0)

WebUI.click(findTestObject('Object Repository/Product_Object/Menu_Product/Page_Loyalty Point App/product_button'))

WebUI.verifyElementText(findTestObject('Object Repository/Product_Object/Menu_Product/Page_Loyalty Point App/verify_product'), 
    'Product Stock')

WebUI.refresh()

WebUI.click(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/add_button'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/select_category'), 
    'credits', true)

WebUI.setText(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/input_product_name'), 
    'automation test 6')

WebUI.setText(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/input_description'), 
    'for automation test 6')

WebUI.setText(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/input_price'), 
    '-10000')

WebUI.setText(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/input_Stock_stock'), 
    '10')

WebUI.setText(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/input_image'), 
    '10')

WebUI.click(findTestObject('Object Repository/Product_Object/Product_Add_User_1/Page_Loyalty Point App/create_button'))

WebUI.delay(4)

WebUI.closeBrowser()

