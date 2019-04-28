package DB;

public class Mad {

	private int id;
	private String navn;
	public Mad(int id, String navn) {
		super();
		this.id = id;
		this.navn = navn;

	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNavn() {
		return navn;
	}
	public void setNavn(String navn) {
		this.navn = navn;
	} 

@Override
public String toString() {
	return "mad [id=" + id + ", navn=" + navn + "]";
}
}