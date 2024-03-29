package com.GLFS.mapper;

import com.GLFS.domain.Menu;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
/**
* @Author 三更 B站： https://space.bilibili.com/663528522
*/
public interface MenuMapper extends BaseMapper<Menu> {
    List<String> selectPermsByUserId(Long id);
}