package com.text_extracting;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class BankStatement {

	public static void main(String[] args) {
		AccountDetails accountDetails=new AccountDetails();
		try {
			PDDocument pddocument=PDDocument.load(new File("pdf/himanshi dec 21.pdf"));
			/*PDDocument pddocument=PDDocument.load(new File("pdf/milind dec 21.pdf"));*/
			PDFTextStripper pdfTextStripper=new PDFTextStripper();
			String pdfText=pdfTextStripper.getText(pddocument);
			String payee_Name=null;
			String nickName=null;
			String credit_acc_no=null;
			String remarks=null;
			String debit_acc_no=null;
			String date=null;
			String amount=null;
			String payment_type=null;
			String pay=null;
			String [] data=pdfText.split("\n");
		
			//System.out.println(data);
			payee_Name=data[8].replace("Payee Name:","");
			payee_Name = payee_Name.trim();
			
			nickName=data[9].replace("Nickname:","");
			nickName=nickName.trim();
			
			credit_acc_no=data[10].replace("Credit Account No:","");
			credit_acc_no=credit_acc_no.trim();
			
			remarks=data[11].replace("Remarks:","");
			remarks=remarks.trim();
			
			debit_acc_no=data[12].replace("Debit Account:","");
			debit_acc_no=debit_acc_no.trim();
			
			date=data[13].replace("Date:","");
			date=date.trim();
			
			amount=data[14].replace("Amount:","");
			amount=amount.trim();
			
			payment_type=data[15].replace("Payment Type:","");
			payment_type=payment_type.trim();
			
			pay=data[16].replace("Pay via:","");
			pay=pay.trim();	
			
			accountDetails.setPayee_Name(payee_Name);
			accountDetails.setPayee_Name(payee_Name);
			accountDetails.setNickName(nickName);
			accountDetails.setCredit_acc_no(credit_acc_no);
			accountDetails.setRemarks(remarks);
			accountDetails.setDebit_acc_no(debit_acc_no);
			accountDetails.setDate(date);
			accountDetails.setAmount(amount);
			accountDetails.setPayment_type(payment_type);
			accountDetails.setPay(pay);
			System.out.println(accountDetails);
			//System.out.println(accountDetails.getPayee_Name());
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
