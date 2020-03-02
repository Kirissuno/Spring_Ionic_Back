package com.jacaranda.brenes.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jacaranda.brenes.model.Pedido;
import com.jacaranda.brenes.model.dto.PedidoDTO;
import com.jacaranda.brenes.repository.PedidoRepository;
import com.jacaranda.brenes.service.PedidoService;

@Service
public class PedidoServiceImpl implements PedidoService {
	@Autowired
	private PedidoRepository pedidoRepository;

	@Override
	public List<PedidoDTO> getAll() {
		List<Pedido> pedidos = pedidoRepository.findAll();
		List<PedidoDTO> pedidosDTO = new ArrayList<PedidoDTO>();
		for(Pedido cat : pedidos) {
			pedidosDTO.add(new PedidoDTO(cat.getCodPed(), cat.getFecha() ,cat.getFechaEnvio(), cat.getRestaurantes(), cat.getProductos()));
		}
		return pedidosDTO;
	}

	@Override
	public PedidoDTO getPedidoByID(Integer id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		if(pedido.isPresent()) {
			return new PedidoDTO(pedido.get().getCodPed() , pedido.get().getFecha(), pedido.get().getFechaEnvio(), pedido.get().getRestaurantes(), pedido.get().getProductos());
		}else {
			return null;
		}
	}

	@Override
	public void addPedido(PedidoDTO pedido) {
		pedidoRepository.save(new Pedido(pedido.getFecha(), pedido.getFechaEnvio(), pedido.getRestaurantes(), pedido.getProductos()));
	}

	@Override
	public void deletePedido(PedidoDTO pedido) {
		pedidoRepository.delete(new Pedido(pedido.getFecha(), pedido.getFechaEnvio(), pedido.getRestaurantes(), pedido.getProductos()));
	}

}
