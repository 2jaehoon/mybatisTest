package kr.co.sist.domain;


public class CarDomain {
	private String model, car_year, car_option, car_img, hiredate, country, maker;
	private int price, cc;
	
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCar_year() {
		return car_year;
	}
	public void setCar_year(String car_year) {
		this.car_year = car_year;
	}
	public String getCar_option() {
		return car_option;
	}
	public void setCar_option(String car_option) {
		this.car_option = car_option;
	}
	public String getCar_img() {
		return car_img;
	}
	public void setCar_img(String car_img) {
		this.car_img = car_img;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	
	@Override
	public String toString() {
		return "CarDomain [model=" + model + ", car_year=" + car_year + ", car_option=" + car_option + ", car_img="
				+ car_img + ", hiredate=" + hiredate + ", country=" + country + ", maker=" + maker + ", price=" + price
				+ ", cc=" + cc + "]";
	}
	
	
	
	
}
