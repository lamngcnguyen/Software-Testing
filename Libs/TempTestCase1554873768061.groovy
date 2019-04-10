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


RunConfiguration.setExecutionSettingFile('C:\\Users\\lam\\AppData\\Local\\Temp\\Katalon\\20190410_122248\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://hoclieu.sachmem.vn/folder/0\')\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_ng nhp\'))\n\nWebUI.setText(findTestObject(\'Page_ng nhp  Sch Mm/input_a ch email_useremail\'), \'ngoclamc3pro@gmail.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_ng nhp  Sch Mm/input_Mt khu_userpassword\'), \'nCZ/Y8yCW8uj5B22lU0PKg==\')\n\nWebUI.click(findTestObject(\'Page_ng nhp  Sch Mm/input_Mt khu_userremember_me\'))\n\nWebUI.click(findTestObject(\'Page_ng nhp  Sch Mm/input_Qun mt khu_commit\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_Lp hc ca ti\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_test\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_S hc sinh vo lm bi 1_optionDropdown\'))\n\nWebUI.click(findTestObject(\'Page_Hc liu - Sch Mm/a_Thng k kt qu\'))\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n\'), \'static_answer\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n\'), \'percent\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n\'), \'static_answer\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n\'), \'percent\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n\'), \'static_answer\', \n    true)\n\nWebUI.selectOptionByValue(findTestObject(\'Page_Hc liu - Sch Mm/select_S phn trm lm ng            Thng k chn p n\'), \'percent\', \n    true)\n\n', FailureHandling.STOP_ON_FAILURE, true)

