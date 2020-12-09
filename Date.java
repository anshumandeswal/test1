public class Mydate {
	private int day;
	private int month;
	private int year;
	
	public Mydate() {
		day = 21;
		month = 11;
		year = 2020;
		System.out.println(day+"/"+month + "/" +year);
	}
	
	public int getDay() {
		return day;
	}
	
	public void setday(int d) {
		this.day = d;
	}
	public int getMonth() {
		return month;
	}
	
	public void setmonth(int m) {
		this.month = m;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setyear(int y) {
		this.year = y;
	}
	
	public Mydate(int day, int month, int year) {
		this.day = day;
		this.month= month;
		this.year = year;
		
	}
	
	
	@Override
	public String toString() {
		return "Mydate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	public void display() {
		System.out.println(day + "/" + month + "/" + year);
	}
	
	public static void main(String[] args) {
		Mydate m = new Mydate();
		m.setday(17);
		m.setmonth(11);
		m.setyear(2020);
		m.display();
	}

}
