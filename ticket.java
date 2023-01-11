package com.gl.TicketTrackerApplication.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "Tickets")

public class Ticket {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Ticket_Title", nullable = false)
	private String ticketTitle;

	@Column(name = "Short_Desc")
	private String shortDesc;

	@Column(name = "Content")
	private String content;

	
	@Temporal(TemporalType.TIMESTAMP)
	@Column (name = "Ticket_Creation_date")
	private Date ticketCreationDate;
	
	public Ticket() {

	}

	public Ticket(Long id, String ticketTitle, String shortDesc, String content, Date ticketCreationDate) {
		super();
		this.id = id;
		this.ticketTitle = ticketTitle;
		this.shortDesc = shortDesc;
		this.content = content;
		this.ticketCreationDate = ticketCreationDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTicketTitle() {
		return ticketTitle;
	}

	public void setTicketTitle(String ticketTitle) {
		this.ticketTitle = ticketTitle;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getTicketCreationDate() {
		return ticketCreationDate;
	}

	public void setTicketCreationDate(Date ticketCreationDate) {
		this.ticketCreationDate = ticketCreationDate;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticketTitle=" + ticketTitle + ", shortDesc=" + shortDesc + ", content=" + content
				+ ", ticketCreationDate=" + ticketCreationDate + "]";
	}

		
	
	}
