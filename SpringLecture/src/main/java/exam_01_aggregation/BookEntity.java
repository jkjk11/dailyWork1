package exam_01_aggregation;

//DTO를 만들 수 있는 DTO Class 
//Database를 근간으로 해서 만듬 
public class BookEntity {
	
	//private: data를 안으로 숨길 수 있음. private이기 때문에 외부와 공유하기 위해 getter, setter가 필요
	private String bisbn; //db의 컬럼명과 일치시키는 것이 좋음
	private String btitle;
	private String bauthor;
	private int bprice;
	
	public BookEntity(){
		//default 생성자 
	}
	
	//getter/setter 
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

	public int getBprice() {
		return bprice;
	}

	public void setBprice(int bprice) {
		this.bprice = bprice;
	}
	
}
