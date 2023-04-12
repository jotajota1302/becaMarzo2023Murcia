package edu.es.eoi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.es.eoi.dto.BancoDto;
import edu.es.eoi.dto.CreateBancoDto;
import edu.es.eoi.entity.Banco;
import edu.es.eoi.repository.BancoRepository;

@Service
public class BancoService {

	@Autowired
	BancoRepository bancoRepository;

	public BancoDto findBanco(Integer id) {

		Banco banco = bancoRepository.findById(id).get();

		BancoDto dto = new BancoDto();

		BeanUtils.copyProperties(banco, dto);		

		return dto;

	}
	
	public List<BancoDto> findAll(){
		
		List<Banco> bancos = bancoRepository.findAll();
		
		List<BancoDto> dtos=new ArrayList<BancoDto>();
		
		for (Banco b : bancos) {			
			BancoDto temp= new BancoDto();
			BeanUtils.copyProperties(b, temp);
			dtos.add(temp);
		}
				
		return dtos;
	}

	public void createBanco(CreateBancoDto banco) {

		Banco entidad = new Banco();

		BeanUtils.copyProperties(banco, entidad);
		
		bancoRepository.save(entidad);

	}
	
	

}
