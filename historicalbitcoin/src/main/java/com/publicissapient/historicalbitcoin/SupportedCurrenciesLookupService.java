package com.publicissapient.historicalbitcoin;

import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class SupportedCurrenciesLookupService {
	
	private static final Logger logger = LoggerFactory.getLogger(DateLookupService.class);
	
	public SupportedCurrenciesLookupService() {
	}

	@Async
	public CompletableFuture<BitcoinSupportedCurrencies[]> findSupportedCurrencies() throws InterruptedException {
		logger.info("Looking up - Supported Currencies" );
		String url = String.format("https://api.coindesk.com/v1/bpi/supported-currencies.json");
		RestTemplateJSON restTemplateJSON = new RestTemplateJSON();

		restTemplateJSON.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		BitcoinSupportedCurrencies[] results = restTemplateJSON.getForObject(url, BitcoinSupportedCurrencies[].class);
		
		return CompletableFuture.completedFuture(results);
	  }
}
