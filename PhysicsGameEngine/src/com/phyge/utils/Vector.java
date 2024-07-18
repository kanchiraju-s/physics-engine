package com.phyge.utils;

public class Vector {
	private float x;
	private float y;
	private float z;
	
	public Vector() {
		x=0;
		y=0;
		z=0;
	}
	public Vector(float x,float y,float z) {
		this.x=x;
		this.y=y;
		this.z=z;
	}
	
	
	public void invert() {
		x=-x;
		y=-y;
		z=-z;
	}
	
}
