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

WebUI.navigateToUrl('https://eprocdev.kimiafarma.co.id')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Pendaftaran'))

WebUI.click(findTestObject('Tipe Perusahaan'))

WebUI.click(findTestObject('Setuju_1'))

WebUI.click(findTestObject('Setuju_2'))

WebUI.acceptAlert()

/**/
/*-------------------Data Login-------------------*/
/**/
WebUI.setText(findTestObject('Data Login -- Nama Pengguna'), 'Individu')

WebUI.setText(findTestObject('Data Login -- User ID'), 'Individu001')

WebUI.setEncryptedText(findTestObject('Data Login -- Password'), 'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.setEncryptedText(findTestObject('Data Login -- Retype Password'), 'TCdEHGtpZOAOScmyNwFgOw==')

WebUI.delay(3)

WebUI.click(findTestObject('Data Login -- Lanjut'))

WebUI.setText(findTestObject('General Info -- Person Name'), 'INDIVIDU')

WebUI.setText(findTestObject('General Info -- Initial Name'), 'IndiLokal')

WebUI.setText(findTestObject('General Info -- Address'), 'Jalan Jakarta 1')

WebUI.setText(findTestObject('General Info -- City'), 'JAKARTA')

WebUI.selectOptionByValue(findTestObject('General Info -- Province'), '11', false)

WebUI.setText(findTestObject('General Info -- Po Box'), '12345')

WebUI.setText(findTestObject('General Info -- Postal Code'), '12345')

WebUI.setText(findTestObject('General Info -- Identity Card Number'), '311212121212')

WebUI.setText(findTestObject('General Info -- Tax Number'), '123123123123')

WebUI.setText(findTestObject('General Info -- Phone'), '+628609090090')

WebUI.setText(findTestObject('General Info -- Fax'), '+62860898989')

WebUI.setText(findTestObject('General Info -- Owner Email'), 'Teguh@individu.com')

WebUI.setText(findTestObject('General Info -- Owner Mobile'), '+62812121212')

WebUI.setText(findTestObject('General Info -- Email Notification'), 'Teguh@individu.com')

WebUI.click(findTestObject('General Info -- Next'))

/**/
/*-------------------Data Bank-------------------*/
/**/
//WebUI.click(findTestObject('Data Bank -- Add Data Bank'))
WebUI.executeJavaScript('document.getElementById(\'btnBank\').click()', null)

WebUI.executeJavaScript('document.getElementById(\'vBankNm\').value = \'Mandiri\'', null)

WebUI.executeJavaScript('document.getElementById(\'vBankStateName\').value = \'Indonesia\'', null)

WebUI.setText(findTestObject('Data Bank -- Account Number'), '280909090')

WebUI.setText(findTestObject('Data Bank -- Name of Account Holder'), 'PT Lokal')

WebUI.selectOptionByValue(findTestObject('Data Bank -- Currency'), 'IDR', true)

WebUI.uploadFile(findTestObject('Data Bank -- Pilih File'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Bank -- Upload'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Bank -- Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Bank -- Next'))

/**/
/*-------------------Data Segmentation-------------------*/
/**/
WebUI.click(findTestObject('Segmentation -- Add Data Segmentation'))

//WebUI.executeJavaScript('document.getElementbyclass(\'submit radius2\').click()', null)
WebUI.selectOptionByLabel(findTestObject('Segmentation -- Business Line'), 'Trader', false)

WebUI.click(findTestObject('Data Segmentation -- Trader baru'))

//WebUI.delay(5)
WebUI.click(findTestObject('Segmentation -- Submit'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Segmentation -- Next'))

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

/**/
/*-------------------Data Experience-------------------*/
/**/
WebUI.click(findTestObject('Data Experience -- Add Data Customer'))

WebUI.setText(findTestObject('Data Experience -- Custumer -- Name'), 'PT Mitra Mandiri')

WebUI.setText(findTestObject('Data Experience -- Custumer -- Address'), 'Jalan Jakarta')

WebUI.selectOptionByValue(findTestObject('Data Experience -- Custumer -- Business Line'), '2', true)

WebUI.uploadFile(findTestObject('Data Experience -- Custumer -- Upload File'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Experience -- Custumer -- Tombol Upload'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Experience -- Custumer -- Next'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Experience -- Add Data Partner'))

WebUI.setText(findTestObject('Data Experience -- Partner -- Name'), 'PT GAI')

WebUI.setText(findTestObject('Data Experience -- Partner -- Address'), 'Jalan Jakarta Timur')

WebUI.selectOptionByValue(findTestObject('Data Experience -- Partner -- Business Line'), '2', true)

WebUI.uploadFile(findTestObject('Data Experience -- Partner -- Upload File'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Data Experience -- Partner -- Tombol Upload'))

WebUI.delay(3)

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Experience -- Partner -- Next'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Data Experience -- Setuju'))

WebUI.delay(7)

