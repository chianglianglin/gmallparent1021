package com.atguigu.gmall.list.service;

/**
 * @author mqx
 */
public interface SearchService {

    //  商品上架
    void upperGoods(Long skuId);
    //  商品下架
    void lowerGoods(Long skuId);
}