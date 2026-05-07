package controller;

import model.Database;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

@WebServlet("/like")
public class LikeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) return;

        int postId = Integer.parseInt(request.getParameter("postId"));
        int userId = user.getId();

        try (Connection conn = Database.getConnection()) {
            // Kiểm tra xem đã like chưa
            String checkSql = "SELECT * FROM likes WHERE user_id = ? AND post_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setInt(1, userId);
            checkStmt.setInt(2, postId);
            ResultSet rs = checkStmt.executeQuery();

            if (rs.next()) {
                // Đã like rồi thì Unlike
                String deleteSql = "DELETE FROM likes WHERE user_id = ? AND post_id = ?";
                PreparedStatement deleteStmt = conn.prepareStatement(deleteSql);
                deleteStmt.setInt(1, userId);
                deleteStmt.setInt(2, postId);
                deleteStmt.executeUpdate();
                response.getWriter().write("unliked");
            } else {
                // Chưa like thì thêm Like
                String insertSql = "INSERT INTO likes (user_id, post_id) VALUES (?, ?)";
                PreparedStatement insertStmt = conn.prepareStatement(insertSql);
                insertStmt.setInt(1, userId);
                insertStmt.setInt(2, postId);
                insertStmt.executeUpdate();
                response.getWriter().write("liked");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.setStatus(500);
        }
    }
}
