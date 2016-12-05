package cn.ustc.ssm.mapper;

import cn.ustc.ssm.po.ItemsCustom;
import cn.ustc.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * 商品自定义mapper
 * Created with IntelliJ IDEA
 * Created by ustcck on 2016/12/5 17:31.
 */
public interface ItemsMapperCustom {
    // 商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
            throws Exception;

}
