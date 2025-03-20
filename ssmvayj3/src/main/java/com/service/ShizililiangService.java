package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShizililiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShizililiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizililiangView;


/**
 * 师资力量
 *
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public interface ShizililiangService extends IService<ShizililiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShizililiangVO> selectListVO(Wrapper<ShizililiangEntity> wrapper);
   	
   	ShizililiangVO selectVO(@Param("ew") Wrapper<ShizililiangEntity> wrapper);
   	
   	List<ShizililiangView> selectListView(Wrapper<ShizililiangEntity> wrapper);
   	
   	ShizililiangView selectView(@Param("ew") Wrapper<ShizililiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShizililiangEntity> wrapper);
   	
}

