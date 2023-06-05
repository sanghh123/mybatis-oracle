package com.example.config.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.config.entity.BinListNewError;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author YBY
 * @since 2023-05-18
 */
public interface BinListNewErrorService extends IService<BinListNewError> {

    List<BinListNewError> listyou();

}
