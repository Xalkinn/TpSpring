package Class;

import java.util.List;

public class MyObject {
	Integer id;
	String name;
	MyObject parents;
	List<String> keywords;
	
	public MyObject(Integer id, String name, MyObject parents, List<String> keywords) {
		this.id = id;
		this.name = name;
		this.parents = parents;
		this.keywords = keywords;
	}

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

	public MyObject getParents() {
		return parents;
	}

	public void setParents(MyObject parents) {
		this.parents = parents;
	}

	public List<String> getKeywords() {
		return keywords;
	}

	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}
}
