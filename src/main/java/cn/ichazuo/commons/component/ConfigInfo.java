package cn.ichazuo.commons.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import cn.ichazuo.commons.util.StringUtils;

/**
 * @ClassName: ConfigInfo
 * @Description: (配置信息)
 * @author ZhaoXu
 * @date 2015年7月18日 下午10:06:02
 * @version V1.0
 */
@Component("configInfo")
public class ConfigInfo {

	/**
	 * 环信测试appKey
	 */
	@Value("${im.test.appkey}")
	private String imTestAppKey;
	/**
	 * 环信测试clientId
	 */
	@Value("${im.test.clientid}")
	private String imTestClientId;

	/**
	 * 环信测试clientSecret
	 */
	@Value("${im.test.clientsecret}")
	private String imTestclientSecret;

	/**
	 * cookie角色
	 */
	@Value("${project.admin.cookie.role}")
	private String cookieRole;

	/**
	 * cookie真实姓名
	 */
	@Value("${project.admin.cookie.realName}")
	private String cookieRealName;

	/**
	 * cookie用户
	 */
	@Value("${project.admin.cookie.user}")
	private String cookieUser;

	/**
	 * 项目名称
	 */
	@Value("${project.name}")
	private String projectName;

	/**
	 * 项目是否测试环境
	 */
	@Value("${project.test}")
	private String projectTest;

	/**
	 * 项目标题
	 */
	@Value("${project.title}")
	private String projectTitle;

	/**
	 * 登录用户cookie名称
	 */
	@Value("${project.admin.cookie}")
	private String cookieName;

	/**
	 * cookie登录名
	 */
	@Value("${project.admin.cookie.account}")
	private String cookieAccount;

	/**
	 * 是否开启缓存
	 */
	@Value("${project.cache}")
	private String projectCache;

	/**
	 * 项目图片URl
	 */
	@Value("${project.image.url}")
	private String imageUrl;

	/**
	 * 课程默认图片
	 */
	@Value("${project.course.default.image}")
	private String courseDefaultImage;

	/**
	 * 图片保存路径
	 */
	@Value("${upload.path}")
	private String uploadPath;

	/**
	 * 短信服务器地址
	 */
	@Value("${sms.rest.url}")
	private String smsRestUrl;

	/**
	 * 短信sid
	 */
	@Value("${sms.account.sid}")
	private String smsAccountSid;

	/**
	 * 短信token
	 */
	@Value("${sms.auth.token}")
	private String smsToken;

	/**
	 * 短信app id
	 */
	@Value("${sms.app.id}")
	private String smsAppId;

	/**
	 * 短信服务器版本
	 */
	@Value("${sms.version}")
	private String smsVersion;

	/**
	 * 短信模板IDsms.template.id
	 */
	@Value("${sms.template.id}")
	private String smsTemplateId;

	/**
	 * 即时通讯 chazuo appkey
	 */
	@Value("${im.chazuo.appkey}")
	private String imChaZuoAppKey;

	/**
	 * 即时通讯 chazuo clientId
	 */
	@Value("${im.chazuo.clientid}")
	private String imChaZuoClientId;

	/**
	 * 即时通讯 chazuo ClientSecret
	 */
	@Value("${im.chazuo.clientsecret}")
	private String imChaZuoClientSecret;

	/**
	 * 即时通讯 gugu appkey
	 */
	@Value("${im.gugu.appkey}")
	private String imGuGuAppKey;

	/**
	 * 即时通讯 gugu clientId
	 */
	@Value("${im.gugu.clientid}")
	private String imGuGuClientId;

	/**
	 * 即时通讯 gugu ClientSecret
	 */
	@Value("${im.gugu.clientsecret}")
	private String imGuGuClientSecret;

	/**
	 * 短信宝账户
	 */
	@Value("${sms.duanxinbao.username}")
	private String duanxinbaoUserName;

	/**
	 * 短信宝密码
	 */
	@Value("${sms.duanxinbao.password}")
	private String duanxinbaoPassword;

	/**
	 * 支付宝pid
	 */
	@Value("${alipay.partner}")
	private String aliPayPartner;

	/**
	 * 支付宝商户私钥
	 */
	@Value("${alipay.privatekey}")
	private String aliPayprivateKey;

	/**
	 * 极光推送 插坐学院 appKey
	 */
	@Value("${jpush.ichazuo.appkey}")
	private String jpushChaZuoAppKey;

