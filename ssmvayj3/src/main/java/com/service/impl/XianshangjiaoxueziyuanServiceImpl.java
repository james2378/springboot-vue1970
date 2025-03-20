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


import com.dao.XianshangjiaoxueziyuanDao;
import com.entity.XianshangjiaoxueziyuanEntity;
import com.service.XianshangjiaoxueziyuanService;
import com.entity.vo.XianshangjiaoxueziyuanVO;
import com.entity.view.XianshangjiaoxueziyuanView;

@Service("xianshangjiaoxueziyuanService")
public class XianshangjiaoxueziyuanServiceImpl extends ServiceImpl<XianshangjiaoxueziyuanDao, XianshangjiaoxueziyuanEntity> implements XianshangjiaoxueziyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XianshangjiaoxueziyuanEntity> page = this.selectPage(
                new Query<XianshangjiaoxueziyuanEntity>(params).getPage(),
                new EntityWrapper<XianshangjiaoxueziyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XianshangjiaoxueziyuanEntity> wrapper) {
		  Page<XianshangjiaoxueziyuanView> page =new Query<XianshangjiaoxueziyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XianshangjiaoxueziyuanVO> selectListVO(Wrapper<XianshangjiaoxueziyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XianshangjiaoxueziyuanVO selectVO(Wrapper<XianshangjiaoxueziyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XianshangjiaoxueziyuanView> selectListView(Wrapper<XianshangjiaoxueziyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XianshangjiaoxueziyuanView selectView(Wrapper<XianshangjiaoxueziyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
