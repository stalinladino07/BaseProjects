package com.qph.gestionppm.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", methods= {RequestMethod.OPTIONS,RequestMethod.GET,
        RequestMethod.POST,RequestMethod.DELETE})
@RestController
public class RolControlador {
	
//    @Autowired
//    private RolService rolService;
//
//    @PostMapping("/save")
//    @ResponseBody
//    private ResponseEntity<Rol> saveRol (@RequestBody Rol product){
//        Rol productCreate = rolService.create(product);
//	
//        try {
//            return ResponseEntity.created(new URI("/api/hulkstore/save"+productCreate.getIdRol())).body(productCreate);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    };
//
//    @GetMapping("/listall")
//    private ResponseEntity<List<Rol>> getAllRols (){
//        List<Rol> productListAll = rolService.getAllRols();
//        try {
//            return ResponseEntity.ok(productListAll);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    };
//
//    @DeleteMapping("/{id}")
//    private ResponseEntity<Response> deleteRol (@PathVariable Long id){
//        try {
//            return rolService.deleteById(id);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    };
//
//    @GetMapping(name="/getbyid/{id}", value = "{id}")
//    private ResponseEntity<Optional<Rol>> findById (@PathVariable Long id){
//        Optional<Rol> productResponse = rolService.getById(id);
//        try {
//            return ResponseEntity.ok(productResponse);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    };
//
//    @PutMapping("/{id}")
//    @ResponseBody
//    private ResponseEntity<Response> updateRol (@PathVariable Long id, @RequestBody Rol product){
//        try {
//            return rolService.update(id,product);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    }
//
//    @GetMapping("/store/{id}")
//    private ResponseEntity<List<Rol>> getRolByStore (@PathVariable Long id){
//        List<Rol> listRolStore = rolService.getByIdStore(id);
//        try {
//            return ResponseEntity.ok(listRolStore);
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
//        }
//    };

}