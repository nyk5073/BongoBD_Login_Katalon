import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://www.bongobd.com/bn')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/LandingPage/LoginButton'))

WebUI.click(findTestObject('Object Repository/LoginPage/button_Login with Phone'))

WebUI.switchToWindowTitle('BongoBD')

WebUI.setText(findTestObject('Object Repository/AccountKitPage/input_phone_number'), '1774044272')

WebUI.click(findTestObject('Object Repository/AccountKitPage/button_Use SMS'))

WebUI.waitForElementClickable(findTestObject('Object Repository/VerifyOTPScreen/button_Continue'), 60)

WebUI.click(findTestObject('Object Repository/VerifyOTPScreen/button_Continue'))

WebUI.switchToWindowUrl('https://www.bongobd.com/bn')

WebUI.click(findTestObject('Object Repository/LoggedInPage/SelfIconDropdown'))

WebUI.click(findTestObject('Object Repository/LoggedInPage/SignOutLink'))