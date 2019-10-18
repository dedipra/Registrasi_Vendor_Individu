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

WebUI.navigateToUrl('http://10.10.10.87:18989/kai-dev/portal.promise')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Pendaftaran'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Pilih Tipe Perusahaan'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Pilih Setuju'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Agree'))

WebUI.acceptAlert()

//Data Login
WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Username'), 'IndividuInter')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- ID Login'), 'IndividuInter001')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Password'), 'Qwerty123')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Retype Password'), 'Qwerty123')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Login -- Next'))

//General Data
WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Person Name'), 'sdasderew')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Intial Name'), 'sadsderewds')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Address'), 'jakaratas 1')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- City'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Select Country'), '96', true)

WebUI.selectOptionByValue(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Select Province'), '11', true)

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Postal Code'), '21343')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Indentity Card Number'), '42342352354634')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Tax Registration Number'), '324235325324235')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Phone'), '3223532535')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Fax'), '2332532525')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Owner Email'), 'fewtwe@gmail.com')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Owner Mobile'), '124155435324')

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Email Notivication'), 'dedipra73@gmail.com')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/General Data -- Next'))

//Data Bank
WebUI.executeJavaScript('document.getElementById(\'btnBank\').click()', [])

WebUI.executeJavaScript('document.getElementById(\'vBankNm\').value = \'Mandiri\'', [])

WebUI.executeJavaScript('document.getElementById(\'vBankStateName\').value = \'Indonesia\'', [])

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Account Number'), '2134124124')

WebUI.selectOptionByValue(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Currency'), 'IDR', true)

WebUI.uploadFile(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Pilih File'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Upload'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Bank -- Submit'))

WebUI.acceptAlert()

//Data Segmentation
WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Add'))

WebUI.selectOptionByLabel(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Select Bussines Line'), 'Manufacturing', 
    false)

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Garment'))

WebUI.click(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Segmentation -- Submit'))

WebUI.acceptAlert()

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

WebUI.setText(findTestObject('INT - INDIVIDU/Page_ProMISE/Data Experience -- Catch'), 'safsafa')

WebUI.click(findTestObject('Page_ProMISE/Data Experience -- Kirim'))

WebUI.acceptAlert()

WebUI.takeScreenshot('E:\\Data\\Katalon_Studio_Windows_64-6.3.3\\Screenshot\\Regist_individu_Success.png')

