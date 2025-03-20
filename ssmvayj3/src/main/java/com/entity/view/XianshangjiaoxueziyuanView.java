package com.entity.view;

import com.entity.XianshangjiaoxueziyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 线上教学资源
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
@TableName("xianshangjiaoxueziyuan")
public class XianshangjiaoxueziyuanView  extends XianshangjiaoxueziyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XianshangjiaoxueziyuanView(){
	}
 
 	public XianshangjiaoxueziyuanView(XianshangjiaoxueziyuanEntity xianshangjiaoxueziyuanEntity){
 	try {
			BeanUtils.copyProperties(this, xianshangjiaoxueziyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
