package com.jacaranda.brenes.service;

import java.util.List;

import com.jacaranda.brenes.model.dto.PedidoDTO;

public interface PedidoService {

	List<PedidoDTO> getAll();
	PedidoDTO getPedidoByID(Integer id);
	void addPedido(PedidoDTO pedido);
	void deletePedido(PedidoDTO pedido);
	
}
