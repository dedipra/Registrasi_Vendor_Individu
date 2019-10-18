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

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/User ID'), 'operator_vm')

WebUI.setEncryptedText(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/Password'), 'iGDxf8hSRT4=')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE - PT Kereta Api Indonesia (Persero)/Login'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Halaman Utama - Manajemen Vendor'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Halaman Utama - Prakualifikasi'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Tambah'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Form Hasil PraKualifikasi - Cari'))

WebUI.delay(5)

WebUI.switchToWindowUrl('http://10.10.10.87:18989/kai-dev/findRekananForPraKualifikasi.promise?selectedField=vPraVFk&selectedField2=vPraVNm&selectedId=&selectedId2=')

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/New Windows - Cari'), 'sydney boehm')

not_run: WebUI.executeJavaScript('document.querySelectorAll("PT LOKALCOMPANY1234, PT [href="javascript:buildParent(\'42267\',\'PT LOKALCOMPANY1234, PT \')"]").click()', 
    [])

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/New Windows - Lokal company'))

not_run: WebUI.executeJavaScript('document.getElementById(\'("dyntable_filter")/label[1]/input[1]\').value = \'VENDOR TES INDIVIDU\'', 
    [])

not_run: WebUI.acceptAlert()

not_run: WebUI.setText(findTestObject(null), '')

not_run: WebUI.click(findTestObject(null))

not_run: WebUI.executeJavaScript('document.querySelector(\'input[type=text]\').value = \'VENDOR TES INDIVIDU\'', null)

//WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/PraKualifikasi - Search'), 'vendor tes individu')
not_run: WebUI.click(findTestObject('Operator_vm/Page_ProMISE/PraKualifikasi - Pilih'))

WebUI.switchToWindowUrl('http://10.10.10.87:18989/kai-dev/praKualifikasiAdd.promise')

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Keterangan'), 'Keterangan')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 1'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 2'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 3'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 4'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 5'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 6'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 7'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Ya 8'))

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Keterangan 1'), 'Keterangan 1')

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Keterangan 2'), 'Keterangan 2')

WebUI.uploadFile(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Pilih File 1'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Upload 1'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.uploadFile(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Pilih File Upload 2'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Upload 2'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.uploadFile(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Pilih File Upload 3'), 'C:\\Users\\Asus\\Documents\\coba.docx')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Upload 3'))

WebUI.delay(2)

WebUI.acceptAlert()

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Kirim'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Halaman Utama - Manajemen Vendor'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Daftar Calon Vendor'))

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Cari'), 'PT LOKAL COMPANY1234')

//error
not_run: WebUI.clickImage(findTestObject('Operator_vm/Page_ProMISE/Daftar Calon - Vendor Ceklist'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Daftar Clon - Vendor Ceklist 2'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Master Vendor - Perusahaan'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Vendor Ceklist - Dokumen Perusahaan/Vendor Ceklist - Bank'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Vendor Ceklist - Dokumen Perusahaan/Vendor Ceklist - Segmentasi'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Vendor Ceklist - Dokumen Perusahaan/Vendor Ceklist - Pengalaman'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Vendor Ceklist - Dokumen Perusahaan/Vendor Ceklist - Dokument Perusahaan'))

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK'), '1', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK 2'), '1', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK 3'), '1', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK 4'), '1', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK 5'), '1', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK 6'), '1', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Choose OneYATIDAK 7'), '1', false)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Checklist oleh admin'))

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Kategori'), '902', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Industri Type'), '2', false)

WebUI.selectOptionByValue(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Business Type'), '2', false)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Vendor Ceklist - Kirim'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Halaman Utama - Manajemen Vendor'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Daftar Calon Vendor'))

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/Prakualifikasi - Cari'), 'PT LOKAL COMPANY1234')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Daftar Calon Vendor - Approval by Operator 2'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan vendor - Data Login'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Vendor - Informasi Umum'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Vendor - Data Bank'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Data Segmentasi'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Data Dokumen'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Data Pengalaman'))

WebUI.delay(5)

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Approval'))

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Vendor Aktif'))

WebUI.setText(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Catatan'), 'Approval by Admin')

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Persetujuan Umum - Kirim'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Operator_vm/Page_ProMISE/Halaman Utama - Log Out'))

