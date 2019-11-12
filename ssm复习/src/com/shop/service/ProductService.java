package com.shop.service;

import com.shop.entity.Product;

import java.util.List;

public interface ProductService {

    public List<Product> getList();

    public Product producByIdt(Integer id);

    public Integer updateById(Integer id);

    public Integer insert(Product product);

    public Integer deleteById(Integer id);

    public Integer delete(Product product);
}
