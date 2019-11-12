package com.shop.web;


import com.shop.entity.Product;
import com.shop.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class productController {
    private ProductServiceImpl productService;

    @RequestMapping("product")
    public ModelAndView productlist(){
        System.out.println("进来了control");
        ModelAndView modelAndView = new ModelAndView();
        List<Product> list = productService.getList();
        System.out.println("list=="+list);
        modelAndView.addObject("productlist",list);
        return modelAndView;
    }

}
