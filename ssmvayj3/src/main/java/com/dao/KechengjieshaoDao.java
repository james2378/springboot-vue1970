package com.dao;

import com.entity.KechengjieshaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KechengjieshaoVO;
import com.entity.view.KechengjieshaoView;


/**
 * 课程介绍
 * 
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public interface KechengjieshaoDao extends BaseMapper<KechengjieshaoEntity> {
	
	List<KechengjieshaoVO> selectListVO(@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);
	
	KechengjieshaoVO selectVO(@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);
	
	List<KechengjieshaoView> selectListView(@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);

	List<KechengjieshaoView> selectListView(Pagination page,@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);
	
	KechengjieshaoView selectView(@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);
	
}
