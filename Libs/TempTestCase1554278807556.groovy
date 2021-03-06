import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('/var/folders/94/ngf9nvc14vj_5g4c6tq459380000gn/T/Katalon/20190403_150647/execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://hoclieu.sachmem.vn/folder/0\')\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_ng nhp\'))\n\nWebUI.setText(findTestObject(\'Page_ng nhp  Sch Mm/input_a ch email_useremail\'), \'ngoclamc3pro@gmail.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_ng nhp  Sch Mm/input_Mt khu_userpassword\'), \'nCZ/Y8yCW8uj5B22lU0PKg==\')\n\nWebUI.click(findTestObject(\'Page_ng nhp  Sch Mm/input_Mt khu_userremember_me\'))\n\nWebUI.click(findTestObject(\'Page_ng nhp  Sch Mm/input_Qun mt khu_commit\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_Lp 4\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_Bi tp cui tun Ting Vit 4 - Tp 1\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/span_Giao bi tp\'))\n\nWebUI.setText(findTestObject(\'Page_Hc liu - Sch Mm/input_M t_form-control ng-untouched ng-valid ng-dirty\'), \'abcDEF123@~\\\\|=\')\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/span_test\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/input__btn btn-primary\'))\n\n', FailureHandling.STOP_ON_FAILURE, true)

