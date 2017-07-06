package com.hanbit.account.service;

import java.util.List;

import com.hanbit.account.domain.AccountBean;

public interface AccountService {
	public void createAccount(AccountBean account);
	public List<AccountBean> AccountList();
	public AccountBean findByAccount(String account);
	public List<AccountBean> findByName(String name);
	public void updatePw(AccountBean account);
	public void deposit(String account,String deposit);
	public void withdraw(String account,String withdraw);
	public void deleteAccount(String account);
	public String getTodayTime();
}
