package br.edu.ufam.icomp.lab_encapsulamento;

public class Posicao {
	private double latitude;
	private double longitude;
	private double altitude;
	
	public Posicao(double latitude, double longitude, double altitude){
		this.latitude = latitude;
		this.longitude = longitude;
		this.altitude = altitude;
	}
	
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	
	public void setAltitude(double altitude) {
		this.altitude = altitude;
	}
	
	public double getAltitude() {
		return this.altitude;
	}
	
	public String toString() {
		String desc = "";
		
		desc = "Posição: " +String.valueOf(this.latitude)+ ", " + String.valueOf(this.longitude)+ ", " + String.valueOf(this.altitude) ;
		
		return desc;
	}
}
