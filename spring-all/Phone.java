package baeldung_article_constructor;

public class Phone {
	private OS my_OS;
	private String model;
	public Phone(OS inp_OS, String model){
		this.my_OS=inp_OS;
		this.model= model;
	}
	public void get_OS(){
		System.out.println("You are running " + model + " version: " + my_OS.getVersion());
	}
}
