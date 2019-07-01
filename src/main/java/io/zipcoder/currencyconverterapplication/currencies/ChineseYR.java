package io.zipcoder.currencyconverterapplication.currencies;

import io.zipcoder.currencyconverterapplication.ConvertableCurrency;
import io.zipcoder.currencyconverterapplication.CurrencyType;

public class ChineseYR implements ConvertableCurrency {
    CurrencyType test=CurrencyType.CHINESE_YR;
    Integer value =3;

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
