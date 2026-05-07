package controller;

import dao.PostDAO;
import model.Post;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/newsfeed")
public class NewsFeedServlet extends HttpServlet {
    private PostDAO postDAO = new PostDAO();
    private static final int PAGE_SIZE = 5;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect("login");
            return;
        }

        String offsetStr = request.getParameter("offset");
        int offset = 0;
        if (offsetStr != null) {
            try {
                offset = Integer.parseInt(offsetStr);
            } catch (NumberFormatException e) {
                offset = 0;
            }
        }

        List<Post> posts = postDAO.getAdvancedFeed(user.getId(), PAGE_SIZE, offset);
        request.setAttribute("posts", posts);
        request.setAttribute("nextOffset", offset + PAGE_SIZE);

        // Nếu là yêu cầu AJAX, chỉ trả về phần danh sách bài viết
        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            request.getRequestDispatcher("/WEB-INF/views/post_items.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("/WEB-INF/views/newsfeed.jsp").forward(request, response);
        }
    }
}
