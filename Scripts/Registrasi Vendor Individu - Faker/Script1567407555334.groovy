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

WebUI.openBrowser('Chrome')

WebUI.navigateToUrl('http://10.10.10.87:18989/kai-dev/portal.promise')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Pendaftaran'))

WebUI.click(findTestObject('Tipe Perusahaan'))

WebUI.click(findTestObject('Setuju_1'))

WebUI.click(findTestObject('Setuju_2'))

WebUI.acceptAlert()

/**/
/*-------------------Data Login-------------------*/
/**/
NamaPengguna = faker.name().username()

WebUI.setText(findTestObject('Data Login -- Nama Pengguna'), NamaPengguna)

UserId = faker.name().username()

WebUI.setText(findTestObject('Data Login -- User ID'), UserId)

WebUI.setEncryptedText(findTestObject('Data Login -- Password'), 'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.setEncryptedText(findTestObject('Data Login -- Retype Password'), 'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.delay(3)

WebUI.click(findTestObject('Data Login -- Lanjut'))

/**/
/*-------------------General Informasi-------------------*/
/**/
NamaPerusahaan = faker.name().fullName()

WebUI.setText(findTestObject('General Info -- Person Name'), NamaPerusahaan)

NamaInisial = faker.name().firstName()

WebUI.setText(findTestObject('General Info -- Initial Name'), NamaInisial)

Alamatke1 = faker.address().fullAddress()

WebUI.setText(findTestObject('General Info -- Address'), Alamatke1)

Alamatcity = faker.address().city()

WebUI.setText(findTestObject('General Info -- City'), Alamatcity)

WebUI.selectOptionByValue(findTestObject('General Info -- Province'), '11', false)

PoBoxke1 = faker.address().zipCode()

WebUI.setText(findTestObject('General Info -- Po Box'), PoBoxke1)

KodePoske1 = faker.address().zipCode()

WebUI.setText(findTestObject('General Info -- Postal Code'), KodePoske1)

WebUI.setText(findTestObject('General Info -- Identity Card Number'), '311212121212')

WebUI.setText(findTestObject('General Info -- Tax Number'), '123123123123')

No_Telp_Pengguna = faker.phoneNumber().cellPhone()

WebUI.setText(findTestObject('General Info -- Phone'), No_Telp_Pengguna)

WebUI.setText(findTestObject('General Info -- Fax'), '+62860898989')

Email_Pengguna = faker.internet().safeEmailAddress()

WebUI.setText(findTestObject('General Info -- Owner Email'), Email_Pengguna)

No_Telp_Pengguna2 = faker.phoneNumber().cellPhone()

WebUI.setText(findTestObject('General Info -- Owner Mobile'), No_Telp_Pengguna2)

WebUI.setText(findTestObject('General Info -- Email Notification'), 'notifregistrasi@gmail.com')

WebUI.click(findTestObject('General Info -- Next'))

/**/
/*-------------------Data Bank-------------------*/
/**/
WebUI.executeJavaScript('document.getElementById(\'btnBank\').click()', [])

WebUI.executeJavaScript('document.getElementById(\'vBankNm\').value = \'Mandiri\'', null)

WebUI.executeJavaScript('document.getElementById(\'vBankStateName\').value = \'Indonesia\'', null)

no_akun = faker.number().digits(10)

WebUI.setText(findTestObject('Data Bank -- Account Number'), no_akun)

WebUI.selectOptionByValue(findTestObject('Data Bank -- Currency'), 'IDR', true)

WebUI.uploadFile(findTestObject('Data Bank -- Pilih File'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Bank -- Upload'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Bank -- Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_ProMISE/Data Bank - Selanjutnya'))

/**/
/*-------------------Data Segmentation-------------------*/
/**/
WebUI.click(findTestObject('Segmentation -- Add Data Segmentation'))

WebUI.selectOptionByLabel(findTestObject('Segmentation -- Business Line'), 'Trader', false)

WebUI.click(findTestObject('Data Segmentation -- Trader baru'))

WebUI.click(findTestObject('Segmentation -- Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Page_ProMISE/Data Segmentasi - Selanjutnya'))

/**/
/*-------------------Data Document-------------------*/
/**/
WebUI.executeJavaScript('document.getElementById(\'vDokNo0\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl0\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp0\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('Data Document -- Upload_1'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Document -- Tombol Upload 1'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo1\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl1\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp1\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('Data Document -- Upload_2'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Document -- Tombol Upload 2'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo2\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl2\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp2\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('Data Document -- Upload_3'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Document -- Tombol Upload 3'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.executeJavaScript('document.getElementById(\'vDokNo3\').value = "Letter"', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTgl3\').value = \'12/10/2018\'', null)

WebUI.executeJavaScript('document.getElementById(\'vDokTglExp3\').value = \'12/10/2020\'', null)

WebUI.uploadFile(findTestObject('Data Document -- Upload_4'), 'C:\\Users\\Asus\\Documents\\coba.xlsx')

WebUI.click(findTestObject('Data Document -- Tombol Upload 4'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Document -- Next'))

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Ceklist Tanpa Pengalaman'))

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Ceklist Setuju'))

WebUI.setText(findTestObject('Page_ProMISE/Data Experience -- Isi Catch'), 'sadsac')

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Kirim'))

WebUI.acceptAlert()

WebUI.takeScreenshot('E:\\Data\\Katalon_Studio_Windows_64-6.3.3\\Screenshot\\Regist_individu_Success.png')

