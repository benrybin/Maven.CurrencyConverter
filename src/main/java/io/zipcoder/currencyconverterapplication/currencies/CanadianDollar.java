package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class CanadianDollar implements ConvertableCurrency {
    CurrencyType test = CurrencyType.CANADIAN_DOLLAR;
    Integer value =2;

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
