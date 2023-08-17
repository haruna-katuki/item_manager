package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.form.ItemForm;

@Controller
@RequestMapping("/item")
public class ItemController {

	// 商品一覧の表示
	@GetMapping
	public String index(Model model) {
		return "item/index";
	}

	//	商品登録ページ表示用
	@GetMapping("toroku")
	public String tourokuPage(@ModelAttribute("itemForm") ItemForm itemForm) {
		return "item/torokuPage";
	}

	// 商品登録の実行
	@PostMapping("toroku")
	public String toroku(ItemForm itemForm) {
		return "redirect:/item";
	}

}
