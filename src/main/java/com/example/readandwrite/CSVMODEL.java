package com.example.readandwrite;




public class CSVMODEL {
    private final  String object;

    public String getObject() {
        return object;
    }

    public CSVMODEL(String object) {
        this.object=object;
    }

    @Override
    public String toString() {
        return "CSVMODEL{" +
                "object='" + object + '\'' +
                '}';
    }

    /* private final String date;
    private final String totalvolume;
    private final String market;
    private final String symbol;
    private final String shortvalue;
    private final String shortexamplevalue;

    public CSVMODEL(String date, String symbol, String shortvalue, String shortexamplevalue, String totalvolume, String market) {
        this.date = date;
        this.symbol = symbol;
        this.shortvalue = shortvalue;
        this.shortexamplevalue = shortexamplevalue;
        this.totalvolume = totalvolume;
        this.market = market;
    }


    public String getDate() {
        return date;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getShortvalue() {
        return shortvalue;
    }

    public String getShortexamplevalue() {
        return shortexamplevalue;
    }

    public String getTotalvolume() {
        return totalvolume;
    }

    public String getMarket() {
        return market;
    }

    @Override
    public String toString() {
        return "CSVMODEL{" +
                "date='" + date + '\'' +
                ", totalvolume='" + totalvolume + '\'' +
                ", market='" + market + '\'' +
                ", symbol='" + symbol + '\'' +
                ", shortvalue='" + shortvalue + '\'' +
                ", shortexamplevalue='" + shortexamplevalue + '\'' +
                '}';
    }*/
}
