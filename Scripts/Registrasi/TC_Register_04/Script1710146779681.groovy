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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vocagame.com/account/auth/register')

WebUI.setText(findTestObject('Object Repository/Register_04/Page_Daftar akun/input_Nama Belakang_lastName'), 'nani')

WebUI.setText(findTestObject('Object Repository/Register_04/Page_Daftar akun/input_Phone_phoneNumber'), '+62 825 125 615')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_04/Page_Daftar akun/input_Password_password'), 'dImXdCAhVcZ386mgV0Cwgw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register_04/Page_Daftar akun/input_Konfirmasi Password_confirmPassword'), 
    'dImXdCAhVcZ386mgV0Cwgw==')

WebUI.click(findTestObject('Object Repository/Register_04/Page_Daftar akun/button_Daftar Sekarang'))

