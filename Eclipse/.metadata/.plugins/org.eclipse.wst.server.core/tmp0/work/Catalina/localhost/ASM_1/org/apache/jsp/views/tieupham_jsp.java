/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.29
 * Generated at: 2024-12-04 03:40:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public final class tieupham_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/coole/Desktop/Java4/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ASM_1/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/fn-1_1.tld", Long.valueOf(1664428278000L));
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1726476925795L));
    _jspx_dependants.put("/components/header.jsp", Long.valueOf(1733282802031L));
    _jspx_dependants.put("jar:file:/C:/Users/coole/Desktop/Java4/Eclipse/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ASM_1/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c-1_2.tld", Long.valueOf(1664428278000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(4);
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("java.util.Locale");
    _jspx_imports_classes.add("java.time.format.DateTimeFormatter");
    _jspx_imports_classes.add("java.time.LocalDateTime");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Chi Tiết Tiểu Phẩm</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("          integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("            integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\"\r\n");
      out.write("            crossorigin=\"anonymous\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<header class=\"border-bottom py-3\">\r\n");
      out.write("    ");

        String uname = (String) session.getAttribute("username");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, dd MMMM yyyy", new Locale("vi", "VN"));
        String formattedDate = now.format(formatter);
    
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_005furl_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    ");
      if (_jspx_meth_c_005furl_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    <div class=\"container d-flex justify-content-between align-items-center\">\r\n");
      out.write("        <div>\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tieupham}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"text-danger fw-bold fs-4 text-decoration-none\">Online Entertainment</a>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"d-flex align-items-center\">\r\n");
      out.write("            <div class=\"border-end px-3 text-muted fw-bold\">\r\n");
      out.write("                ");
      out.print( formattedDate );
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <span href=\"favorite\"\r\n");
      out.write("               class=\"d-none px-3 text-muted text-decoration-none border-end d-flex align-items-center gap-2\">\r\n");
      out.write("                Favorite\r\n");
      out.write("            </span>\r\n");
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${admin}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("               class=\"px-3 text-muted text-decoration-none border-end d-flex align-items-center gap-2\">\r\n");
      out.write("                Admin\r\n");
      out.write("            </a>\r\n");
      out.write("\r\n");
      out.write("            ");
 if (uname == null) { 
      out.write("\r\n");
      out.write("            <span href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${path}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login\" class=\"d-none px-3 text-muted text-decoration-none d-flex align-items-center gap-2\">\r\n");
      out.write("                <ion-icon name=\"person-outline\"></ion-icon>\r\n");
      out.write("                Đăng nhập\r\n");
      out.write("            </span>\r\n");
      out.write("            ");
 } else { 
      out.write("\r\n");
      out.write("            <div class=\"dropdown px-3\">\r\n");
      out.write("                <a href=\"#\" class=\"text-muted text-decoration-none d-flex align-items-center gap-2 dropdown-toggle\"\r\n");
      out.write("                   id=\"userMenu\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\r\n");
      out.write("                    <ion-icon name=\"person-outline\"></ion-icon>\r\n");
      out.write("                    ");
      out.print( uname );
      out.write("\r\n");
      out.write("                </a>\r\n");
      out.write("                <ul class=\"dropdown-menu dropdown-menu-end\" aria-labelledby=\"userMenu\">\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/profile\">Xem Hồ Sơ</a></li>\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/change-password\">Đổi Mật Khẩu</a></li>\r\n");
      out.write("                    <li><a class=\"dropdown-item\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/logout\">Đăng Xuất</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </div>\r\n");
      out.write("            ");
 } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"container mt-4\">\r\n");
      out.write("    <div class=\"row\">\r\n");
      out.write("        <!-- Phần Video và Mô tả -->\r\n");
      out.write("        <div class=\"col-md-8\">\r\n");
      out.write("            <div class=\"card mb-4\">\r\n");
      out.write("                <div class=\"card-body text-center\">\r\n");
      out.write("                    <div class=\"mb-3\" style=\"height: 450px; background-color: #f0f0f0;\">\r\n");
      out.write("                        <iframe width=\"100%\" height=\"100%\"\r\n");
      out.write("                                src=\"https://www.youtube.com/embed/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tieuPham.linkVideo}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\r\n");
      out.write("                                frameborder=\"0\" allowfullscreen></iframe>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"card-footer text-muted\">\r\n");
      out.write("                    <h5>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tieuPham.tieuDe}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h5>\r\n");
      out.write("                    <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tieuPham.tieuDe}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("                    <button class=\"btn btn-primary\">Like</button>\r\n");
      out.write("                    <button class=\"btn btn-warning\">Share</button>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- Phần Danh sách Tiểu Phẩm (Poster) -->\r\n");
      out.write("        <div class=\"col-md-4\">\r\n");
      out.write("            <div class=\"list-group\">\r\n");
      out.write("                ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005furl_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /components/header.jsp(15,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/admin");
      // /components/header.jsp(15,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("admin");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f1_reused = false;
    try {
      _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f1.setParent(null);
      // /components/header.jsp(16,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setValue("/tieupham");
      // /components/header.jsp(16,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f1.setVar("tieupham");
      int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
      if (_jspx_th_c_005furl_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f1);
      _jspx_th_c_005furl_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f1, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f2(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f2_reused = false;
    try {
      _jspx_th_c_005furl_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f2.setParent(null);
      // /components/header.jsp(17,4) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setValue("/user");
      // /components/header.jsp(17,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f2.setVar("user");
      int _jspx_eval_c_005furl_005f2 = _jspx_th_c_005furl_005f2.doStartTag();
      if (_jspx_th_c_005furl_005f2.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f2);
      _jspx_th_c_005furl_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f2, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /views/tieupham.jsp(43,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      // /views/tieupham.jsp(43,16) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/views/tieupham.jsp(43,16) '${tieuPhams}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${tieuPhams}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("                    <a href=\"?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.id}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\" class=\"list-group-item list-group-item-action\">\r\n");
            out.write("                        <div class=\"d-flex justify-content-between gap-3\">\r\n");
            out.write("                            <iframe width=\"200px\" height=\"100px\"\r\n");
            out.write("                                    src=\"https://www.youtube.com/embed/");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.linkVideo}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("\"\r\n");
            out.write("                                    frameborder=\"0\" allowfullscreen></iframe>\r\n");
            out.write("                            <span>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.tieuDe}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</span>\r\n");
            out.write("                        </div>\r\n");
            out.write("                    </a>\r\n");
            out.write("                ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
