package com.monocept.model;

public class FixedDeposit {
	private int accountNumber;
	private String name;
	private double principal;
	private int duration;
	private FestivalType festival;

	public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalType festival) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.principal = principal;
		this.duration = duration;
		this.festival = festival;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public FestivalType getFestival() {
		return festival;
	}

	public void setFestival(FestivalType festival) {
		this.festival = festival;
	}

	private double getInterestRates() {

		if (festival.equals(FestivalType.Holi)) {
			return 0.08;
		}
		if (festival.equals(FestivalType.Diwali)) {
			return 0.085;
		}
		if (festival.equals(FestivalType.Gapati)) {
			return 0.075;
		}
		if (festival.equals(FestivalType.Others)) {
			return 0.065;
		}

		return 0.06;

	}

	public double calculateSimpleInterest() {
		return principal * duration * getInterestRates();
	}

	@Override
	public String toString() {
		return "FixedDeposit [accountNumber=" + accountNumber + ", name=" + name + ", principal=" + principal
				+ ", duration=" + duration + ", festival=" + festival + ", Simple interest=" + calculateSimpleInterest()
				+ "]";
	}

}
