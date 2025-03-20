package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 学校简介
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-16 16:54:05
 */
@TableName("xuexiaojianjie")
public class XuexiaojianjieEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XuexiaojianjieEntity() {
		
	}
	
	public XuexiaojianjieEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
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
