package com.dao;

import com.entity.XianshangjiaoxueziyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XianshangjiaoxueziyuanVO;
import com.entity.view.XianshangjiaoxueziyuanView;


/**
 * 线上教学资源
 * 
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public interface XianshangjiaoxueziyuanDao extends BaseMapper<XianshangjiaoxueziyuanEntity> {
	
	List<XianshangjiaoxueziyuanVO> selectListVO(@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
	
	XianshangjiaoxueziyuanVO selectVO(@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
	
	List<XianshangjiaoxueziyuanView> selectListView(@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);

	List<XianshangjiaoxueziyuanView> selectListView(Pagination page,@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
	
	XianshangjiaoxueziyuanView selectView(@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
	
}
