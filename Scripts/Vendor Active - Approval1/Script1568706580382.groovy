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

WebUI.click(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/Masuk'))

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/User ID'), 'approval1')

WebUI.setEncryptedText(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/Password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/Login'))

WebUI.click(findTestObject('Approval1/Page_Approval1/Halaman Utama - Manajemen Vendor'))

WebUI.click(findTestObject('Approval1/Page_ProMISE/Halaman Utama - Daftar Calon Vendor'))

WebUI.setText(findTestObject('Approval1/Page_ProMISE/Daftar Calon Vendor - Search'), 'sydney boehm')

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Daftar Calon Vendor - Approval1 Img'))

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Data Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Informasi Umum'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Data Bank'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Data Segmentasi'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Data Dokumen'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Data Ppengalaman'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Persetujuan Vendor - Approval'))

WebUI.delay(5)

WebUI.click(findTestObject('Approval1/Page_ProMISE/Approval - Status Vendor'))

WebUI.setText(findTestObject('Approval1/Page_ProMISE/Approval - Catatan'), 'Approval by Approval1')

WebUI.click(findTestObject('Approval1/Page_ProMISE/Approval - Kirim'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Approval1/Page_ProMISE/Halaman Utama - Log Out'))

