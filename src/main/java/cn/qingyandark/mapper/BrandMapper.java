package cn.qingyandark.mapper;


import cn.qingyandark.pojo.Brand;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface BrandMapper {
    List<Brand> selectAll();
    Brand selectById(int id);

    /**
     * 条件查询
     *  * 参数接收
     *      1. 散装参数：@Param()
     *      2. 对象参数
     *      3. map集合参数
     *
     */
    List<Brand> selectByCondition(@Param("STATUS") int status, @Param("company_name") String companyName, @Param("brand_name") String brand_name);
    List<Brand> selectByCondition(Brand brand);
    List<Brand> selectByCondition(Map map);
    List<Brand> selectByConditionSingle(Brand brand);

    void add(Brand brand);

    int update(Brand brand);

    void deleteById(int id);

//    void deleteByIds(int[] id);
    void deleteByIds(@Param("ids") int[] ids);

    // 注解开发 简单语句可以用，复杂语句用配置文件
    @Select("select * from tb_brand where id = #{id}")
    Brand selectById2(int id);
}
