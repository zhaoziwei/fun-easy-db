package com.entity.device;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.entity.base.BaseEntity;
@Entity
@Table(name = "device", schema = "")
public class Device extends BaseEntity{
	/**设备号**/
   private String deviceId;
   
	@Column(name = "device_id",length = 36)
	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
}
