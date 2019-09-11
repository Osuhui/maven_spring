package com.huiwl.dto;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userDto")
public class User {

	@Value("123")
	private String id;
	private String name;
	private String password;
	private Array arrayDate;
	private List<String> listDate;
	private Map<String, String> mapDate;
	private Set<String> setDate;
	private Properties propDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Array getArrayDate() {
		return arrayDate;
	}

	public void setArrayDate(Array arrayDate) {
		this.arrayDate = arrayDate;
	}

	public List<String> getListDate() {
		return listDate;
	}

	public void setListDate(List<String> listDate) {
		this.listDate = listDate;
	}

	public Map<String, String> getMapDate() {
		return mapDate;
	}

	public void setMapDate(Map<String, String> mapDate) {
		this.mapDate = mapDate;
	}

	public Set<String> getSetDate() {
		return setDate;
	}

	public void setSetDate(Set<String> setDate) {
		this.setDate = setDate;
	}

	public Properties getPropDate() {
		return propDate;
	}

	public void setPropDate(Properties propDate) {
		this.propDate = propDate;
	}

	@Override
	public String toString() {
		return "User [\nid=" + id + "\nname=" + name + "\npassword=" + password + "]";
	}

}
