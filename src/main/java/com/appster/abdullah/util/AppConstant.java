package com.appster.abdullah.util;

public class AppConstant {

	public enum UserType {
		NORMAL, ADMIN
	}

	public enum Currency {
		PENNY(1), DIME(5);

		private int value;

		private Currency(int value) {
			this.value = value;
		}
	}
}
