package loans.reports.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import loans.reports.service.BusinessReportService;

@RestController
@RequestMapping(path = "/api/services/reports/business", consumes = "application/json")
public class BusinessReportsController {
	
	@Autowired
	private BusinessReportService busRptSvc;

	@RequestMapping(path = "generate-monthly-risk-report")
	public ResponseEntity<String> generateBusinessMontlyRiskReport(@PathVariable Long businessPk) {
		return ResponseEntity.ok("");
	}
}
