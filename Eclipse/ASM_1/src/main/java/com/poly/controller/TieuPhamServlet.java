package com.poly.controller;

import com.poly.dao.TieuPhamDao;
import com.poly.daoImpl.TieuPhamDaoImpl;
import com.poly.entity.TieuPham;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet({"/tieupham", "/tieupham/*"})
public class TieuPhamServlet extends HttpServlet {
    TieuPhamDao tieuphamDao = new TieuPhamDaoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        System.out.println("ID received: " + id);
        if (id != null) {
            hienThiChiTiet(req, resp, id);
        } else {
            hienThiDanhSach(req, resp);
            System.out.println(id);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    private void hienThiDanhSach(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageParam = req.getParameter("page");
        int currentPage = pageParam == null ? 1 : Integer.parseInt(pageParam);
        int pageSize = 6;
        int totalItems = tieuphamDao.getTotalItems();
        int totalPages = (int) Math.ceil((double) totalItems / pageSize);
        List<TieuPham> tieuPhams = tieuphamDao.getAllTieuPham(currentPage, pageSize);
        req.setAttribute("tieuPhams", tieuPhams);
        req.setAttribute("totalPages", totalPages);
        req.setAttribute("currentPage", currentPage);
        req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
    }


    private void hienThiChiTiet(HttpServletRequest req, HttpServletResponse resp, String id) throws ServletException, IOException {
        TieuPham tieuPham = tieuphamDao.getTieuPhamById(Integer.parseInt(id));
        if (tieuPham == null) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND);
            System.out.println("null");
            return;
        }
        req.setAttribute("tieuPhams", tieuphamDao.getTop10TieuPham());
        req.setAttribute("tieuPham", tieuPham);
        req.getRequestDispatcher("/views/tieupham.jsp").forward(req, resp);
    }
}
