package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class Ringgit implements ConvertableCurrency {
    Integer value =7;
    CurrencyType test = CurrencyType.RINGGIT;

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
