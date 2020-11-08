package com.company;

public class Product {
    private int mProductID;
    private String mProductName;
    private double mPrice;
    private int mQuantity;

    public Product(int productID, String mProductName, double price, int qty)
    {
        setProduct(productID, mProductName, price, qty);
    }

    public void setProduct (int productID, String productName, double price, int qty)
    {
        mProductID = productID;
        mProductName = productName;
        mPrice = price;
        mQuantity = qty;
    }

    public int getmProductID() {
        return mProductID;
    }

    public String getmProductName() {
        return mProductName;
    }

    public double getHarga() {
        return mPrice;
    }

    public void print() {
        System.out.println("ID PRODUK   NAMA PRODUK     HARGA       JUMLAH");
        System.out.println(mProductID + "           " + mProductName + "      " + mPrice + "        " + mQuantity);
    }

    public static void main(String[] args) {
        Product tBarang = new Product(1, "Aqua Botol", 5000, 3);
        tBarang.print();
    }
}