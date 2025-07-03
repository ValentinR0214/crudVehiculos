package mx.edu.utez.vehiculos.vehiculo.control;

import mx.edu.utez.vehiculos.vehiculo.model.Vehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vehiculo")
public class VehiculoController {

    private final VehiculoService vehiculoService;

    @Autowired
    public VehiculoController(VehiculoService vehiculoService) {
        this.vehiculoService = vehiculoService;
    }

    @GetMapping("/all")
    public List<Vehiculo> getAllVehiculos() {
        return vehiculoService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Vehiculo> getVehiculoById(@PathVariable Long id) {
        return vehiculoService.findById(id);
    }

    @PostMapping("/save")
    public Vehiculo saveVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.save(vehiculo);
    }

    @PutMapping("/update")
    public Vehiculo updateVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.update(vehiculo);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteVehiculo(@PathVariable Long id) {
        vehiculoService.delete(id);
    }


}
