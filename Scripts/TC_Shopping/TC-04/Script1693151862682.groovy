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

WebUI.callTestCase(findTestCase('TC_Shopping/TC-03'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Shopping cart/btn_CHECKOUT'), 0)

Mobile.setText(findTestObject('Checkout/inp_Your Name'), 'Lina', 0)

Mobile.setText(findTestObject('Checkout/inp_Your Email'), 'Lina@gmail.com', 0)

Mobile.setText(findTestObject('Checkout/inp_Phone Number'), '08123456789', 0)

Mobile.setText(findTestObject('Checkout/inp_Your Address'), 'Melati', 0)

Mobile.tap(findTestObject('Checkout/inp_TNT Express'), 0)

Mobile.selectListItemByLabel(findTestObject('Checkout/dropdown_UPS'), 'UPS', 0)

Mobile.tap(findTestObject('Checkout/btn_PROCESS CHECKOUT'), 0)

Mobile.tap(findTestObject('Checkout/btn_YES'), 0)

