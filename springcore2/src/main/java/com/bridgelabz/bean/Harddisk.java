package com.bridgelabz.bean;

import com.bridgelabz.service.Storage;

public class Harddisk implements Storage 
{
private String capacity;

public String getCapacity() {
	return capacity;
}

public void setCapacity(String capacity) {
	this.capacity = capacity;
}
}
