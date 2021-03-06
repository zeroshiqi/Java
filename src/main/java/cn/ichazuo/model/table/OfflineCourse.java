package cn.ichazuo.model.table;

import java.util.Date;

import javax.persistence.Table;

import cn.ichazuo.commons.base.BaseModel;

/**
 * @ClassName: OfflineCourseInfo
 * @Description: (线下课程信息表)
 * @author ZhaoXu
 * @date 2015年7月18日 下午3:26:33
 * @version V1.0
 */
@Table(name = "t_course_offline")
public class OfflineCourse extends BaseModel {
	private static final long serialVersionUID = 1L;

	private Long id; // id
	private Long courseId; // 所属课程
	private Long offlineTypeId; // 线下课程类型 关联dict_item
	private String courseContent; // 课程内容
	private Double price; // 价格
	private String courseTime; // 上课时间(显示在app上)
	private Long cityId; // 所属城市
	private String teacherId;	//讲师ID  ','分割  多个讲师
	private Integer studentNum; // 招生总数
	private String address; // 讲课地址
	private Double lon; // 上课地点经度
	private Double lat; // 上课地点维度
	private Long commentCount; // 评论数量
	private Double star; // 评分
	private Long favourCount; // 赞数量
	private Integer joinCount;	//报名人数
	private Integer discount;	//折扣

	private Date createAt; // 创建时间
	private Date updateAt; // 更新时间
	private Integer status; // 状态
	private Long version; // 版本
	private String catalogId;
	private String catalogName;
	
	private String hasAuth;//会员是否有权限购买(1有，2无)
	private String vipDiscount;//会员折扣 默认100
	private String beginTime;//课程开始时间
	private String newtype;//课程类型

	// get set
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCourseId() {
		return courseId;
	}

	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}

	public Long getOfflineTypeId() {
		return offlineTypeId;
	}

	public void setOfflineTypeId(Long offlineTypeId) {
		this.offlineTypeId = offlineTypeId;
	}

	public String getCourseContent() {
		return courseContent;
	}

	public void setCourseContent(String courseContent) {
		this.courseContent = courseContent;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCourseTime() {
		return courseTime;
	}

	public void setCourseTime(String courseTime) {
		this.courseTime = courseTime;
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public Integer getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(Integer studentNum) {
		this.studentNum = studentNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getStar() {
		return star;
	}

	public void setStar(Double star) {
		this.star = star;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	public Date getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	public Long getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(Long commentCount) {
		this.commentCount = commentCount;
	}

	public Long getFavourCount() {
		return favourCount;
	}

	public void setFavourCount(Long favourCount) {
		this.favourCount = favourCount;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Integer getJoinCount() {
		return joinCount;
	}

	public void setJoinCount(Integer joinCount) {
		this.joinCount = joinCount;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getCatalogName() {
		return catalogName;
	}

	public void setCatalogName(String catalogName) {
		this.catalogName = catalogName;
	}

	public String getHasAuth() {
		return hasAuth;
	}

	public void setHasAuth(String hasAuth) {
		this.hasAuth = hasAuth;
	}

	public String getVipDiscount() {
		return vipDiscount;
	}

	public void setVipDiscount(String vipDiscount) {
		this.vipDiscount = vipDiscount;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getNewtype() {
		return newtype;
	}

	public void setNewtype(String newtype) {
		this.newtype = newtype;
	}
	
}
