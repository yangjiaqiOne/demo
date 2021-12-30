package com.example.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.entity.TgDemo;
import com.example.demo.dao.TgDemoDao;
import com.example.demo.service.TgDemoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 自动构建基准字段(TgDemo)表服务实现类
 *
 * @author makejava
 * @since 2021-12-30 14:46:36
 */
@Service("tgDemoService")
public class TgDemoServiceImpl extends ServiceImpl<TgDemoDao, TgDemo> implements TgDemoService {

}
