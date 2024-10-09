package adv1.sync.v2;

import adv1.sync.BankAccount;

import static adv1.util.Logger.log;
import static adv1.util.ThreadUtils.sleep;


public class BankAccountImplV2 implements BankAccount {

	private int balance;

	public BankAccountImplV2(int balance) {
		this.balance = balance;
	}

	@Override
	public synchronized boolean withdraw(int amount) {
		log("거래 시작 : " + getClass().getSimpleName());
		log("[검증 시작] 출금액 : " + amount + ", 잔액 : " + balance);

		if (balance < amount) {
			log("[검증 실패] 출금액 : " + amount + ", 잔액 : " + balance);
			return false;
		}

		log("[검증 완료] 출금액 : " + amount + ", 잔액 : " + balance);
		sleep(1000);	// 출금 소요 시간 :1초
		balance -= amount;
		log("[출금 완료] 출금액 : " + amount + ", 잔액 : " + balance);
		log("거래 종료");
		return true;
	}

	@Override
	public synchronized int getBalance() {
		return balance;
	}
}
