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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), email)

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'nCZ/Y8yCW8uj5B22lU0PKg==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userremember_me'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp hc ca ti'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_test'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_S hc sinh vo lm bi 3_optionDropdown'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Thng k kt qu_2'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n'), 
    'static_answer', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_A2'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_B0'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_C1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n'), 
    'percent', true)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_000'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_000'))

WebUI.closeBrowser()

