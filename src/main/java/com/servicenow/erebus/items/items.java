package com.servicenow.erebus.items;

import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class items implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private Long id;

	@Version
    @Column(name = "version", columnDefinition = "integer DEFAULT 0", nullable = false)
	private int version;

	@Column(name = "theme", nullable = false)
	private String theme;

	@Column(name = "caption", nullable = false)
	private String caption;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "rank", nullable = false)
	private int rank;

	@Column(name = "trivia", nullable = false, length = 512)
	private String trivia;

	@Column(name = "filename", nullable = false)
	private String filename;

	@Column(name = "created")
	private java.sql.Date created;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof items)) {
			return false;
		}
		items other = (items) obj;
		if (id != null) {
			if (!id.equals(other.id)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getCaption() {
		return caption;
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getTrivia() {
		return trivia;
	}

	public void setTrivia(String trivia) {
		this.trivia = trivia;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public java.sql.Date getCreated() {
		return created;
	}

	public void setCreated(java.sql.Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		String result = getClass().getSimpleName() + " ";
		if (id != null)
			result += "id: " + id;
		result += ", version: " + version;
		if (theme != null)
			result += ", theme: " + theme;
		if (caption != null)
			result += ", caption: " + caption;
		if (name != null)
			result += ", name: " + name;
		result += ", rank: " + rank;
		if (trivia != null)
			result += ", trivia: " + trivia;
		if (filename != null)
			result += ", filename: " + filename;
		if (created != null)
			result += ", created: " + created;
		return result;
	}
}