package com.publicissapient.historicalbitcoin;

import java.util.HashMap;
import java.util.Map;

public class ResponseEntity {
	
	private BitcoinDate bitcoinDate;
	private BitcoinSupportedCurrencies[] bitcoinSupportedCurrencies;	
	
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public ResponseEntity() {
		super();
	}
	/**
	 * @param bitcoinDate
	 * @param bitcoinSupportedCurrencies
	 */
	public ResponseEntity(BitcoinDate bitcoinDate, BitcoinSupportedCurrencies[] bitcoinSupportedCurrencies) {
		super();
		this.bitcoinDate = bitcoinDate;
		this.bitcoinSupportedCurrencies = bitcoinSupportedCurrencies;
	}
	/**
	 * @return the bitcoinDate
	 */
	public BitcoinDate getBitcoinDate() {
		return bitcoinDate;
	}
	/**
	 * @return the bitcoinSupportedCurrencies
	 */
	public BitcoinSupportedCurrencies[] getBitcoinSupportedCurrencies() {
		return bitcoinSupportedCurrencies;
	}
	/**
	 * @param bitcoinDate the bitcoinDate to set
	 */
	public void setBitcoinDate(BitcoinDate bitcoinDate) {
		this.bitcoinDate = bitcoinDate;
	}
	/**
	 * @param bitcoinSupportedCurrencies the bitcoinSupportedCurrencies to set
	 */
	public void setBitcoinSupportedCurrencies(BitcoinSupportedCurrencies[] bitcoinSupportedCurrencies) {
		this.bitcoinSupportedCurrencies = bitcoinSupportedCurrencies;
	}
	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ResponseEntity.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("BitcoinDate");
		sb.append('=');
		sb.append(((this.bitcoinDate == null) ? "<null>" : this.bitcoinDate));
		sb.append(',');
		sb.append("BitcoinSupportedCurrencies");
		sb.append('=');
		sb.append(((this.bitcoinSupportedCurrencies == null) ? "<null>" : this.bitcoinSupportedCurrencies));
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
