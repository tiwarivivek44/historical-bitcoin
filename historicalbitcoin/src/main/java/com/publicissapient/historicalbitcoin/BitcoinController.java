package com.publicissapient.historicalbitcoin;

import java.util.concurrent.CompletableFuture;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/historicalbitcoin")
public class BitcoinController {
	
	/**
	 * @return CompletableFuture<Bitcoin>
	 */
	@GetMapping(value = "/details")
	public CompletableFuture<? extends Object> getBitcoinDetails() {
		try {
			CompletableFuture<BitcoinDate> date = (new DateLookupService()).findDate();
			CompletableFuture<BitcoinSupportedCurrencies[]> currencies = (new SupportedCurrenciesLookupService()).findSupportedCurrencies();

			return (new ResponseService().getDetails());
		
		}catch(Exception e) {
			e.printStackTrace();
           			
		}
		return null;
		
	}
	
}



