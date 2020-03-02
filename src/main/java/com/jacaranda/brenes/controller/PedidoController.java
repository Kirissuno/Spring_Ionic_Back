package com.jacaranda.brenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jacaranda.brenes.model.dto.PedidoDTO;
import com.jacaranda.brenes.service.PedidoService;

@RestController
@CrossOrigin(origins = "http://localhost:8100")
@RequestMapping("/")
public class PedidoController {

	@Autowired
	private PedidoService pedidoService;
	
	@GetMapping("/orders")
	public List<PedidoDTO> getAll(){
		return pedidoService.getAll();
	}
	
	@GetMapping("/order/{id}")
	public PedidoDTO getPedidoByID(@PathVariable Integer id) {
		return pedidoService.getPedidoByID(id);
	}
	
	@PostMapping("/orders")
	public void addPedido(@RequestBody PedidoDTO pedido) {
		pedidoService.addPedido(pedido);
	}
	
	@DeleteMapping("/orders")
	public void deletePedido(@RequestBody PedidoDTO pedido) {
		pedidoService.deletePedido(pedido);
	}
	
}