	/**
	 * 极光推送 插座学院 secret
	 */
	@Value("${jpush.ichazuo.secret}")
	private String jpushChaZuoSecret;

	/**
	 * 极光推送 咕咕 appKey
	 */
	@Value("${jpush.gugu.appkey}")
	private String jpushGuGuAppKey;

	/**
	 * 极光推送 咕咕 secret
	 */
	@Value("${jpush.gugu.secret}")
	private String jpushGuGuSecret;

	/**
	 * ios版本信息
	 */
	@Value("${ios.version}")
	private String iosVersion;
	/**
	 * 企业ios版本信息
	 */
	@Value("${business.ios.version}")
	private String bIosVersion;
	
	/**
	 * 企业android版本信息
	 */
	@Value("${business.android.version}")
	private String bAndroidVersion;

	/**
	 * 微信测试回调地址
	 */
	@Value("${wx.test.result.url}")
	private String wxTestRestUrl;

	/**
	 * 微信正式回调地址
	 */
	@Value("${wx.pro.result.url}")
	private String wxProRestUrl;
	
	/**
	 * 微信测试回调地址
	 */
	@Value("${wx.test.gift.url}")
	private String wxTestGiftUrl;

	/**
	 * 微信正式回调地址
	 */
	@Value("${wx.pro.gift.url}")
	private String wxProGiftUrl;

	/**
	 * 微信众筹测试地址
	 */
	@Value("${wx.test.crowd.url}")
	private String wxCrowdTestUrl;

	/**
	 * 微信众筹正式地址
	 */
	@Value("${wx.pro.crowd.url}")
	private String wxCrowdProUrl;

	/**
	 * 百度支付测试地址
	 */
	@Value("${baidu.pay.test.url}")
	private String baiduTestUrl;

	/**
	 * 百度支付正式地址
	 */
	@Value("${baidu.pay.pro.url}")
	private String baiduProUrl;

	/**
	 * 百度众筹支付测试地址
	 */
	@Value("${baidu.crowd.test.url}")
	private String baiduCrowdTestUrl;

	/**
	 * 百度众筹支付正式地址
	 */
	@Value("${baidu.crowd.pro.url}")
	private String baiduCrowdProUrl;
	
	/**
	 * 线上课程微信支付测试回调
	 */
	@Value("${wx.test.online.url}")
	private String weixinTestOnlineOrderUrl;
	
	/**
	 * 线上课程微信支付正式回调
	 */
	@Value("${wx.pro.online.url}")
	private String weixinProOnlineOrderUrl;

	/* ------------ getMethods ------------ */

	/**
	 * 
	 * @Title: getProjectName
	 * @Description: (获得项目名称)
	 * @return
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * 
	 * @Title: getProjectTitle
	 * @Description: (获得项目标题)
	 * @return
	 */
	public String getProjectTitle() {
		return projectTitle;
	}

	/**
	 * 
	 * @Title: getImageUrl
	 * @Description: (获得图片URl)
	 * @return
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * 
	 * @Title: getUploadPath
	 * @Description: (获得图片保存路径)
	 * @return
	 */
	public String getUploadPath() {
		return uploadPath;
	}

	/**
	 * @Title: getSmsRestUrl
	 * @Description: (获得短信服务器地址)
	 * @return
	 * @author ZhaoXu
	 */
	public String getSmsRestUrl() {
		return smsRestUrl;
	}

	/**
	 * @Title: getSmsAccountSid
	 * @Description: (获得短信sid)
	 * @return
	 * @author ZhaoXu
	 */
	public String getSmsAccountSid() {
		return smsAccountSid;
	}

	/**
	 * @Title: getSmsToken
	 * @Description: (获得短信token)
	 * @return
	 * @author ZhaoXu
	 */
	public String getSmsToken() {
		return smsToken;
	}

	/**
	 * @Title: getSmsAppId
	 * @Description: (获得短信appId)
	 * @return
	 * @author ZhaoXu
	 */
	public String getSmsAppId() {
		return smsAppId;
	}

	/**
	 * @Title: getSmsVersion
	 * @Description: (获得短信服务器版本)
	 * @return
	 * @author ZhaoXu
	 */
	public String getSmsVersion() {
		return smsVersion;
	}

	/**
	 * @Title: getSmsTemplateId
	 * @Description: (获得短信模板ID)
	 * @return
	 * @author ZhaoXu
	 */
	public String getSmsTemplateId() {
		return smsTemplateId;
	}

