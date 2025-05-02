package com.mh.dto.gogi;

public class Gogi_info {
	private int id;
	private String name;
	private int weight;
	private String origin;
	private int price;
	private String part;
	private String usage_type;
	private String storage;
	private int shipping_fee;
	private int is_event;
	private String grade;
	private String description;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	public String getUsage_type() {
		return usage_type;
	}
	public void setUsage_type(String usage_type) {
		this.usage_type = usage_type;
	}
	public String getStorage() {
		return storage;
	}
	public void setStorage(String storage) {
		this.storage = storage;
	}
	public int getShipping_fee() {
		return shipping_fee;
	}
	public void setShipping_fee(int shipping_fee) {
		this.shipping_fee = shipping_fee;
	}
	public int getIs_event() {
		return is_event;
	}
	public void setIs_event(int is_event) {
		this.is_event = is_event;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Gogi_info [id=" + id + ", name=" + name + ", weight=" + weight + ", origin=" + origin + ", price="
				+ price + ", part=" + part + ", usage_type=" + usage_type + ", storage=" + storage + ", shipping_fee="
				+ shipping_fee + ", is_event=" + is_event + ", grade=" + grade + ", description=" + description
				+ ", getId()=" + getId() + ", getName()=" + getName() + ", getWeight()=" + getWeight()
				+ ", getOrigin()=" + getOrigin() + ", getPrice()=" + getPrice() + ", getPart()=" + getPart()
				+ ", getUsage_type()=" + getUsage_type() + ", getStorage()=" + getStorage() + ", getShipping_fee()="
				+ getShipping_fee() + ", getIs_event()=" + getIs_event() + ", getGrade()=" + getGrade()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
