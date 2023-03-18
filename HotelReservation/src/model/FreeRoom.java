package model;

import java.math.BigDecimal;

public class FreeRoom {
    BigDecimal price;
    public FreeRoom(){
        price = new BigDecimal("0.0");
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("FreeRoom{");
        sb.append("price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
