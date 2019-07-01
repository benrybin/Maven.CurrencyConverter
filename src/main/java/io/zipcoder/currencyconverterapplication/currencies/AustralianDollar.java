package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class AustralianDollar implements ConvertableCurrency {
    Integer value =1;
    CurrencyType test = CurrencyType.AUSTRALIAN_DOLLAR;

    @Override
    public Integer value() {
        return this.value;
    }

    @Override
    public CurrencyType getType() {


        return test;
    }
    public Double getRate(){

        return test.getRate2();
    }


}
