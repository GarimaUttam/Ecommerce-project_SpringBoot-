package com.garima.ecom_project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private String brand;
    private BigDecimal price;
    private String category;
    private Date releasedate;
    private boolean available;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getReleasedate() {
        return releasedate;
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

//SQL query
//
//INSERT INTO product (name, desc, brand, price, category, release_date, available, quantity)
//VALUES ('Tata Nexon', 'A compact SUV with excellent safety features and performance.', 'Tata Motors', 750000.00, 'Cars', '2024-01-15', true, 50),
//('Maruti Suzuki Swift', 'A popular hatchback known for its fuel efficiency and reliability.', 'Maruti Suzuki', 550000.00, 'Cars', '2024-02-01', true, 100),
//        ('Hyundai Creta', 'A stylish SUV with advanced features and comfortable interior.', 'Hyundai', 950000.00, 'Cars', '2024-03-01', true, 75),
//        ('Mahindra Thar', 'A rugged off-road SUV with a powerful engine and modern amenities.', 'Mahindra', 1200000.00, 'Cars', '2024-04-01', true, 30),
//        ('Honda city', 'A premium sedan car', 'Honda', 84729348, 'Cars', '2025-05-29', true, 34);