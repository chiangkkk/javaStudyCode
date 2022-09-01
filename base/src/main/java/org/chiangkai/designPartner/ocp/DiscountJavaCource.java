package org.chiangkai.designPartner.ocp;

/**
 * @author ChiangKai
 * @date 2022/9/1 16:09
 */
public class DiscountJavaCource extends JavaCourse {
    public DiscountJavaCource(Integer id, String name, double price) {
        super(id, name, price);
    }

    public Double getOrginalPrice() {
        return super.getPrice();
    }

    public Double getDiscoutCource() {
        return super.getPrice() * 0.8;
    }
}
