package com.salman

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import groovy.util.ObservableList.ElementAddedEvent

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.awt.Robot
import java.awt.Toolkit
import java.awt.datatransfer.StringSelection
import java.awt.event.KeyEvent
import org.openqa.selenium.WebElement as WebElement
import internal.GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.Point
import org.openqa.selenium.interactions.Actions
import java.util.concurrent.TimeUnit;
import java.util.*;
import static org.junit.Assert.*;
import org.openqa.selenium.support.ui.Select;

public class sample {	
	@Keyword
	def Clickonoptions(option,Month,Year) {
		//*[@id="ui-datepicker-div"]/div/div/select[1]/option[2]
		WebDriver driver = DriverFactory.getWebDriver()
		
		if(Month == true) {
			List<WebElement> rowelements = driver.findElements(By.xpath('//*[@id="ui-datepicker-div"]/div/div/select/option'))
			 WebElement tickoption = driver.findElement(By.xpath('//*[@id="ui-datepicker-div"]/div/div/select[1]/option['+option+']'))
			 tickoption.click()
		}
		else if(Year == true) {
			List<WebElement> rowelements = driver.findElements(By.xpath('//*[@id="ui-datepicker-div"]/div/div/select/option'))
			 WebElement tickoption = driver.findElement(By.xpath('//*[@id="ui-datepicker-div"]/div/div/select[2]/option['+option+']'))
			 tickoption.click()
		}
	}

	@Keyword
	def GetDropDownListValues2(Option) {
		WebDriver driver = DriverFactory.getWebDriver()
		String Fullxpath = '//*[@id="ui-datepicker-div"]/table/tbody/tr/td'
		List<WebElement> rowelements = driver.findElements(By.xpath(Fullxpath))
		System.out.println(rowelements.size())
		int rowsize = rowelements.size();

		Loop:
		for(int i=1;i<=rowsize;i++) {
			System.out.println(driver.findElement(By.xpath('//*[@id="ui-datepicker-div"]/table/tbody/tr/td')).getText())
			String optionval = driver.findElement(By.xpath('/html/body/div[11]/div/ul/li['+i+']')).getText()
			if(Option == optionval) {
				WebElement tickoption = driver.findElement(By.xpath('/html/body/div[11]/div/ul/li['+i+']'))
				tickoption.click()
				break Loop
			}
		}
	}

	@Keyword
	def SelectDate(Value) {
		WebDriver driver = DriverFactory.getWebDriver()
		String ExpectedValue = Value
		WebElement Table = driver.findElement(By.xpath("//table/tbody"))
		List < WebElement > rows_table = Table.findElements(By.tagName('tr'))
		int rows_count = rows_table.size()
		Loop:
		for (int row = 0; row < rows_count; row++) {
			List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName('td'))
			int columns_count = Columns_row.size()
			println((('Number of cells In Row ' + row) + ' are ') + columns_count)
			for (int column = 0; column < columns_count; column++) {
				String celltext = Columns_row.get(column).getText()
				println((((('Cell Value Of row number ' + row) + ' and column number ') + column) + ' Is ') + celltext)
				if (celltext == ExpectedValue) {
					println('Text present in row number 3 is: ' + Columns_row.get(2).getText())
					int row2 = row + 1
					int col2 = column + 1
					WebElement tickoption = driver.findElement(By.xpath('/html/body/div[6]/table/tbody/tr['+row2+']/td['+col2+']'))
					tickoption.click()
					
					break Loop;
				}
			}
			return rows_count;
		}
	}

}
