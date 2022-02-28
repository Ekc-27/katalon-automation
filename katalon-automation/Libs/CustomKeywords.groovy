
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import org.openqa.selenium.WebElement

import java.lang.String

import com.kms.katalon.core.model.FailureHandling

import java.util.List

import java.util.Map

import kms.turing.katalon.plugins.helper.table.WebTableHelper.CellTextOptions

import kms.turing.katalon.plugins.helper.XPathHelper.CompareOptions

import java.lang.Object

import com.kms.katalon.core.testobject.TestObject

import java.sql.Connection

import com.katalon.plugin.keyword.connection.DBType

import java.sql.ResultSet



def static "com.salman.sample.ClickbyText"(
    	Object text	) {
    (new com.salman.sample()).ClickbyText(
        	text)
}


def static "com.salman.sample.GetDropDownListValues2"(
    	Object Option	) {
    (new com.salman.sample()).GetDropDownListValues2(
        	Option)
}


def static "com.salman.sample.GetTableRows2"(
    	Object Value	) {
    (new com.salman.sample()).GetTableRows2(
        	Value)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.clickOnColumn"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).clickOnColumn(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.clickOnColumn"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).clickOnColumn(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByAttribute"(
    	WebElement table	
     , 	String attribute	
     , 	String value	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByAttribute(
        	table
         , 	attribute
         , 	value)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByAttribute"(
    	WebElement table	
     , 	String attribute	
     , 	String value	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByAttribute(
        	table
         , 	attribute
         , 	value
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders
         , 	timeout)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyTableByColumnHeaders"(
    	java.util.List<String> columnHeaders	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyTableByColumnHeaders(
        	columnHeaders
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getRowIndexByCellsInfo"(
    	WebElement table	
     , 	java.util.Map<String, Object> cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getRowIndexByCellsInfo(
        	table
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getRowIndexByCellsInfo"(
    	WebElement table	
     , 	java.util.Map<String, Object> cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getRowIndexByCellsInfo(
        	table
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByHeader(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getColumnIndexByHeader"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getColumnIndexByHeader(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByHeaderAndCellsInfo"(
    	WebElement table	
     , 	String columnHeader	
     , 	java.util.Map<String, Object> cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByHeaderAndCellsInfo(
        	table
         , 	columnHeader
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByHeaderAndCellsInfo"(
    	WebElement table	
     , 	String columnHeader	
     , 	java.util.Map<String, Object> cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByHeaderAndCellsInfo(
        	table
         , 	columnHeader
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	
     , 	CompareOptions compareOption	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption
         , 	compareOption)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	
     , 	CompareOptions compareOption	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption
         , 	compareOption
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyCellPresentWithText"(
    	WebElement table	
     , 	String columnHeader	
     , 	String text	
     , 	CellTextOptions textOption	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyCellPresentWithText(
        	table
         , 	columnHeader
         , 	text
         , 	textOption)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByValueAndColHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	String cellValue	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByValueAndColHeader(
        	table
         , 	columnHeader
         , 	cellValue
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByValueAndColHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	String cellValue	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByValueAndColHeader(
        	table
         , 	columnHeader
         , 	cellValue)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByIndexes"(
    	WebElement table	
     , 	int columnIndex	
     , 	int rowIndex	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByIndexes(
        	table
         , 	columnIndex
         , 	rowIndex
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.identifyCellByIndexes"(
    	WebElement table	
     , 	int columnIndex	
     , 	int rowIndex	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).identifyCellByIndexes(
        	table
         , 	columnIndex
         , 	rowIndex)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyRowDisplayed"(
    	WebElement table	
     , 	java.util.Map<String, Object> cellsInfo	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyRowDisplayed(
        	table
         , 	cellsInfo
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.verifyRowDisplayed"(
    	WebElement table	
     , 	java.util.Map<String, Object> cellsInfo	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).verifyRowDisplayed(
        	table
         , 	cellsInfo)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getCellsValueByColumnHeader"(
    	WebElement table	
     , 	String columnHeader	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getCellsValueByColumnHeader(
        	table
         , 	columnHeader)
}


def static "kms.turing.katalon.plugins.helper.table.HTMLTableHelper.getCellsValueByColumnHeader"(
    	WebElement table	
     , 	String columnHeader	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.helper.table.HTMLTableHelper()).getCellsValueByColumnHeader(
        	table
         , 	columnHeader
         , 	flowControl)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDayOfWeek"(
    	String date	
     , 	String dateFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDayOfWeek(
        	date
         , 	dateFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDuration"(
    	String startTime	
     , 	String endTime	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDuration(
        	startTime
         , 	endTime)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.addDays"(
    	String stringDate	
     , 	String dateFormat	
     , 	int amount	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).addDays(
        	stringDate
         , 	dateFormat
         , 	amount)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getDefaultTimeZone"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getDefaultTimeZone()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentMonth"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentMonth()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentYear"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentYear()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.formatStringDate"(
    	String value	
     , 	String currentFormat	
     , 	String newFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).formatStringDate(
        	value
         , 	currentFormat
         , 	newFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDate"() {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDate()
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureTime(
        	hrs
         , 	minute)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPastTime"(
    	int hrs	
     , 	int minute	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPastTime(
        	hrs
         , 	minute)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getPreviousDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getPreviousDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.convertString2Date"(
    	String value	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).convertString2Date(
        	value
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.setDefaultTimeZone"(
    	String timeZoneId	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).setDefaultTimeZone(
        	timeZoneId)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getCurrentDateTime"(
    	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getCurrentDateTime(
        	timeZoneId
         , 	dateTimeFormat)
}


def static "com.kms.katalon.keyword.datetime.DateTimeUtility.getFutureDateTime"(
    	int noOfDays	
     , 	String timeZoneId	
     , 	String dateTimeFormat	) {
    (new com.kms.katalon.keyword.datetime.DateTimeUtility()).getFutureDateTime(
        	noOfDays
         , 	timeZoneId
         , 	dateTimeFormat)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isTrue"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isTrue(
        	expression
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.BooleanAssert.isFalse"(
    	boolean expression	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.BooleanAssert()).isFalse(
        	expression
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.equals"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).equals(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isAfter"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isAfter(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.isBefore"(
    	String verifiedDate	
     , 	String compare2Date	
     , 	String format	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).isBefore(
        	verifiedDate
         , 	compare2Date
         , 	format
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.DateTimeAssert.matchesDateTimeFormat"(
    	String dateInString	
     , 	String datetimeFormat	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.DateTimeAssert()).matchesDateTimeFormat(
        	dateInString
         , 	datetimeFormat
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNull(
        	object
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.GenericAssert.isNotNull"(
    	Object object	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.GenericAssert()).isNotNull(
        	object
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.contains"(
    	java.util.List<Object> list	
     , 	java.util.List<Object> subList	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).contains(
        	list
         , 	subList
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsWithOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsWithOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.ListAssert.equalsIgnoreOrder"(
    	java.util.List<Object> actual	
     , 	java.util.List<Object> expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.ListAssert()).equalsIgnoreOrder(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.equals"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).equals(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isZero"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isZero(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isNegative"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isNegative(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.notEqual"(
    	Object actual	
     , 	Object expected	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).notEqual(
        	actual
         , 	expected
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThan"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThan(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.lessThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).lessThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.isPositive"(
    	Object value	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).isPositive(
        	value
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.NumberAssert.greaterThanOrEqual"(
    	Object x	
     , 	Object y	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.NumberAssert()).greaterThanOrEqual(
        	x
         , 	y
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.equals"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).equals(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.startsWith"(
    	String text	
     , 	String prefix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).startsWith(
        	text
         , 	prefix
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.endsWith"(
    	String text	
     , 	String suffix	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).endsWith(
        	text
         , 	suffix
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.matches"(
    	String text	
     , 	String pattern	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).matches(
        	text
         , 	pattern
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.contains"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).contains(
        	text
         , 	subText
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notEqual"(
    	String actual	
     , 	String expected	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notEqual(
        	actual
         , 	expected
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	boolean caseSensitive	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	caseSensitive
         , 	description)
}


def static "kms.turing.katalon.plugins.assertj.StringAssert.notContain"(
    	String text	
     , 	String subText	
     , 	String description	) {
    (new kms.turing.katalon.plugins.assertj.StringAssert()).notContain(
        	text
         , 	subText
         , 	description)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.areMatched"(
    	String expectedImgPath	
     , 	String actualImgPath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).areMatched(
        	expectedImgPath
         , 	actualImgPath
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.verifyMatchBaseline"(
    	String filename	
     , 	String baselinePath	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).verifyMatchBaseline(
        	filename
         , 	baselinePath)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual)
}


def static "kms.turing.katalon.plugins.visualtesting.ImageComparison.getDifferenceRatio"(
    	String expected	
     , 	String actual	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ImageComparison()).getDifferenceRatio(
        	expected
         , 	actual
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScreenshot(
        	filename
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeElementScreenshotIgnoringAreas"(
    	TestObject object	
     , 	String filename	
     , 	java.util.List<TestObject> ignoreObjs	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeElementScreenshotIgnoringAreas(
        	object
         , 	filename
         , 	ignoreObjs
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.baselineImage"(
    	String filename	
     , 	String baselineDir	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).baselineImage(
        	filename
         , 	baselineDir)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeScalingScreenshot"(
    	String filename	
     , 	float dpr	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeScalingScreenshot(
        	filename
         , 	dpr)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeEntirePageScreenshot"(
    	String filename	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeEntirePageScreenshot(
        	filename
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeCuttingScreenshot"(
    	String filename	
     , 	int headerToCut	
     , 	int footerToCut	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeCuttingScreenshot(
        	filename
         , 	headerToCut
         , 	footerToCut)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementScreenshot"(
    	TestObject object	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementScreenshot(
        	object
         , 	filename
         , 	timeout)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	
     , 	FailureHandling flowControl	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout
         , 	flowControl)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename)
}


def static "kms.turing.katalon.plugins.visualtesting.ScreenCapture.takeWebElementsScreenshot"(
    	java.util.List<TestObject> objects	
     , 	String filename	
     , 	int timeout	) {
    (new kms.turing.katalon.plugins.visualtesting.ScreenCapture()).takeWebElementsScreenshot(
        	objects
         , 	filename
         , 	timeout)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.execute"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).execute(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeQuery(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.executeUpdate"(
    	Connection conn	
     , 	String queryString	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).executeUpdate(
        	conn
         , 	queryString)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection"(
    	DBType type	
     , 	String server	
     , 	String port	
     , 	String dbName	
     , 	String userName	
     , 	String Password	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).createConnection(
        	type
         , 	server
         , 	port
         , 	dbName
         , 	userName
         , 	Password)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection"(
    	Connection conn	) {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).closeConnection(
        	conn)
}


def static "com.katalon.plugin.keyword.connection.DatabaseKeywords.getGlobalConnection"() {
    (new com.katalon.plugin.keyword.connection.DatabaseKeywords()).getGlobalConnection()
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getRowCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getRowCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getColumnCount"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getColumnCount(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).isEmptyResult(
        	rs)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV"(
    	ResultSet rs	
     , 	String pathFile	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).exportToCSV(
        	rs
         , 	pathFile)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListRowValue"(
    	ResultSet rs	
     , 	int fromRowIndex	
     , 	int toRowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListRowValue(
        	rs
         , 	fromRowIndex
         , 	toRowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getListCellValue"(
    	ResultSet rs	
     , 	int columnIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getListCellValue(
        	rs
         , 	columnIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	String columnName	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	columnName)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleCellValue"(
    	ResultSet rs	
     , 	int rowIndex	
     , 	int colIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleCellValue(
        	rs
         , 	rowIndex
         , 	colIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.getSingleRowValue"(
    	ResultSet rs	
     , 	int rowIndex	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).getSingleRowValue(
        	rs
         , 	rowIndex)
}


def static "com.katalon.plugin.keyword.connection.ResultSetKeywords.resultSetToArrayList"(
    	ResultSet rs	) {
    (new com.katalon.plugin.keyword.connection.ResultSetKeywords()).resultSetToArrayList(
        	rs)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingGlobalConnection"(
    	String fileName	
     , 	String query	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingGlobalConnection(
        	fileName
         , 	query)
}


def static "com.katalon.plugin.keyword.generator.DataFileKeywords.createUsingInternalConnection"(
    	String fileName	
     , 	String query	
     , 	String user	
     , 	String password	
     , 	DBType dbType	
     , 	String host	
     , 	String port	
     , 	String dbName	) {
    (new com.katalon.plugin.keyword.generator.DataFileKeywords()).createUsingInternalConnection(
        	fileName
         , 	query
         , 	user
         , 	password
         , 	dbType
         , 	host
         , 	port
         , 	dbName)
}


def static "com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword.setDate"(
    	TestObject to	
     , 	int day	
     , 	int month	
     , 	int year	
     , 	int slideTimeOut	
     , 	FailureHandling flowControl	) {
    (new com.katalon.plugin.keyword.calendar.SetDateCalendarKeyword()).setDate(
        	to
         , 	day
         , 	month
         , 	year
         , 	slideTimeOut
         , 	flowControl)
}
