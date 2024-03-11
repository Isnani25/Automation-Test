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

WebUI.navigateToUrl('https://vocagame.com/')

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_VocaGame - Top up Game dan Reseller Vo_e9d16b/button_Masuk'))

WebUI.setText(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Masuk Akun/input_Phone_phoneNumber'), '+62 822 515 453 35')

WebUI.setEncryptedText(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Masuk Akun/input_Password_password'), 
    'vPQjI3CfZXw=')

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Masuk Akun/button_Masuk Sekarang'))

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Masuk Akun/p_Wrong password. Verify and try again'))

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Masuk Akun/a_Lupa Password'))

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Reset Password/h2_Reset Password'))

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Reset Password/p_Masukan nomor WhatsApp untuk verifikasi OTP'))

WebUI.setText(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Reset Password/input_Phone_phoneNumber'), '+62 822 515 453 35')

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_Reset Password/button_Kirim Kode OTP'))

WebUI.setText(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_OTP Verifikasi/input_Reset Password_my-10 block h-14 w-ful_53d72f'), 
    '2')

WebUI.click(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_OTP Verifikasi/button_Konfirmasi Kode OTP'))

WebUI.verifyElementText(findTestObject('Object Repository/Forgot_Pass_Fail_No_OTP/Page_OTP Verifikasi/p_The OTP must be at least 6 characters lon_5abd50'), 
    '')

