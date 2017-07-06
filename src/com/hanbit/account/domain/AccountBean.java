package com.hanbit.account.domain;

public class AccountBean {
	String name,pw,id,regdate,ssn,accountNumber,deposit;
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPw(String pw){
		this.pw=pw;
	}
	public String getPw(){
		return pw;
	}
	public void setId(String id){
		this.id=id;
	}
	public String getId(){
		return id;
	}
	public void setDeposit(String deposit){
		this.deposit=deposit;
	}
	public String getDeposit(){
		return deposit;
	}
	public void setRegdate(String regdate){
		this.regdate=regdate;
	}
	public String getRegdate(){
		return regdate;
	}
	public void setSsn(String ssn){
		this.ssn=ssn;
	}
	public String getSsn(){
		return ssn;
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber=accountNumber;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public String toString(){
		return "";
	}
}
