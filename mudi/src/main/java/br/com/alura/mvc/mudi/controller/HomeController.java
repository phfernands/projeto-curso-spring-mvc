package br.com.alura.mvc.mudi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomePedido("Xiaomi Redmi Note 8");
		pedido.setUrlImagem("https://images-americanas.b2w.io/produtos/4284208283/imagens/xiaomi-redmi-note-8-dual-sim-64-gb-neptune-blue-4-gb-ram/4284208283_1_xlarge.jpg");
		pedido.setUrlDoProduto("https://www.americanas.com.br/produto/4284208283?epar=bp_pl_00_go_tel_pmax_acessorios&opn=YSMESP&WT.srch=1&offerId=618669c1d9fd6edeecb48dbc&gclid=Cj0KCQjwof6WBhD4ARIsAOi65ajuZYAcJCAUgFBDFQvpS8ZKd16rIW3ccB_lKao4o6a0W4X8im59DOIaAuviEALw_wcB");
		pedido.setDescricao("Aparelho que já foi custo-benefico");
		
		List<Pedido> pedidos = Arrays.asList(pedido);
		model.addAttribute("pedidos", pedidos);
		
		return "home";
	}

}
