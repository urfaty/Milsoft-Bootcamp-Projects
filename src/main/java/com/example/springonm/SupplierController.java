package com.example.springonm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@RequestMapping("/supplier")
public class SupplierController {

    //@Autowired
    private SupplierRepository supplierRepository;
    public SupplierController(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }
    @GetMapping("/add")
    @ResponseBody
    public String addSupplier() {
        Supplier supplier = new Supplier(0,"Barış Manço", 4350);
        supplierRepository.save(supplier);
        return "Eklendi " + supplier.getSupplierId();
    }

    @GetMapping("/list")
    @ResponseBody
    public String listSuppliers() {
        int count = 0;
        for(Supplier supplier : supplierRepository.findAll()) {
            System.out.println(supplier.getSupplierName());
            count++;
        }
        return "Toplam " + count + " adet kayıt var";
    }


    @GetMapping("/listfindmin/{min}")
    @ResponseBody
    public String listfindmin(@PathVariable("min") double min) {
        int count = 0;
        for(Supplier supplier : supplierRepository.findByTotalCreditMin(min)) {
            System.out.println(supplier.getSupplierName());
            count++;
        }
        return "Toplam " + count + " adet kayıt var";
    }


    @GetMapping("/find/{id}")
    @ResponseBody
    public String findSupplier(@PathVariable("id") long supplierId) {
        Optional<Supplier> optional = supplierRepository.findById(supplierId);
        if(optional.isPresent()) {
            Supplier supplier = optional.get();
            return supplier.getSupplierName();
        }
        return "Sağlayıcı Bulunamadı";
    }

    @GetMapping("/findthrow/{id}")
    @ResponseBody
    public String findThrow(@PathVariable("id") long supplierId) {
        return supplierRepository
                .findById(supplierId)
                .map(supplier -> supplier.getSupplierName())
                .orElseThrow(() ->
                        new IllegalArgumentException("Sağlayıcı Bulunamadı" + supplierId));

    }
}
