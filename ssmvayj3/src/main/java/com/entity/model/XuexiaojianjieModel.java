package com.entity.model;

import com.entity.XuexiaojianjieEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学校简介
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
public class XuexiaojianjieModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 创始人
	 */
	
	private String chuangshiren;
		
	/**
	 * 现任校长
	 */
	
	private String xianrenxiaozhang;
		
	/**
	 * 创办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chuangbanshijian;
		
	/**
	 * 学校介绍
	 */
	
	private String xuexiaojieshao;
		
	/**
	 * 学校详情
	 */
	
	private String xuexiaoxiangqing;
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：创始人
	 */
	 
	public void setChuangshiren(String chuangshiren) {
		this.chuangshiren = chuangshiren;
	}
	
	/**
	 * 获取：创始人
	 */
	public String getChuangshiren() {
		return chuangshiren;
	}
				
	
	/**
	 * 设置：现任校长
	 */
	 
	public void setXianrenxiaozhang(String xianrenxiaozhang) {
		this.xianrenxiaozhang = xianrenxiaozhang;
	}
	
	/**
	 * 获取：现任校长
	 */
	public String getXianrenxiaozhang() {
		return xianrenxiaozhang;
	}
				
	
	/**
	 * 设置：创办时间
	 */
	 
	public void setChuangbanshijian(Date chuangbanshijian) {
		this.chuangbanshijian = chuangbanshijian;
	}
	
	/**
	 * 获取：创办时间
	 */
	public Date getChuangbanshijian() {
		return chuangbanshijian;
	}
				
	
	/**
	 * 设置：学校介绍
	 */
	 
	public void setXuexiaojieshao(String xuexiaojieshao) {
		this.xuexiaojieshao = xuexiaojieshao;
	}
	
	/**
	 * 获取：学校介绍
	 */
	public String getXuexiaojieshao() {
		return xuexiaojieshao;
	}
				
	
	/**
	 * 设置：学校详情
	 */
	 
	public void setXuexiaoxiangqing(String xuexiaoxiangqing) {
		this.xuexiaoxiangqing = xuexiaoxiangqing;
	}
	
	/**
	 * 获取：学校详情
	 */
	public String getXuexiaoxiangqing() {
		return xuexiaoxiangqing;
	}
			
}
