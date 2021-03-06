package cn.ichazuo.model.app;

import java.util.Date;

import javax.persistence.Table;

import cn.ichazuo.commons.base.BaseModel;

/**
 * @ClassName: FeedBack
 * @Description: (意见反馈表)
 * @author ZhaoXu
 * @date 2015年7月18日 下午2:45:23
 * @version V1.0
 */
@Table(name = "t_business_feedback")
public class BusinessFeedBack extends BaseModel {
	private static final long serialVersionUID = 1L;

	private Long id; // id
	private String content; // 留言内容
	private String platform;//设备型号
	private Long employeeId; // 留言用户
	private Date createAt; // 创建时间
	private Date updateAt; // 修改时间
	private String version;// 版本
	private Integer status; // 状态

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	
}
