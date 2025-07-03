package mx.edu.utez.vehiculos.vehiculo.control;

import mx.edu.utez.vehiculos.vehiculo.model.Vehiculo;
import mx.edu.utez.vehiculos.vehiculo.model.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    @Autowired
    public VehiculoService(VehiculoRepository vehiculoRepository) {
        this.vehiculoRepository = vehiculoRepository;
    }

    @Transactional(readOnly = true)
    public List<Vehiculo> findAll() {
        return vehiculoRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Optional<Vehiculo> findById(Long id) {
        return vehiculoRepository.findById(id);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public Vehiculo save(Vehiculo vehiculo) {
        return vehiculoRepository.save(vehiculo);
    }

    @Transactional(rollbackFor = {SQLException.class})
    public Vehiculo update(Vehiculo vehiculo) {
        Optional<Vehiculo> optionalVehiculo = vehiculoRepository.findById(vehiculo.getId());
        if (optionalVehiculo.isPresent()) {
            Vehiculo existente = optionalVehiculo.get();
            existente.setNombre(vehiculo.getNombre());
            existente.setDescripcion(vehiculo.getDescripcion());
            existente.setMarca(vehiculo.getMarca());
            return vehiculoRepository.save(existente);
        }
        return null;
    }

    @Transactional
    public void delete(Long id) {
        vehiculoRepository.deleteById(id);
    }
}