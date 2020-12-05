package cn.lyz.micromall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.lyz.common.utils.PageUtils;
import cn.lyz.micromall.coupon.entity.MemberPriceEntity;

import java.util.Map;

/**
 * 商品会员价格
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 14:59:47
 */
public interface MemberPriceService extends IService<MemberPriceEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

