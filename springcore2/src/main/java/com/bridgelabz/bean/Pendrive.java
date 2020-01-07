package com.bridgelabz.bean;

import com.bridgelabz.service.Storage;

public class Pendrive implements Storage {
	
private Storage Harddisk;	
public Storage getHarddisk() {
	return Harddisk;
}

public void setHarddisk(Storage harddisk) {
	Harddisk = harddisk;
}

private String capacity;

public String getCapacity() {
	return capacity;
}

public void setCapacity(String capacity) {
	this.capacity = capacity;
}
}
