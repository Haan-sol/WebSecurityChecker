package dto;

public class Menu_dto {
	int id;
	String type;
	String name;
	int price;
	String location;
	boolean single;
	boolean delivery;
	int portion;
	String phone;
	String adress;
	String imgFile;
	int victory;
	
	
	


	public Menu_dto(int id, String type, String name, int price, String location, boolean single, boolean delivery,
			int portion, String phone, String adress, String imgFile, int victory) {
		super();
		this.id = id;
		this.type = type;
		this.name = name;
		this.price = price;
		this.location = location;
		this.single = single;
		this.delivery = delivery;
		this.portion = portion;
		this.phone = phone;
		this.adress = adress;
		this.imgFile = imgFile;
		this.victory = victory;
	}

	public Menu_dto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isSingle() {
		return single;
	}

	public void setSingle(boolean single) {
		this.single = single;
	}

	public boolean isDelivery() {
		return delivery;
	}

	public void setDelivery(boolean delivery) {
		this.delivery = delivery;
	}

	public int getPortion() {
		return portion;
	}

	public void setPortion(int portion) {
		this.portion = portion;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getImgFile() {
		return imgFile;
	}

	public void setImgFile(String imgFile) {
		this.imgFile = imgFile;
	}

	public int getVictory() {
		return victory;
	}

	public void setVictory(int victory) {
		this.victory = victory;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}


