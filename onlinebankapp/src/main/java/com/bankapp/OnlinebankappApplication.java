package com.bankapp;

import java.time.LocalDate;
import java.time.Month;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bankapp.entities.Employee;
import com.bankapp.service.AccountService;
import com.bankapp.service.EmployeeService;

@SpringBootApplication
public class OnlinebankappApplication implements CommandLineRunner{

	@Autowired
	private AccountService accountService;
	
	
	  @Autowired
	  private EmployeeService employeeService;
	 

	public static void main(String[] args) {
		SpringApplication.run(OnlinebankappApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		  
		/*
		 * Account account1 = new Account(6000.0, "SAVING", "Ram", "Hyd", "123456789",
		 * "ram@gmail.com", "ram123", LocalDate.of(1983, Month.SEPTEMBER, 10)); Account
		 * account2 = new Account(5000.0, "SAVING", "sanju", "Srikakulam", "123456897",
		 * "sanju@gmail.com", "sanju123", LocalDate.of(1998, Month.JANUARY, 25));
		 * 
		 * accountService.addAccount(account1);
		 *  accountService.addAccount(account2);
		 */

	//	accountService.transfer(1, 2, 100);
	//	accountService.withdraw(1, 100);
	//	accountService.deposit(2, 100);
	
	//	accountService.getAllTransactions();
		
		/*
		 * Employee employee1 = new Employee("john", "Delhi", "123546697",
		 * "john@gmail.com", "john123", LocalDate.of(199, Month.JUNE, 8), "EMP");
		 * Employee employee2 = new Employee("jyothi", "Hyd", "589546697",
		 * "jyothi@gmail.com", "jyothi123", LocalDate.of(2000, Month.JANUARY, 20),
		 * "EMP");
		 */
		/*
		 * employeeService.addEmployee(employee1);
		 * employeeService.addEmployee(employee2);
		 */
}


	//Transer details:transfer amt from 1st act 2nd acnt.
		  
	//accountService.transfer(1, 2, 100.0);

	//withdraw amt from 1st acnt;
		
	//	accountService.withdraw(1, 100);
		
//deposit amnt from 2nd act
	//accountService.deposit(2, 100);
		
//		accountService.withdraw(2, 100);

		
		
//address changing				
/*
 * AddressChangeRequest addressChangeRequest = new
 * AddressChangeRequest(" near kphb", "musheerbad", "55654856", "sri@gm.com");
 * 
 * accountService.changeAddress(1, addressChangeRequest);
 */
		  
		 	
	
		//to get transctn details from account 2
			
/*
 * List<TransactionLog> list = transactionLogDao.findByFromAccount(2);
 * 
 * for(TransactionLog log:list) System.out.println(log);
 */			 
	
	
	}


