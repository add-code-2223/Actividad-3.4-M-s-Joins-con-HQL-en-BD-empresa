package modelo;
// Generated 21:11:36, 10 de xan. de 2023 by Hibernate Tools 5.6.14.Final

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Account generated by hbm2java
 */
public class Account implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer accountno;
	private Emp emp;
	private BigDecimal amount;
	private Set accMovements = new HashSet(0);

	public Account() {
	}

	public Account(Emp emp, BigDecimal amount) {
		this.emp = emp;
		this.amount = amount;
	}

	public Account(Emp emp, BigDecimal amount, Set accMovements) {
		this.emp = emp;
		this.amount = amount;
		this.accMovements = accMovements;
	}

	public Integer getAccountno() {
		return this.accountno;
	}

	public void setAccountno(Integer accountno) {
		this.accountno = accountno;
	}

	public Emp getEmp() {
		return this.emp;
	}

	public void setEmp(Emp emp) {
		this.emp = emp;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public Set getAccMovements() {
		return this.accMovements;
	}

	public void setAccMovements(Set accMovements) {
		this.accMovements = accMovements;
	}

}
