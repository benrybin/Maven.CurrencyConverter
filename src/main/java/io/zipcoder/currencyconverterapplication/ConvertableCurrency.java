package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
         //   CurrencyType test = new CurrencyType();

        return currencyType.getRate2()/this.getType().getRate2();
    }
    public Integer value();
    public CurrencyType getType();
    public Double getRate();
    }


