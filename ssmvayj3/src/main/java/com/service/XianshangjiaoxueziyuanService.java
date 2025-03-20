package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XianshangjiaoxueziyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XianshangjiaoxueziyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XianshangjiaoxueziyuanView;


/**
 * 线上教学资源
 *
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public interface XianshangjiaoxueziyuanService extends IService<XianshangjiaoxueziyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XianshangjiaoxueziyuanVO> selectListVO(Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
   	
   	XianshangjiaoxueziyuanVO selectVO(@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
   	
   	List<XianshangjiaoxueziyuanView> selectListView(Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
   	
   	XianshangjiaoxueziyuanView selectView(@Param("ew") Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XianshangjiaoxueziyuanEntity> wrapper);
   	
}

