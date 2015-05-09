package com.entity.user;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.entity.base.BaseEntity;
@Entity
@Table(name = "user_info", schema = "")
public class UserInfo extends BaseEntity{
	/**用户昵称**/
    private String userName;
    
    /**设备唯一id**/
    private String deviceId;
    
    /**账号密码**/
    private String userPassword;
    
    /**密码随机号**/
    private String randomPwd;
    
    /**用户性别 1:男，2女**/
    private Integer userSex;
    
    /**用户手机号码**/
    private String userPhone;
    
    /**用户邮箱**/
    private String userEmail;
    
    /**用户所在的城市**/
    private String city;
    
    /**用户所在的经度**/
    private String lat;
    
    /**用户所在的维度**/
    private String lng;
    
	@Column(name = "user_name",length = 36)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Column(name = "device_id",length = 36)
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	@Column(name = "user_pwd",length = 20)
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Column(name = "random_pwd",length = 8)
	public String getRandomPwd() {
		return randomPwd;
	}

	public void setRandomPwd(String randomPwd) {
		this.randomPwd = randomPwd;
	}

	@Column(name = "user_sex")
	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}
	@Column(name = "user_phone",length = 15)
	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	@Column(name = "user_email",length = 36)
	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	@Column(name = "city",length = 36)
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	@Column(name = "lat",length = 36)
	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
	@Column(name = "lng",length = 36)
	public String getLng() {
		return lng;
	}

	public void setLng(String lng) {
		this.lng = lng;
	}

   
	
}
