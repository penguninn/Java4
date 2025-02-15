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

@WebServlet({
        "/admin",
        "/admin/new",
        "/admin/insert",
        "/admin/edit",
        "/admin/update",
        "/admin/delete"
})
public class AdminServlet extends HttpServlet {
    TieuPhamDao tieuPhamDao = new TieuPhamDaoImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = req.getServletPath();
        System.out.println(path);
        switch (path) {
            case "/admin":
                hienThiDanhSach(req, resp);
                break;
            case "/admin/new":
                System.out.println("new");
                hienThiDanhSach(req, resp);
                break;
            case "/admin/insert":
                System.out.println("insert");
                insert(req, resp);
                break;
            case "/admin/edit":
                hienThiChiTiet(req, resp);
                break;
            case "/admin/update":
                System.out.println("update");
                update(req, resp);
                break;
            case "/admin/delete":
                System.out.println("delete");
                delete(req, resp);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    public TieuPham getTieuPhamFromForm(HttpServletRequest req) {
        TieuPham tp = new TieuPham();
        tp.setId(Integer.parseInt(req.getParameter("id") == "" ? "0" : req.getParameter("id")));
        tp.setLinkVideo(req.getParameter("youtubeId"));
        tp.setTieuDe(req.getParameter("videoTitle"));
        tp.setLuotXem(Integer.parseInt(req.getParameter("viewCount")));
        tp.setTrangThai(Boolean.parseBoolean(req.getParameter("status")));
        tp.setMoTa(req.getParameter("moTa"));
        System.out.println(tp.toString());
        return tp;
    }

    private void hienThiDanhSach(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String pageParam = req.getParameter("page");
        int currentPage = pageParam == null ? 1 : Integer.parseInt(pageParam);
        int pageSize = 6;
        int totalItems = tieuPhamDao.getTotalItems();
        int totalPages = (int) Math.ceil((double) totalItems / pageSize);
        List<TieuPham> tieuPhams = tieuPhamDao.getAllTieuPham(currentPage, pageSize);
        req.setAttribute("tieuPhams", tieuPhams);
        req.setAttribute("totalPages", totalPages);
        req.setAttribute("currentPage", currentPage);
        req.getRequestDispatcher("/views/admin.jsp").forward(req, resp);
    }

    private void hienThiChiTiet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        TieuPham tieuPham = tieuPhamDao.getTieuPhamById(id);

        String pageParam = req.getParameter("page");
        int currentPage = pageParam == null ? 1 : Integer.parseInt(pageParam);
        int pageSize = 6;
        int totalItems = tieuPhamDao.getTotalItems();
        int totalPages = (int) Math.ceil((double) totalItems / pageSize);
        List<TieuPham> tieuPhams = tieuPhamDao.getAllTieuPham(currentPage, pageSize);
        req.setAttribute("tieuPhams", tieuPhams);
        req.setAttribute("totalPages", totalPages);

        req.setAttribute("currentPage", currentPage);
        req.setAttribute("tp", tieuPham);
        req.getRequestDispatcher("/views/admin.jsp").forward(req, resp);
    }

    private void showNewForm(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/views/admin.jsp").forward(req, resp);
    }

    private void insert(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        TieuPham tieuPham = getTieuPhamFromForm(req);
        tieuPham.setId(null);
        tieuPhamDao.addTieuPham(tieuPham);
        resp.sendRedirect(req.getContextPath() + "/admin");
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        tieuPhamDao.updateTieuPham(getTieuPhamFromForm(req));
        resp.sendRedirect(req.getContextPath() + "/admin");
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        tieuPhamDao.deleteTieuPham(getTieuPhamFromForm(req).getId());
        resp.sendRedirect(req.getContextPath() + "/admin");
    }

}
