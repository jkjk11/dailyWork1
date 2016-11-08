package exam_02_beans_xml_tag;

public class BookEntity {
	private String btitle;
	private String bauthor;
	
	public BookEntity(){
		//default 생성자 
	}

	//getter/setter 
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
