
package com.pickmyorder.asharani;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StockDetails {

    @SerializedName("statusCode")
    @Expose
    private Integer statusCode;
    @SerializedName("VanReorder")
    @Expose
    private List<VanReorder> vanReorder = null;

    public Integer getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
    }

    public List<VanReorder> getVanReorder() {
        return vanReorder;
    }

    public void setVanReorder(List<VanReorder> vanReorder) {
        this.vanReorder = vanReorder;
    }

}