	/**
	 * @Title: getImChaZuoAppKey
	 * @Description: (获取即时通讯 chazuo appkey)
	 * @return
	 * @author ZhaoXu
	 */
	public String getImChaZuoAppKey() {
		return imChaZuoAppKey;
	}

	/**
	 * @Title: getImChaZuoClientId
	 * @Description: (获取即时通讯 chazuo clientId)
	 * @return
	 * @author ZhaoXu
	 */
	public String getImChaZuoClientId() {
		return imChaZuoClientId;
	}

	/**
	 * @Title: getImChaZuoClientSecret
	 * @Description: (获取即时通讯 chazuo clientSecret)
	 * @return
	 * @author ZhaoXu
	 */
	public String getImChaZuoClientSecret() {
		return imChaZuoClientSecret;
	}

	/**
	 * @Title: getImGuGuAppKey
	 * @Description: (获取即时通讯 gugu appKey)
	 * @return
	 * @author ZhaoXu
	 */
	public String getImGuGuAppKey() {
		return imGuGuAppKey;
	}

	/**
	 * @Title: getImGuGuClientId
	 * @Description: (获取即时通讯 gugu clientId)
	 * @return
	 * @author ZhaoXu
	 */
	public String getImGuGuClientId() {
		return imGuGuClientId;
	}

	/**
	 * @Title: getImGuGuClientSecret
	 * @Description: (获取即时通讯 gugu clientSecret)
	 * @return
	 * @author ZhaoXu
	 */
	public String getImGuGuClientSecret() {
		return imGuGuClientSecret;
	}

	/**
	 * @Title: getProjectTest
	 * @Description: (获取项目是否为测试环境)
	 * @return
	 * @author ZhaoXu
	 */
	public boolean getProjectTest() {
		if (StringUtils.isNullOrEmpty(projectTest)) {
			return true;
		}
		return Boolean.valueOf(projectTest);
	}

	/**
	 * @Title: getProjectCache
	 * @Description: (获取项目是否开启缓存)
	 * @return
	 * @author ZhaoXu
	 */
	public boolean getProjectCache() {
		if (StringUtils.isNullOrEmpty(projectCache)) {
			return false;
		}
		return Boolean.valueOf(projectCache);
	}

	/**
	 * @Title: getAliPayPartner
	 * @Description: (获取支付宝pid)
	 * @return
	 * @author ZhaoXu
	 */
	public String getAliPayPartner() {
		return aliPayPartner;
	}

	/**
	 * @Title: getAliPayprivateKey
	 * @Description: (获取支付宝私钥)
	 * @return
	 * @author ZhaoXu
	 */
	public String getAliPayprivateKey() {
		return aliPayprivateKey;
	}

	/**
	 * @Title: getCookieName
	 * @Description: (获得cookieName)
	 * @return
	 */
	public String getCookieName() {
		return cookieName;
	}

	/**
	 * @Title: getJpushChaZuoAppKey
	 * @Description: (获得极光推送 插坐学院 appKey)
	 * @return
	 */
	public String getJpushChaZuoAppKey() {
		return jpushChaZuoAppKey;
	}

	/**
	 * @Title: getJpushChaZuoSecret
	 * @Description: (获得极光推送 插座学院 secret)
	 * @return
	 */
	public String getJpushChaZuoSecret() {
		return jpushChaZuoSecret;
	}

	/**
	 * @Title: getJpushGuGuAppKey
	 * @Description: (获得极光推送 咕咕 appKey)
	 * @return
	 */
	public String getJpushGuGuAppKey() {
		return jpushGuGuAppKey;
	}

	/**
	 * @Title: getjPushGuGuSecret
	 * @Description: (获得极光推送 咕咕 secret)
	 * @return
	 */
	public String getJpushGuGuSecret() {
		return jpushGuGuSecret;
	}

	/**
	 * @Title: getCourseDefaultImage
	 * @Description: (获得课程默认图片)
	 * @return
	 */
	public String getCourseDefaultImage() {
		return courseDefaultImage;
	}

	/**
	 * @Title: getImTestclientSecret
	 * @Description: (获得环信测试Secret)
	 * @return
	 */
	public String getImTestclientSecret() {
		return imTestclientSecret;
	}

	/**
	 * @Title: getImTestClientId
	 * @Description: (获得环信测试ClientId)
	 * @return
	 */
	public String getImTestClientId() {
		return imTestClientId;
	}

	/**
	 * @Title: getImTestAppKey
	 * @Description: (获得环信测试AppKey)
	 * @return
	 */
	public String getImTestAppKey() {
		return imTestAppKey;
	}

