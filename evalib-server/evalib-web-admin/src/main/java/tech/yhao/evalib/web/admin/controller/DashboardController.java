package tech.yhao.evalib.web.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/admin")
@Controller
public class DashboardController {

	@RequestMapping(value = { "", "/", "dashboard" })
	public String dashboard() {
		return "/dashboard/dashboard";
	}
}
