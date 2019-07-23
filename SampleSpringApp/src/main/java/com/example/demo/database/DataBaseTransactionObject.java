package com.example.demo.database;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class DataBaseTransactionObject {
	private Transaction transaction;
	private Session session;

	public DataBaseTransactionObject(Transaction transaction, Session session) {
		this.setTransaction(transaction);
		this.setSession(session);
	}

	public Transaction getTransaction() {
		return transaction;
	}

	private void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public Session getSession() {
		return session;
	}

	private void setSession(Session session) {
		this.session = session;
	}

}
