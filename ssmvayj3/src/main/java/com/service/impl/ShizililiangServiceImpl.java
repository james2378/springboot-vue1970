package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShizililiangDao;
import com.entity.ShizililiangEntity;
import com.service.ShizililiangService;
import com.entity.vo.ShizililiangVO;
import com.entity.view.ShizililiangView;

@Service("shizililiangService")
public class ShizililiangServiceImpl extends ServiceImpl<ShizililiangDao, ShizililiangEntity> implements ShizililiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShizililiangEntity> page = this.selectPage(
                new Query<ShizililiangEntity>(params).getPage(),
                new EntityWrapper<ShizililiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShizililiangEntity> wrapper) {
		  Page<ShizililiangView> page =new Query<ShizililiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShizililiangVO> selectListVO(Wrapper<ShizililiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShizililiangVO selectVO(Wrapper<ShizililiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShizililiangView> selectListView(Wrapper<ShizililiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShizililiangView selectView(Wrapper<ShizililiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
