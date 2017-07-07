package com.hanbit.account.domain;

public class AccountBean {
	String name,pw,id,regdate,ssn,accountNumber,money;
	static final String BANK="KB국민은행";
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
	public void setMoney(String deposit){
		this.money=deposit;
	}
	public String getMoney(){
		return money;
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
		return String.format("%s||%s||%s||%s||%s||%s||%s\n", BANK,name,id,money,ssn,accountNumber,regdate);
	}
}
