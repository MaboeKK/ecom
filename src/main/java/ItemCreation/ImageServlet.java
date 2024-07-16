package ItemCreation;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/image")
public class ImageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        if (id == null) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Missing image id.");
            return;
        }

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Load database driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");

            // Retrieve image blob from database
            String sql = "SELECT image FROM products WHERE product_id = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                byte[] imgData = rs.getBytes("image_blob");
                response.setContentType("image/jpg");
                response.setContentLength(imgData.length);
                OutputStream out = response.getOutputStream();
                out.write(imgData);
                out.flush();
            } else {
                response.sendError(HttpServletResponse.SC_NOT_FOUND, "Image not found.");
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Database access error", e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                // Log this error
            }
        }
    }
}
