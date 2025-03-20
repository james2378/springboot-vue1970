package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KechengjieshaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KechengjieshaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KechengjieshaoView;


/**
 * 课程介绍
 *
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public interface KechengjieshaoService extends IService<KechengjieshaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KechengjieshaoVO> selectListVO(Wrapper<KechengjieshaoEntity> wrapper);
   	
   	KechengjieshaoVO selectVO(@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);
   	
   	List<KechengjieshaoView> selectListView(Wrapper<KechengjieshaoEntity> wrapper);
   	
   	KechengjieshaoView selectView(@Param("ew") Wrapper<KechengjieshaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KechengjieshaoEntity> wrapper);
   	
}

