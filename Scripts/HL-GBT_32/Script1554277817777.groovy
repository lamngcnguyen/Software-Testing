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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hoclieu.sachmem.vn/folder/0')

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_ng nhp'))

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'ngoclamc3pro@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'nCZ/Y8yCW8uj5B22lU0PKg==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userremember_me'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Lp 4'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 4 - Tp 1'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_Giao bi tp'))

WebUI.waitForElementVisible(findTestObject('Page_Hc liu - Sch Mm/input_M t_form-control ng-untouched ng-valid ng-dirty'), 
    3)

WebUI.setText(findTestObject('Page_Hc liu - Sch Mm/input_M t_form-control ng-untouched ng-valid ng-dirty'), 'abcDEF123@~\\|=')

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_Chn lp hc_ng-arrow-wrapper_1'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/span_test'))

WebUI.click(findTestObject('Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.closeBrowser()

