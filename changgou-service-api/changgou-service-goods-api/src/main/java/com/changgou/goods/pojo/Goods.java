package com.changgou.goods.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 组合对象
 *
 * @author www.itheima.com
 * @version 1.0
 * @package com.changgou.goods.pojo *
 * @since 1.0
 */
public class Goods implements Serializable {
    private Spu spu;// 1
    private List<Sku> skuList;//N

    public Spu getSpu() {
        return spu;
    }

    public void setSpu(Spu spu) {
        this.spu = spu;
    }

    public List<Sku> getSkuList() {
        return skuList;
    }

    public void setSkuList(List<Sku> skuList) {
        this.skuList = skuList;
    }
}
