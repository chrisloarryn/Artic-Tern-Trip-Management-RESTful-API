package com.articTern.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Report {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer reportId;
	
	@NotNull(message = "Report Name Can't be null.")
	@NotBlank(message = "Report Name Can't be Blank.")
	@NotEmpty (message = "Report Name Can't be Empty.")
	private String reportName;
	
	@NotNull(message="ReportType can't be null")
	private String reportType;
	
	@NotNull(message="Report Description can't be null")
	@NotBlank(message = "Report Description Can't be Blank.")
	@NotEmpty (message = "Report Description Can't be Empty.")
	private String reportDescription;

}
