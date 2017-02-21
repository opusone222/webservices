package com.sidgs.model;

/**
 * Created by Vytlasai on 2/20/2017.
 */
public class Products {

    private int product_id;
    private String product_name;
    private String description;
    private String product_image;
    private String product_brand;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_brand() {
        return product_brand;
    }

    public void setProduct_brand(String product_brand) {
        this.product_brand = product_brand;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Products products = (Products) o;

        if (product_id != products.product_id) return false;
        if (!product_name.equals(products.product_name)) return false;
        if (!description.equals(products.description)) return false;
        if (!product_image.equals(products.product_image)) return false;
        return product_brand.equals(products.product_brand);
    }

    @Override
    public int hashCode() {
        int result = product_id;
        result = 31 * result + product_name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + product_image.hashCode();
        result = 31 * result + product_brand.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Products{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", description='" + description + '\'' +
                ", product_image='" + product_image + '\'' +
                ", product_brand='" + product_brand + '\'' +
                '}';
    }
}




