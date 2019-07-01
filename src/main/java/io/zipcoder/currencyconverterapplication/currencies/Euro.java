package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Euro implements ConvertableCurrency {
    CurrencyType test= CurrencyType.EURO;
    Integer value =4;

    @Override
    public Integer value() {
        return this.value;
    }

    @Override
    public CurrencyType getType() {
        return test;
    }
    public  Double getRate(){

        return test.getRate2();
    }
}
