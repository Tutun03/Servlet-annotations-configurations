package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/aaa")
public class MyServlet1 extends HttpServlet {
@Override
protected void service(HttpServletRequest arg0,HttpServletResponse arg1)throws ServletException,IOException
{
	System.out.println("I am in MyServlet1 service() method");
}
}
