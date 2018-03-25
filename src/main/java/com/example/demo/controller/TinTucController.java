package com.example.demo.controller;






import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.example.demo.model.noiDung;
import com.example.demo.model.TinTuc;
import com.example.demo.service.TinTucService;
import com.example.demo.service.noidungService;;

@Controller
public class TinTucController {
	@Autowired
	private TinTucService employeeService;
	@Autowired
	private noidungService noidungndServices;

	@GetMapping("/tintuc")
	public String index(Model model) {
		
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(1));
		return "Homepage";
	}

	@GetMapping("/guest")
	public String indexg(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(1));
		return "Guest_homepag";
	}
	//about
	@GetMapping("/tintuc/about")
	public String indexa(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(2));
		return "about";
	}
	@GetMapping("/guest/about")
	public String indexga(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(2));
		return "guest_about";
	}
	//keynote
	@GetMapping("/tintuc/keynote")
	public String indexk(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(3));
		return "keynote";
	}
	@GetMapping("/guest/keynote")
	public String indexgk(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(3));
		return "guest_keynote";
	}
	//program
	@GetMapping("/tintuc/program")
	public String indexp(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(4));
		return "program";
	}
	@GetMapping("/guest/program")
	public String indexgp(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(4));
		return "guest_program";
	}
	//publication
	@GetMapping("/tintuc/publication")
	public String indexl(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(5));
		return "publication";
	}
	@GetMapping("/guest/publication")
	public String indexgl(Model model) {
		model.addAttribute("tintucs", employeeService.findAll());
		model.addAttribute("noidungs", noidungndServices.findOne(5));
		return "guest_puclication";
	}
	
	
	@GetMapping("/tintuc/create")
	public String create(Model model) {
		model.addAttribute("tintuc", new TinTuc());
		return "form";
	}
	@GetMapping("/tintuc/creatend")
	public String creatend(Model model) {
		model.addAttribute("noidung", new noiDung());
		return "formnd";
	}

	@GetMapping("/tintuc/{id}/edit")
	public String edit(@PathVariable int id, Model model) {
		model.addAttribute("tintuc", employeeService.findOne(id));
		return "form";
	}
	@GetMapping("/{id}editnd")
	public String editnd(@PathVariable int id, Model model) {
		model.addAttribute("noidung", noidungndServices.findOne(id));
		return "formnd";
	}
	@GetMapping("/shownews/{id}")
	public String editned(@PathVariable int id, Model model) {
		model.addAttribute("tintuc", employeeService.findOne(id));
		model.addAttribute("tintucs", employeeService.findAll());
		return "hientintuc";
	}
	@GetMapping("/shownewsa/{id}")
	public String editneda(@PathVariable int id, Model model) {
		model.addAttribute("tintuc", employeeService.findOne(id));
		model.addAttribute("tintucs", employeeService.findAll());
		return "showadmin";
	}
	///
	/*@GetMapping("/tintuc/eeditnd")
	public String editnd( Model model) {
		model.addAttribute("noidung", noidungndServices.findOne(1));
		return "formnd";
	}*/
	/*@GetMapping("/e{id}")
	public String editndw(@PathVariable int id, Model model) {
		model.addAttribute("noidung", noidungndServices.findOne(id));
		return "adpost";
	}*/

	@PostMapping("/tintuc/save")
	public String save(@Valid TinTuc tintuc, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "form";
		}
		employeeService.save(tintuc);
		redirect.addFlashAttribute("success", "Saved news successfully!");
		return "redirect:/tintuc";
	}
	@PostMapping("/tintuc/savend")
	public String savend(@Valid noiDung noidung, BindingResult result, RedirectAttributes redirect) {
		if (result.hasErrors()) {
			return "formnd";
		}
		noidungndServices.save(noidung);
		redirect.addFlashAttribute("success", "Saved news successfully!");
		return "redirect:/tintuc";
	}

	@GetMapping("/tintuc/{id}/delete")
	public String delete(@PathVariable int id, RedirectAttributes redirect) {
		employeeService.delete(id);
		redirect.addFlashAttribute("success", "Deleted news successfully!");
		return "redirect:/tintuc";
	}
	@GetMapping("/tintuc/{id}/deletend")
	public String deletend(@PathVariable int id, RedirectAttributes redirect) {
		noidungndServices.delete(id);
		redirect.addFlashAttribute("success", "Deleted news successfully!");
		return "redirect:/tintuc";
	}

	/*@GetMapping("/tintuc/search")
	public String search(@RequestParam("s") String s, Model model) {
		if (s.equals("")) {
			return "redirect:/tintuc";
		}

		model.addAttribute("tintucs", employeeService.search(s));
		return "list";
	}*/
	@GetMapping("/guest/login")
	public String login() {
		
		return "formlogin";
	}
}