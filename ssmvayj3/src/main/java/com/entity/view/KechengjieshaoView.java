package com.entity.view;

import com.entity.KechengjieshaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 课程介绍
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
@TableName("kechengjieshao")
public class KechengjieshaoView  extends KechengjieshaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public KechengjieshaoView(){
	}
 
 	public KechengjieshaoView(KechengjieshaoEntity kechengjieshaoEntity){
 	try {
			BeanUtils.copyProperties(this, kechengjieshaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
