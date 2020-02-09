package org.mines.douai.j2ee.tp.lepez.bean;

import java.math.BigDecimal;
import java.util.HashMap;

public class QuoteBean {
	ModelRandomCurrency randomCurrency = new ModelRandomCurrency();
	HashMap<String,BigDecimal> currencies = randomCurrency.updateCurrency();
	
	public HashMap<String, BigDecimal> getCurrencies() {
		return currencies;
	}

	String name;
	BigDecimal value;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getValue() {
		return value;
	}
	public void setValue(String name) {
		this.value = randomCurrency.updateCurrency().get(name);
	}
	
	public boolean isBitcoin( String currency) {
		return currency.equals("Bitcoin");
	}
	
	public boolean isLitcoin( String currency) {
		return currency.equals("Litecoin");
	}
	public boolean isNamecoin( String currency) {
		return currency.equals("Namecoin");
	}
	
	
	

}
