package Class;

import java.util.List;

public class MyObject {
	Integer id;
	String name;
	MyObject parent;
	List<String> keywords;
		
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MyObject getParent() {
		return parent;
	}

	public void setParent(MyObject parents) {
		this.parent = parents;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}
