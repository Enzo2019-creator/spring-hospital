package pe.edu.upn.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upn.demo.model.entity.EnzoCastillo;
import pe.edu.upn.demo.model.repository.EnzoCastilloRepository;
import pe.edu.upn.demo.service.EnzoCastilloService;

@Service
public class EnzoCastilloServiceImpl implements EnzoCastilloService{
	
	@Autowired
	private EnzoCastilloRepository enzoCastilloRepository;
	
	@Override
	public List<EnzoCastillo> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Transactional(readOnly = true)
	@Override
	public Optional<EnzoCastillo> findById(String id) throws Exception {
		return enzoCastilloRepository.findById(id);
	}

	@Transactional
	@Override
	public EnzoCastillo save(EnzoCastillo entity) throws Exception {
		return enzoCastilloRepository.save(entity);
	}

	@Transactional
	@Override
	public EnzoCastillo update(EnzoCastillo entity) throws Exception {
		return enzoCastilloRepository.save(entity);
	}

	@Transactional
	@Override
	public void deleteById(String id) throws Exception {
		// TODO Auto-generated method stub
		enzoCastilloRepository.deleteById(id);
	}

	@Transactional
	@Override
	public void deleteAll() throws Exception {
		enzoCastilloRepository.deleteAll();
		
	}

}
