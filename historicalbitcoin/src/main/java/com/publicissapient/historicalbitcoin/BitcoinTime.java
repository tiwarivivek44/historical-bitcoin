package com.publicissapient.historicalbitcoin;

import java.util.HashMap;
import java.util.Map;

public class BitcoinTime {

	private String updated;
	private String updatedISO;

	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * No args constructor for use in serialization
	 *
	 */
	public BitcoinTime() {
	}

	/**
	 *
	 * @param updatedISO
	 * @param updated
	 */
	public BitcoinTime(String updated, String updatedISO) {
		super();
		this.updated = updated;
		this.updatedISO = updatedISO;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getUpdatedISO() {
		return updatedISO;
	}

	public void setUpdatedISO(String updatedISO) {
		this.updatedISO = updatedISO;
	}

	
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}


	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(BitcoinTime.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
				.append('[');
		sb.append("updated");
		sb.append('=');
		sb.append(((this.updated == null) ? "<null>" : this.updated));
		sb.append(',');
		sb.append("updatedISO");
		sb.append('=');
		sb.append(((this.updatedISO == null) ? "<null>" : this.updatedISO));
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