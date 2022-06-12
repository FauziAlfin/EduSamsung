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

Mobile.startApplication('C:\\Users\\user pc\\Katalon Studio\\ShopSamsung\\SamsungApp\\Shop Samsung_v1.0.29030.apk', true)

Mobile.swipe(1000, 0, 0, 0)

Mobile.swipe(1000, 0, 0, 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Shop Samsung/TextView - SHOP'), 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/RelativeLayout - Phones'), 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/ImageView - Galaxy Note'), 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/TextView - Galaxy Note10 Certified Re-Newed'), 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/TextView - Galaxy Note10'), 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/TextView - Search Icon'), 0)

Mobile.setText(findTestObject('Shop Samsung/android.widget.EditText - Search'), 'Galaxy S22', 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/TextView - Galaxy S22 Ultra, 256GB (US Cellular)'), 0)

Mobile.tap(findTestObject('Object Repository/Shop Samsung/TextView - BUY NOW'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()

