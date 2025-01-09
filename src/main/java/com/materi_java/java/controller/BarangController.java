package com.materi_java.java.controller;

import com.materi_java.java.exception.CommonResponse;
import com.materi_java.java.exception.ResponseHelper;
import com.materi_java.java.model.Barang;
import com.materi_java.java.service.BarangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jumat")
@CrossOrigin(origins = "*")
public class BarangController {
    @Autowired
    private BarangService jumatService;

    @PostMapping
    public CommonResponse<Barang> add(@RequestBody Barang ad) {
        return ResponseHelper.ok(jumatService.add(ad));
    }

    @GetMapping ({"/id"})
    public CommonResponse<Barang> getById(@PathVariable("id") Long id ) {
        return ResponseHelper.ok(jumatService.getById(id));
    }

    @GetMapping
    public CommonResponse<List<Barang>> getAll() {
        return ResponseHelper.ok(jumatService.getAll());
    }

    @PutMapping("/{id}")
    public CommonResponse<Barang> edit(@PathVariable("id") Long id, @RequestBody Barang tugas) {
        return ResponseHelper.ok(jumatService.edit(id, tugas));
    }

    @DeleteMapping("/{id}")
    public CommonResponse<?> delete(@PathVariable("idi")  Long id) {
        return ResponseHelper.ok( jumatService.delete(id));
    }
}
