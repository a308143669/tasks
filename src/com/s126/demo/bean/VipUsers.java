package com.s126.demo.bean;

import java.util.Date;

public class VipUsers {
	private Integer item_id;	//��Ʒ���	number
	private String item_name;	//��Ʒ����	varchar2
	private Integer item_price;	//��Ʒ�۸�	number(9,2)
	private Date create_time;	//���ʱ��	datetime
	private Integer status;		//��Ʒ״̬	number
	public Integer getItem_id() {
		return item_id;
	}
	public void setItem_id(Integer item_id) {
		this.item_id = item_id;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Integer getItem_price() {
		return item_price;
	}
	public void setItem_price(Integer item_price) {
		this.item_price = item_price;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "VipUsers [item_id=" + item_id + ", item_name=" + item_name + ", item_price=" + item_price
				+ ", create_time=" + create_time + ", status=" + status + "]";
	}
	
	

}	
