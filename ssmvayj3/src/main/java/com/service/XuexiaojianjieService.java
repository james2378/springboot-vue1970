package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexiaojianjieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexiaojianjieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexiaojianjieView;


/**
 * 学校简介
 *
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public interface XuexiaojianjieService extends IService<XuexiaojianjieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexiaojianjieVO> selectListVO(Wrapper<XuexiaojianjieEntity> wrapper);
   	
   	XuexiaojianjieVO selectVO(@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);
   	
   	List<XuexiaojianjieView> selectListView(Wrapper<XuexiaojianjieEntity> wrapper);
   	
   	XuexiaojianjieView selectView(@Param("ew") Wrapper<XuexiaojianjieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexiaojianjieEntity> wrapper);
   	
}

