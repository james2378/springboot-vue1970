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


import com.dao.KechengjieshaoDao;
import com.entity.KechengjieshaoEntity;
import com.service.KechengjieshaoService;
import com.entity.vo.KechengjieshaoVO;
import com.entity.view.KechengjieshaoView;

@Service("kechengjieshaoService")
public class KechengjieshaoServiceImpl extends ServiceImpl<KechengjieshaoDao, KechengjieshaoEntity> implements KechengjieshaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KechengjieshaoEntity> page = this.selectPage(
                new Query<KechengjieshaoEntity>(params).getPage(),
                new EntityWrapper<KechengjieshaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KechengjieshaoEntity> wrapper) {
		  Page<KechengjieshaoView> page =new Query<KechengjieshaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KechengjieshaoVO> selectListVO(Wrapper<KechengjieshaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KechengjieshaoVO selectVO(Wrapper<KechengjieshaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KechengjieshaoView> selectListView(Wrapper<KechengjieshaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KechengjieshaoView selectView(Wrapper<KechengjieshaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
