package com.atguigu.gmall.product.service;

import com.atguigu.gmall.model.product.*;

import java.util.List;

/**
 * @author mqx
 * @date 2021-4-10 10:24:49
 */
public interface ManageSerivce {

   /*
        3.1	先加载所有的一级分类数据！

		3.2	通过选择一级分类Id数据加载二级分类数据！

		3.3	通过选择二级分类数据加载三级分类数据！

		3.4	根据分类Id 加载 平台属性列表！
    */

    /**
     * 获取所有一级分类数据
      * @return
     */
   List<BaseCategory1> getBaseCategory1();

    /**
     * 根据一级分类Id ，获取二级分类数据
     * @param category1Id
     * @return
     */
   List<BaseCategory2> getBaseCategory2(Long category1Id);

    /**
     * 根据二级分类Id ，获取三级分类数据
     * @param category2Id
     * @return
     */
    List<BaseCategory3> getBaseCategory3(Long category2Id);

    /**
     * 根据分类Id 获取平台属性列表
     * @param category1Id
     * @param category2Id
     * @param category3Id
     * @return
     */
    List<BaseAttrInfo> getBaseAttrInfoList(Long category1Id,Long category2Id,Long category3Id);


    /**
     * 保存平台属性
     * @param baseAttrInfo
     */
    void saveAttrInfo(BaseAttrInfo baseAttrInfo);

    /**
     * 根据平台属性Id 获取平台属性值集合
     * @param attrId
     * @return
     */
    List<BaseAttrValue> getAttrValueList(Long attrId);

    BaseAttrInfo getBaseAttrInfo(Long attrId);
}
