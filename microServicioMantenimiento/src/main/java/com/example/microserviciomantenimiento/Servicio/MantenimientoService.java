package com.example.microserviciomantenimiento.Servicio;

import com.example.microserviciomantenimiento.Modelo.Mantenimiento;
import com.example.microserviciomantenimiento.Repositorio.MantenimientoRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MantenimientoService implements BaseService<Mantenimiento>{

    @Autowired
    private MantenimientoRepositorio mantenimientoRepositorio;

    @Override
    public List<Mantenimiento> findAll() throws Exception {
        return this.mantenimientoRepositorio.findAll();
    }

    @Override
    public Mantenimiento findById(Long id) throws Exception {
        return this.mantenimientoRepositorio.getById(id);
    }

    @Override
    @Transactional
    public Mantenimiento save(Mantenimiento entity) throws Exception {
        try{
            return this.mantenimientoRepositorio.save(entity);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Mantenimiento update(Long id, Mantenimiento entity) throws Exception {
        return this.mantenimientoRepositorio.update(id,entity.encargado);
    }


    @Override
    @Transactional
    public boolean delete(long id) throws Exception {
        Mantenimiento p = this.mantenimientoRepositorio.getByID(id);
        if (p == null){
            return false;
        }
        this.mantenimientoRepositorio.deleteById(id);
        return true;
    }
}
