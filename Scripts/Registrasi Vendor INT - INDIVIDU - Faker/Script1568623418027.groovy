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
import com.github.javafaker.Faker as Faker

Faker faker = new Faker()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://10.10.10.87:18989/kai-dev/portal.promise')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Pendaftaran'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Pilih Tipe Perusahaan'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Pilih Setuju'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Agree'))

WebUI.acceptAlert()

//Data Login
Username = faker.name().username()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Username'), Username)

IdLogin = faker.name().username()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- ID Login'), IdLogin)

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Password'), 'Qwerty123')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Retype Password'), 'Qwerty123')

WebUI.delay(5)

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Next'))

//General Data
PersonName = faker.name().fullName()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Person Name'), PersonName)

NamaInisial = faker.name().firstName()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Intial Name'), NamaInisial)

Alamatke1 = faker.address().fullAddress()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Address'), Alamatke1)

Alamatcity = faker.address().city()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- City'), Alamatcity)

WebUI.selectOptionByValue(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Select Country'), '96', true)

WebUI.selectOptionByValue(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Select Province'), '11', true)

KodePoske1 = faker.address().zipCode()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Postal Code'), KodePoske1)

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Indentity Card Number'), '42342352354634')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Tax Registration Number'), '324235325324235')

phone = faker.phoneNumber().cellPhone()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Phone'), phone)

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Fax'), '2332532525')

Email_Pengguna = faker.internet().safeEmailAddress()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Owner Email'), Email_Pengguna)

No_Telp_Pengguna = faker.phoneNumber().cellPhone()

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Owner Mobile'), No_Telp_Pengguna)

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Email Notivication'), 'notifregistrasi@gmail.com')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Next'))

//Data Bank
WebUI.executeJavaScript('document.getElementById(\'btnBank\').click()', [])

WebUI.executeJavaScript('document.getElementById(\'vBankNm\').value = \'Mandiri\'', [])

WebUI.executeJavaScript('document.getElementById(\'vBankStateName\').value = \'Indonesia\'', [])

no_akun = faker.number().digits(10)

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Account Number'), no_akun)

WebUI.selectOptionByValue(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Currency'), 'IDR', true)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Pilih File'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Upload'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_ProMISE/Data Bank - Selanjutnya'))

//Data Segmentation
WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Add'))

WebUI.selectOptionByLabel(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Select Bussines Line'), 'Manufacturing', 
    false)

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Garment'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_ProMISE/Data Segmentasi - Selanjutnya'))

//Data Document
WebUI.executeJavaScript('document.getElementById(\'vDokNo1\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl1\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp1\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Pilih FIle 1'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Upload 1'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo2\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl2\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp2\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Pilih File 2'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Upload 2'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo4\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl4\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp4\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Pilih File 3'), 'C:\\Users\\Asus\\Documents\\coba.xlsx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Upload 3'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo5\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl5\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp5\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Pilih File 4'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Upload 4'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo6\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl6\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp6\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Pilih File 5'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Upload 5'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Document -- Next'))

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Ceklist Tanpa Pengalaman'))

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Ceklist Setuju'))

WebUI.setText(findTestObject('Page_ProMISE/Data Experience -- Isi Catch'), 'sadsac')

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Kirim'))

WebUI.acceptAlert()

WebUI.takeScreenshot('E:\\Data\\Katalon_Studio_Windows_64-6.3.3\\Screenshot\\Regist_International_individu_Success.png')

