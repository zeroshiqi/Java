package cn.ichazuo.model.app;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.ichazuo.commons.base.BaseModel;
import cn.ichazuo.commons.util.DateUtils;

/**
 * @ClassName: WebOfflineCourseInfo
 * @Description: (Web线下课程内容)
 * @author ZhaoXu
 * @date 2015年8月29日 下午12:43:04
 * @version V1.0
 */
public class WebOfflineCourseInfo extends BaseModel {
	private static final long serialVersionUID = 1L;

	private Long courseId; // 课程ID
	private String content; // 内容
	private Date createAt; // 创建时间
	private Long clickNumber; // 点击次数
	private String title; // 标题
	private Double price;	//价格
	private Integer total;	//总人数
	private Integer join;	//报名人数
	private Integer isOver;	//是否结束 1:报名结束  0:未结束
	private Integer isHidden;	//是否隐藏按钮		//1:隐藏 0:显示
	private Integer isCrowd;	//是否开启众筹  0:不开启 1:开启
	private Integer newType;
	private String synopsis;
	
	private String cover;
	private String avatar;

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	@JsonFormat(pattern=DateUtils.TIME_FORMAT_NORMAL,timezone = "GMT+8")  
	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Long getClickNumber() {
		return clickNumber;
	}

	public void setClickNumber(Long clickNumber) {
		this.clickNumber = clickNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getJoin() {
		return join;
	}

	public void setJoin(Integer join) {
		this.join = join;
	}

	public Integer getNumber() {
		return total - join;
	}

	public Integer getIsOver() {
		return isOver;
	}

	public void setIsOver(Integer isOver) {
		this.isOver = isOver;
	}

	public Integer getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(Integer isHidden) {
		this.isHidden = isHidden;
	}

	public Integer getIsCrowd() {
		return isCrowd;
	}

	public void setIsCrowd(Integer isCrowd) {
		this.isCrowd = isCrowd;
	}

	public Integer getNewType() {
		return newType;
	}

	public void setNewType(Integer newType) {
		this.newType = newType;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public String getCover() {
		return cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
}
