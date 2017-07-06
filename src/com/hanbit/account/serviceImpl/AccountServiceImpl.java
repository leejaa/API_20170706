package com.hanbit.account.serviceImpl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import com.hanbit.account.domain.AccountBean;
import com.hanbit.account.service.AccountService;

public class AccountServiceImpl implements AccountService{
	List<AccountBean> allAccount;
	List<AccountBean> someAccount;
	AccountBean account;
	public AccountServiceImpl() {
		allAccount=new ArrayList<>();
		someAccount=new ArrayList<>();
		account=new AccountBean();
	}
	@Override
	public void createAccount(AccountBean account) {
		allAccount.add(account);
	}

	@Override
	public List<AccountBean> AccountList() {
		return allAccount;
	}

	@Override
	public AccountBean findByAccount(String account) {
		this.account=new AccountBean();
		for(int i=0;i<allAccount.size();i++){
			if(account.equals(allAccount.get(i).getAccountNumber())){
				this.account=allAccount.get(i);
				break;
			}
		}
		return this.account;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		someAccount=new ArrayList<>();
		for(int i=0;i<allAccount.size();i++){
			if(name.equals(allAccount.get(i).getName())){
				someAccount.add(allAccount.get(i));
			}
		}
		return someAccount;
	}

	@Override
	public void updatePw(AccountBean account) {
		for(int i=0;i<allAccount.size();i++){
			if(account.getId().equals(allAccount.get(i).getId())){
				allAccount.get(i).setPw(account.getPw());
			}
		}
	}

	@Override
	public void deposit(String account,String deposit) {
		for(int i=0;i<allAccount.size();i++){
			if(account.equals(allAccount.get(i).getAccountNumber())){
				allAccount.get(i).setMoney(String.valueOf(Integer.parseInt(allAccount.get(i).getMoney())+Integer.parseInt(deposit)));
				break;
			}
		}
	}

	@Override
	public void withdraw(String account,String withdraw) {
		for(int i=0;i<allAccount.size();i++){
			if(account.equals(allAccount.get(i).getAccountNumber())){
				allAccount.get(i).setMoney(String.valueOf(Integer.parseInt(allAccount.get(i).getMoney())-Integer.parseInt(withdraw)));
				break;
			}
		}
	}

	@Override
	public void deleteAccount(String account) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String getTodayTime() {
		GregorianCalendar gc=new GregorianCalendar();
		SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String todayTime=format.format(gc.getTime());
		return todayTime;
	}

}
