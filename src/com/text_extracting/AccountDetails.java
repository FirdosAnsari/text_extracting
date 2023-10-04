package com.text_extracting;

public class AccountDetails {
	private String payee_Name;
	private String nickName;
	private String credit_acc_no;
	private String remarks;
	private String debit_acc_no;
	private String date;
	private String amount;
	private String payment_type;
	private String pay;
	public String getPayee_Name() {
		return payee_Name;
	}
	public void setPayee_Name(String payee_Name) {
		this.payee_Name = payee_Name;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getCredit_acc_no() {
		return credit_acc_no;
	}
	public void setCredit_acc_no(String credit_acc_no) {
		this.credit_acc_no = credit_acc_no;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getDebit_acc_no() {
		return debit_acc_no;
	}
	public void setDebit_acc_no(String debit_acc_no) {
		this.debit_acc_no = debit_acc_no;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getPay() {
		return pay;
	}
	public void setPay(String pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "AccountDetails \nPayee Name : " + payee_Name + "\nNick Name : " + nickName +"\nCredit Account No : "
				+ credit_acc_no +"\nRemarks : " + remarks +"\nDebit Account : " + debit_acc_no + "\nDate : " + date
				+"\nAmount : " + amount + "\nPayment Type : " + payment_type + "\nPay : " + pay;
	}
	
}