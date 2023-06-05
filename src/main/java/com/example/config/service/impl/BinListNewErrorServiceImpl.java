package com.example.config.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.config.entity.BinListNewError;
import com.example.config.mapper.BinListNewErrorMapper;
import com.example.config.service.BinListNewErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YBY
 * @since 2023-05-18
 */
@Service
public class BinListNewErrorServiceImpl extends ServiceImpl<BinListNewErrorMapper, BinListNewError> implements BinListNewErrorService {


    @Autowired
   private BinListNewErrorMapper binListNewErrorMapper;

    @Override
    public List<BinListNewError> listyou() {

        LambdaQueryWrapper<BinListNewError> queryWrapper = new LambdaQueryWrapper<>();
        List<BinListNewError> entityList = binListNewErrorMapper.selectList(queryWrapper);
        return entityList;
    }
}
