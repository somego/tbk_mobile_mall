package com.orange.tbk.admin.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.orange.tbk.admin.mapper.CourseMapper;
import com.orange.tbk.api.bean.Course;
import com.orange.tbk.api.service.CourseService;

@Service
public class CourseImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {

    @Override
    public Page<Course> page(Course course, Page page) {

        return page.setRecords(super.baseMapper.page(course,page));
    }

}
