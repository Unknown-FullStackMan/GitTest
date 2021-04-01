package com.imooc.service.impl;

import com.imooc.entity.Dept;
import com.imooc.mapper.DeptMapper;
import com.imooc.service.DeptService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 部门信息表 服务实现类
 * </p>
 *
 * @author muyunmiss
 * @since 2018-12-12
 */
@Service
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements DeptService {

}
