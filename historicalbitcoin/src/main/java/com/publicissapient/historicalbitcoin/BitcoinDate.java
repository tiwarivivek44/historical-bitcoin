package com.publicissapient.historicalbitcoin;

import java.util.HashMap;
import java.util.Map;

public class BitcoinDate {

	private String disclaimer;
	private BitcoinTime time;
	
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public BitcoinDate() {
	}

	/**
	 *
	 * @param time
	 * @param disclaimer
	 */
	public BitcoinDate(String disclaimer, BitcoinTime time) {
		super();
		this.disclaimer = disclaimer;
		this.time = time;
	}

	
	public String getDisclaimer() {
		return disclaimer;
	}

	
	public void setDisclaimer(String disclaimer) {
		this.disclaimer = disclaimer;
	}

	public BitcoinTime getTime() {
		return time;
	}


	public void setTime(BitcoinTime time) {
		this.time = time;
	}


	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(BitcoinDate.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("disclaimer");
		sb.append('=');
		sb.append(((this.disclaimer == null) ? "<null>" : this.disclaimer));
		sb.append(',');
		sb.append("time");
		sb.append('=');
		sb.append(((this.time == null) ? "<null>" : this.time));
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