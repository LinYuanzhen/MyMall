package cn.lyz.micromall.coupon.dao;

import cn.lyz.micromall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author Linyz
 * @email 271129008@qq.com
 * @date 2020-11-29 14:59:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
