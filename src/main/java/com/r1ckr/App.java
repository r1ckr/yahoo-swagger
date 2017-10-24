package com.r1ckr;

import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.api.QuotesApi;
import io.swagger.client.model.QueryResponse;
import io.swagger.client.model.Quote;

public class App 
{
    public static void main( String[] args ) throws ApiException {
        QuotesApi quotesApi = new QuotesApi();
        ApiResponse<QueryResponse> response= quotesApi.publicYqlGetWithHttpInfo(
                "select * from yahoo.finance.quote where symbol in (\"USDEUR=X\",\"USDGBP=X\")",
                "json",
                "store://datatables.org/alltableswithkeys", null);

        for (Quote quote: response.getData().getQuery().getResults().getQuote()) {
            System.out.println(quote.getSymbol() +" = "+ quote.getLastTradePriceOnly());
        }
    }
}
