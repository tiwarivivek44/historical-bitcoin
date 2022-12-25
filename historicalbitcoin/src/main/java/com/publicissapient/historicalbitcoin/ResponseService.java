package com.publicissapient.historicalbitcoin;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

	private static final Logger logger = LoggerFactory.getLogger(DateLookupService.class);

	public ResponseService() {

	}

	@Async
	public CompletableFuture<? extends Object> getDetails() throws InterruptedException {

		CompletableFuture<BitcoinDate> date = (new DateLookupService()).findDate();
		CompletableFuture<BitcoinSupportedCurrencies[]> currencies = (new SupportedCurrenciesLookupService())
				.findSupportedCurrencies();

		List<CompletableFuture<? extends Object>> completableFutures = Arrays.asList(date, currencies);

		CompletableFuture<Void> resultantCf = CompletableFuture
				.allOf(completableFutures.toArray(new CompletableFuture[completableFutures.size()]));

		CompletableFuture<List<? extends Object>> allFutureResults = resultantCf
				.thenApply(t -> completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList()));

		return allFutureResults;

	}

}
