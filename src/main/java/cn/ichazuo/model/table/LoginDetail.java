package cn.ichazuo.model.table;

import java.util.Date;

import javax.persistence.Table;

import cn.ichazuo.commons.base.BaseModel;

/**
 * @ClassName: LoginDetail
 * @Description: (登录明细表)
 * @author ZhaoXu
 * @date 2015年7月18日 下午2:28:06
 * @version V1.0
 */
@Table(name = "t_business_login_details")
public class LoginDetail extends BaseModel {
	private static final long serialVersionUID = 1L;

	private Long id; // id
	private Date loginTime; // 登录时间
	private String employeeId; // 登录人Id
	private String employeeMobile; // 登录人手机号
	private String employeeName; // 登录人姓名
	private String ip;	//ip地址
	private String version; // APP版本号
	private String client; // 客户端
	private String platform; // 系统版本
	private String deviceId;//设备ID，用于单点登录
	private String loginType;//登录类型
	private String systemVersion;//系统版本号
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public String getPlatform() {
		return platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public String getSystemVersion() {
		return systemVersion;
	}
	public void setSystemVersion(String systemVersion) {
		this.systemVersion = systemVersion;
	}
}
