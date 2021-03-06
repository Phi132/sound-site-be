package music.Entity;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "createdBy")
	@CreatedBy
	private String createdBy;

	@Column(name = "createdDate")
	@CreatedDate
	private String createdDate;

	@Column(name = "modifielBy")
	@LastModifiedBy
	private String modifielBy;

	@Column(name = "modifielDate")
	@LastModifiedDate
	private String modifielDate;

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

	public String getModifielBy() {
		return modifielBy;
	}

	public void setModifielBy(String modifielBy) {
		this.modifielBy = modifielBy;
	}

	public String getModifielDate() {
		return modifielDate;
	}

	public void setModifielDate(String modifielDate) {
		this.modifielDate = modifielDate;
	}
}
