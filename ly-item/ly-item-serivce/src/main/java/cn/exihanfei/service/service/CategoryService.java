package cn.exihanfei.service.service;

import cn.eixhanfei.common.enums.ExceptionEnum;
import cn.eixhanfei.common.exception.LyException;
import cn.exihanfei.service.mapper.CategoryMapper;
import cn.exihanfei.service.pojo.Category;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryService {

    @Resource
    private CategoryMapper categoryMapper;

    public List<Category> queryCategoryByPid(Long pid) {
        //查询条件，mapper会把对象中的非空属性作为查询条件
        Category  t=new Category();
        t.setParentId(pid);
        List<Category> list = categoryMapper.select(t);
        //判断结果
        if(CollectionUtils.isEmpty(list)){
            throw new LyException(ExceptionEnum.CATEGORY_NOT_FOUND);
        }
        return list;
    }
}
