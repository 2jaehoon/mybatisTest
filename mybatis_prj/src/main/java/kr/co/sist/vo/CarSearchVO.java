package kr.co.sist.vo;

public class CarSearchVO {
	private String car_option, car_img;

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

	@Override
	public String toString() {
		return "CarSearchVO [car_option=" + car_option + ", car_img=" + car_img + "]";
	}
	
	
}
