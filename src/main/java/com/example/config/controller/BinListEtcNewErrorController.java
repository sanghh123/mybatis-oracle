package com.example.config.controller;


import com.example.config.entity.BinListNewError;
import com.example.config.service.BinListNewErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author YBY
 * @since 2023-05-18
 */
@RestController
@RequestMapping("/binListEtcNewError")
public class BinListEtcNewErrorController {
    @Autowired
    private BinListNewErrorService binListNewErrorService;
    @PostMapping("/errDownload")
    public List cs() {
        List<BinListNewError> list = binListNewErrorService.listyou();

    return  list;
    }

}

