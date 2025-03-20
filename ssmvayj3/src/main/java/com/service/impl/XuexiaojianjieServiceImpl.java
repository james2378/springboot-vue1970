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


import com.dao.XuexiaojianjieDao;
import com.entity.XuexiaojianjieEntity;
import com.service.XuexiaojianjieService;
import com.entity.vo.XuexiaojianjieVO;
import com.entity.view.XuexiaojianjieView;

@Service("xuexiaojianjieService")
public class XuexiaojianjieServiceImpl extends ServiceImpl<XuexiaojianjieDao, XuexiaojianjieEntity> implements XuexiaojianjieService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaojianjieEntity> page = this.selectPage(
                new Query<XuexiaojianjieEntity>(params).getPage(),
                new EntityWrapper<XuexiaojianjieEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaojianjieEntity> wrapper) {
		  Page<XuexiaojianjieView> page =new Query<XuexiaojianjieView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaojianjieVO> selectListVO(Wrapper<XuexiaojianjieEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaojianjieVO selectVO(Wrapper<XuexiaojianjieEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaojianjieView> selectListView(Wrapper<XuexiaojianjieEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaojianjieView selectView(Wrapper<XuexiaojianjieEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
