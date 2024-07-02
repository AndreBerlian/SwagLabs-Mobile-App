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

String sUsername = 'bob@example.com'

String sPassword = '10203040'

Mobile.setText(findTestObject('Page_Login/input_Username'), sUsername, 0)

Mobile.setText(findTestObject('Page_Login/input_Password'), sPassword, 0)

Mobile.hideKeyboard()

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshotAsCheckpoint('Page Login (Filled)', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Page_Login/button_Login'), 0)

Mobile.waitForElementPresent(findTestObject('label_Products'), 0)

Mobile.takeScreenshotAsCheckpoint('Login Success', FailureHandling.STOP_ON_FAILURE)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

