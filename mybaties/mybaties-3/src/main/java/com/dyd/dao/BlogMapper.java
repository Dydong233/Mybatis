package com.dyd.dao;

import com.dyd.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);
    List<Blog> queryBlogIF(Map map);
    int updateBlog(Map map);
}
