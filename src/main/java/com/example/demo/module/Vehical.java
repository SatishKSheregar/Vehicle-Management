package com.example.demo.module;

import jakarta.persistence.*;

@Entity
public class Vehical {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vid;
	private String vname;
	private double vprize;
	private String vmodule;
	private String vcolor;
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}
	public double getVprize() {
		return vprize;
	}
	public void setVprize(double vprize) {
		this.vprize = vprize;
	}
	public String getVmodule() {
		return vmodule;
	}
	public void setVmodule(String vmodule) {
		this.vmodule = vmodule;
	}
	public String getVcolor() {
		return vcolor;
	}
	public void setVcolor(String vcolor) {
		this.vcolor = vcolor;
	}
	@Override
	public String toString() {
		return "Vehical [vid=" + vid + ", vname=" + vname + ", vprize=" + vprize + ", vmodule=" + vmodule + ", vcolor="
				+ vcolor + "]";
	}
	
	
}
