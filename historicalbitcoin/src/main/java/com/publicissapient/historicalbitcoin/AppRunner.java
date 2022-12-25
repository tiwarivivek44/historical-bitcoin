package com.publicissapient.historicalbitcoin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.concurrent.CompletableFuture;

@Component
public class AppRunner implements CommandLineRunner {

	private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

	private final DateLookupService bitcoinLookupService;
	private final SupportedCurrenciesLookupService bitcoinSupportedCurrenciesLookupService;

	public AppRunner(DateLookupService bitcoinLookupService, SupportedCurrenciesLookupService bitcoinSupportedCurrenciesLookupService) {
		this.bitcoinLookupService = bitcoinLookupService;
		this.bitcoinSupportedCurrenciesLookupService = bitcoinSupportedCurrenciesLookupService;
	}

	@Override
	public void run(String... args) throws Exception {
		// Start the clock
		long start = System.currentTimeMillis();

		// Kick of multiple, asynchronous lookups
		CompletableFuture<BitcoinDate> result1 = bitcoinLookupService.findDate();
		CompletableFuture<BitcoinSupportedCurrencies[]> result2 = bitcoinSupportedCurrenciesLookupService.findSupportedCurrencies();
		
		// Wait until they are all done
		//CompletableFuture.allOf(result1, result2).join();

		// Print results, including elapsed time
		logger.info("Elapsed time: " + (System.currentTimeMillis() - start));
		logger.info("--> " + result1.get());
		logger.info("--> " + result2.get());


	}

}