	/**
	 * @Title: getCookieRole
	 * @Description: (获得Cookie角色)
	 * @return
	 */
	public String getCookieRole() {
		return cookieRole;
	}

	/**
	 * @Title: getCookieRealName
	 * @Description: (获得cookie真实姓名)
	 * @return
	 */
	public String getCookieRealName() {
		return cookieRealName;
	}

	/**
	 * @Title: getCookieUser
	 * @Description: (获得cookie用户)
	 * @return
	 */
	public String getCookieUser() {
		return cookieUser;
	}

	/**
	 * @Title: getCookieAccount
	 * @Description: (获得cookie登录名)
	 * @return
	 */
	public String getCookieAccount() {
		return cookieAccount;
	}

	/**
	 * @Title: getIosVersion
	 * @Description: (获得ios版本)
	 * @return
	 */
	public String getIosVersion() {
		return iosVersion;
	}
	/**
	 * @Title: getBusinessIosVersion
	 * @Description: (获得企业版ios版本)
	 * @return
	 */
	public String getBusinessIosVersion() {
		return bIosVersion;
	}
	
	/**
	 * @Title: getBusinessAndroidVersion
	 * @Description: (获得企业版android版本)
	 * @return
	 */
	public String getBusinessAndroidVersion() {
		return bAndroidVersion;
	}

	/**
	 * @Title: getDuanxinbaoUserName
	 * @Description: (获得短信宝账号)
	 * @return
	 */
	public String getDuanxinbaoUserName() {
		return duanxinbaoUserName;
	}

	/**
	 * @Title: getDuanxinbaoPassword
	 * @Description: (获得短信宝密码)
	 * @return
	 */
	public String getDuanxinbaoPassword() {
		return duanxinbaoPassword;
	}

	/**
	 * @Title: getWxTestRestUrl
	 * @Description: (获得微信测试回调)
	 * @return
	 */
	public String getWxTestRestUrl() {
		return wxTestRestUrl;
	}
	/**
	 * @Title: getWxTestGiftUrl
	 * @Description: (获得微信测试回调)
	 * @return
	 */
	public String getWxTestGiftUrl() {
		return wxTestGiftUrl;
	}

	/**
	 * @Title: getWxProRestUrl
	 * @Description: (获得微信正式回调)
	 * @return
	 */
	public String getWxProRestUrl() {
		return wxProRestUrl;
	}
	/**
	 * @Title: getWxProGiftUrl
	 * @Description: (获得微信正式回调)
	 * @return
	 */
	public String getWxProGiftUrl() {
		return wxProGiftUrl;
	}

	/**
	 * @Title: getWxCrowdTestUrl
	 * @Description: (获得众筹测试地址)
	 * @return
	 */
	public String getWxCrowdTestUrl() {
		return wxCrowdTestUrl;
	}

	/**
	 * @Title: getWxCrowdProUrl
	 * @Description: (获得众筹正式地址)
	 * @return
	 */
	public String getWxCrowdProUrl() {
		return wxCrowdProUrl;
	}

	/**
	 * @Title: getBaiduTestUrl
	 * @Description: (获得百度支付测试回调地址)
	 * @return
	 */
	public String getBaiduTestUrl() {
		return baiduTestUrl;
	}

	/**
	 * @Title: getBaiduProUrl
	 * @Description: (获得百度支付正式回调地址)
	 * @return
	 */
	public String getBaiduProUrl() {
		return baiduProUrl;
	}

	/**
	 * @Title: getBaiduCrowdTestUrl
	 * @Description: (获得百度众筹支付测试地址)
	 * @return
	 */
	public String getBaiduCrowdTestUrl() {
		return baiduCrowdTestUrl;
	}

	/**
	 * @Title: getBaiduCrowdProUrl
	 * @Description: (获得百度众筹支付正式地址)
	 * @return
	 */
	public String getBaiduCrowdProUrl() {
		return baiduCrowdProUrl;
	}

	/**
	 * @Title: getWeixinTestOnlineOrderUrl 
	 * @Description: (获得微信支付线上课程测试回调) 
	 * @return
	 */
	public String getWeixinTestOnlineOrderUrl() {
		return weixinTestOnlineOrderUrl;
	}

	/**
	 * @Title: getWeixinProOnlineOrderUrl 
	 * @Description: (获得微信支付线上课程正式回调) 
	 * @return
	 */
	public String getWeixinProOnlineOrderUrl() {
		return weixinProOnlineOrderUrl;
	}

}
