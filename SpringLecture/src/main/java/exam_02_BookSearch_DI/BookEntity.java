package exam_02_BookSearch_DI;

public class BookEntity {
	
	private String bisbn;
	private String btitle;
	private String bauthor;
	
	public BookEntity(){ //dafault 생성자 
		
	}

	public String getBisbn() {
		return bisbn;
	}

	public void setBisbn(String bisbn) {
		this.bisbn = bisbn;
	}

	public String getBtitle() {
		return btitle;
	}

	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	
	
}
