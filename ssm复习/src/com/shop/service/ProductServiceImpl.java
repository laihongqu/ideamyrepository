package com.shop.service;

import com.shop.dao.ProductMapper;
import com.shop.entity.Product;
import com.shop.entity.ProductExample;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper mapper;
    @Override
    public List<Product> getList() {
        System.out.println("进来了service");
        ProductExample example = new ProductExample();
        List<Product> products = mapper.selectByExampleWithBLOBs(example);
        System.out.println("products=="+products);
        return products;
    }

    @Override
    public Product producByIdt(Integer id) {
        return null;
    }

    @Override
    public Integer updateById(Integer id) {
        return null;
    }

    @Override
    public Integer insert(Product product) {
        return null;
    }

    @Override
    public Integer deleteById(Integer id) {
        return null;
    }

    @Override
    public Integer delete(Product product) {
        return null;
    }
}
