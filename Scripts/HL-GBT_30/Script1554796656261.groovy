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

WebUI.setText(findTestObject('Page_ng nhp  Sch Mm/input_a ch email_useremail'), 'ngoclamc3pro@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userpassword'), 'nCZ/Y8yCW8uj5B22lU0PKg==')

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Mt khu_userremember_me'))

WebUI.click(findTestObject('Page_ng nhp  Sch Mm/input_Qun mt khu_commit'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Lp 4'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 4 - Tp 1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Giao bi tp'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Chn lp hc_ng-arrow-wrapper_1'), 
    3)

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_Chn lp hc_ng-arrow-wrapper_1'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/span_test'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '-60')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Thi gian lm bi phi ln hn 0'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control text-center bs-timepicker-field'), 
    '25')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control text-center bs-timepicker-field is-invalid'), 
    '25')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi bt u_form-control text-center bs-timepicker-field'), 
    '-1')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi bt u_form-control text-center bs-timepicker-field is-invalid'), 
    '-1')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Ngy gi bt u'))

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Trng ny khng c  trng'))

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Thi gian lm bi (pht)_form-control ng-untouched ng-valid ng-dirty'), 
    '-75.5')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi kt thc_form-control text-center bs-timepicker-field'), 
    '23')

WebUI.setText(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input_Ngy gi bt u_form-control text-center bs-timepicker-field'), 
    '10.5')

WebUI.click(findTestObject('Object Repository/Page_Hc liu - Sch Mm/input__btn btn-primary'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Hc liu - Sch Mm/div_Thi gian lm bi phi ln hn 0'))

WebUI.closeBrowser()

