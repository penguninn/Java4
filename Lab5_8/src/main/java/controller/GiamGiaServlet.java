package controller;

import entity.LoaiPhieuGiamGia;
import entity.PhieuGiamGia;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.LoaiPhieuService;
import service.PhieuGiamGiaService;

import java.io.IOException;
import java.util.List;

@WebServlet({"/giamgia", "/add", "/delete"})
public class GiamGiaServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        LoaiPhieuService loaiPhieuService = new LoaiPhieuService();
        PhieuGiamGiaService phieuGiamGiaService = new PhieuGiamGiaService();
        List<PhieuGiamGia> list = phieuGiamGiaService.getAllPhieuGiamGia();
        if (path.contains("add")) {
            PhieuGiamGia pg = new PhieuGiamGia();
            pg.setId(list.get(list.size() - 1).getId() + 1);
            pg.setMa(req.getParameter("ma"));
            pg.setTen(req.getParameter("ten"));
            pg.setSoLuong(Integer.parseInt(req.getParameter("soLuong")));
            phieuGiamGiaService.addPhieuGiamGia(pg, Integer.parseInt(req.getParameter("loai")));
        } else if (path.contains("delete")) {
            PhieuGiamGia pg = new PhieuGiamGia();
            int id = Integer.parseInt(req.getParameter("id"));
            phieuGiamGiaService.deletePhieuGiamGia(id);
        }
        req.setAttribute("listLoaiPhieu", loaiPhieuService.getAllLoaiPhieuGiamGia());
        req.setAttribute("list", list);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
