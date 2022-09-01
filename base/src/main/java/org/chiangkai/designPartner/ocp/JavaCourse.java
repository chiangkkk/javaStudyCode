package org.chiangkai.designPartner.ocp;

/**
 * @author ChiangKai
 * @date 2022/9/1 15:50
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
