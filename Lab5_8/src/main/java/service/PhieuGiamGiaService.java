package service;

import entity.LoaiPhieuGiamGia;
import entity.PhieuGiamGia;
import repo.PhieuGiamGiaRepo;

import java.util.List;

public class PhieuGiamGiaService {
    PhieuGiamGiaRepo repo = new PhieuGiamGiaRepo();
    public List<PhieuGiamGia> getAllPhieuGiamGia() {
        return repo.findAll();
    }

    public PhieuGiamGia getPhieuGiamGia(int id) {
        return repo.findById(id);
    }

    public void addPhieuGiamGia(PhieuGiamGia pg, int loaiPhieuId) {
        repo.save(pg, loaiPhieuId);
    }

    public void updatePhieuGiamGia(PhieuGiamGia pg) {
        repo.update(pg);
    }

    public void deletePhieuGiamGia(int id) {
        repo.delete(id);
    }
}
