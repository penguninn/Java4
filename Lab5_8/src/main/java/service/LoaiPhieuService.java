package service;

import entity.LoaiPhieuGiamGia;
import repo.LoaiPhieuGiamGiaRepo;

import java.util.List;

public class LoaiPhieuService {
    LoaiPhieuGiamGiaRepo repo = new LoaiPhieuGiamGiaRepo();

    public List<LoaiPhieuGiamGia> getAllLoaiPhieuGiamGia() {
        return repo.findAll();
    }

    public LoaiPhieuGiamGia getLoaiPhieuGiamGia(int id) {
        return repo.findById(id);
    }
}
