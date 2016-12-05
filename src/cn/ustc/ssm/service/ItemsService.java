package cn.ustc.ssm.service;

import cn.ustc.ssm.po.ItemsCustom;
import cn.ustc.ssm.po.ItemsQueryVo;

import java.util.List;

/**
 * 商品service接口
 * Created with IntelliJ IDEA
 * Created by ustcck on 2016/12/5 17:33.
 */
public interface ItemsService {

    //商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
            throws Exception;

    //根据商品id查询商品信息
    public ItemsCustom findItemsById(int id) throws Exception;

    //更新商品信息

    /**
     * 定义service接口，遵循单一职责，将业务参数细化 （不要使用包装类型，比如map）
     * @param id id
     * @param itemsCustom itemsCustom
     * @throws Exception
     */
    public void updateItems(Integer id, ItemsCustom itemsCustom) throws Exception;

}
