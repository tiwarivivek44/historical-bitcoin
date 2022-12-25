package com.publicissapient.historicalbitcoin;

import java.util.HashMap;
import java.util.Map;

public class BitcoinSupportedCurrencies {
	
	private String currency;
	private String country;
	
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	
	public BitcoinSupportedCurrencies() {
	}

	public BitcoinSupportedCurrencies(String currency, String country) {
		super();
		this.currency = currency;
		this.country = country;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCountry() {
		return country;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(BitcoinSupportedCurrencies.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("currency");
		sb.append('=');
		sb.append(((this.currency == null) ? "<null>" : this.currency));
		sb.append(',');
		sb.append("country");
		sb.append('=');
		sb.append(((this.country == null) ? "<null>" : this.country));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null) ? "<null>" : this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length() - 1)) == ',') {
			sb.setCharAt((sb.length() - 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}
	
}
