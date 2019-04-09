package org.dhananjay.programming;
import java.util.List;
public class Movie {
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public int getPer_page() {
		return per_page;
	}
	public void setPer_page(int per_page) {
		this.per_page = per_page;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_pages() {
		return total_pages;
	}
	public void setTotal_pages(int total_pages) {
		this.total_pages = total_pages;
	}
	public List<Details> getData() {
		return data;
	}
	public void setData(List<Details> data) {
		this.data = data;
	}
	String page;
	int per_page;
	int total;
	int total_pages;
	List<Details> data;

}

class Details {
	
	String Poster;
	public String getPoster() {
		return Poster;
	}
	public void setPoster(String poster) {
		Poster = poster;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getImdbID() {
		return imdbID;
	}
	public void setImdbID(String imdbID) {
		this.imdbID = imdbID;
	}
	String Title;
	String Type;
	int Year;
	String imdbID;
}
