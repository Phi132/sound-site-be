package music.DTO;

import java.util.ArrayList;
import java.util.List;

public class Abstract<T> {
	private Long id;
	private String createdBy;
	private String createdDate;
	private String modifielDate;
	private String modifielBy;
	private List<T> listResult = new ArrayList<T>();

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifielDate() {
		return modifielDate;
	}

	public void setModifielDate(String modifielDate) {
		this.modifielDate = modifielDate;
	}

	public List<T> getListResult() {
		return listResult;
	}

	public void setListResult(List<T> listResult) {
		this.listResult = listResult;
	}

	public String getModifielBy() {
		return modifielBy;
	}

	public void setModifielBy(String modifielBy) {
		this.modifielBy = modifielBy;
	}

}
