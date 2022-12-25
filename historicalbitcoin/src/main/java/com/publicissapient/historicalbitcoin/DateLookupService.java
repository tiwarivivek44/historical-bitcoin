package com.publicissapient.historicalbitcoin;

import java.util.concurrent.CompletableFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;


@Service
public class DateLookupService {
	
	private static final Logger logger = LoggerFactory.getLogger(DateLookupService.class);
	
	public DateLookupService() {

	}

	
	@Async
	public CompletableFuture<BitcoinDate> findDate() throws InterruptedException {
		logger.info("Looking up - Date" );
		String url = String.format("https://api.coindesk.com/v1/bpi/historical/close.json");
		RestTemplateJSON restTemplateJSON = new RestTemplateJSON();

		restTemplateJSON.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		BitcoinDate results = restTemplateJSON.getForObject(url, BitcoinDate.class);
		
		return CompletableFuture.completedFuture(results);
	  }

}
