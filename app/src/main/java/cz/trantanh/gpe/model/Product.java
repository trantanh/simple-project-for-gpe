package cz.trantanh.gpe.model;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Objects;

/**
 * Created by tran.t.anh(@)email.cz on 13.04.2020.
 */
public class Product {

    private  String id;
    private String name;
    private double price;
    private String barcode;
    private String created;

    public Product(String id, String name, double price, String barcode, String created) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.barcode = barcode;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Objects.equals(name, product.name) &&
                Objects.equals(barcode, product.barcode);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    public int hashCode() {
        return Objects.hash(name, price, barcode);
    }
}
