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

String Select_Year = 'Object Repository/Page_Malinko - Index Day/Select_Year'
String Select_month = 'Object Repository/Page_Malinko - Index Day/Select_month'
String Date = ''
String Open_calender = 'Object Repository/Page_Malinko - Index Day/Open_calender'

String Jan = '1'
String Feb = '2'
String Mar = '3'
String Apr = '4'
String May = '5'
String Jun = '6'
String Jul = '7'
String Aug = '8'
String Sep = '9'
String Oct = '10'
String Nov = '11'
String Dec = '12'

String _2012 = '1'
String _2013 = '2'
String _2014 = '3'
String _2015 = '4'
String _2016 = '5'
String _2017 = '6'
String _2018 = '7'
String _2019 = '8'
String _2020 = '9'
String _2021 = '10'
String _2022 = '11'
String _2023 = '12'
String _2024 = '13'
String _2025 = '14'
String _2026 = '15'
String _2027 = '16'
String _2028 = '17'
String _2029 = '18'
String _2030 = '19'
String _2031 = '20'

WebUI.click(findTestObject(Open_calender), FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()

WebUI.click(findTestObject(Select_month), FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()

CustomKeywords.'com.salman.sample.Clickonoptions'(Mar,true,false)

WebUI.click(findTestObject(Select_Year), FailureHandling.STOP_ON_FAILURE)
WebUI.enableSmartWait()
CustomKeywords.'com.salman.sample.Clickonoptions'(_2022,false,true)

WebUI.enableSmartWait()
CustomKeywords.'com.salman.sample.SelectDate'('3')

//CustomKeywords.'com.a.ClickbyText'('2023')

//WebUI.click(findTestObject(Select_Year), FailureHandling.STOP_ON_FAILURE)

//CustomKeywords.'com.a.GetDropDownListValues2'('2')
