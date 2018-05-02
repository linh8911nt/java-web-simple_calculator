import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", urlPatterns = "/display-discount")
public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double firstOperand = Double.parseDouble(request.getParameter("FirstOperand"));
        double secondOperand = Double.parseDouble(request.getParameter("SecondOperand"));
        String operator = request.getParameter("Operator");

        PrintWriter writer = response.getWriter();

        switch (operator){
            case "add":
                writer.print("<h1>" + "Result = " + (firstOperand + secondOperand) + "</h1>");
                break;
            case "sub":
                writer.print("<h1>" + "Result = " + (firstOperand - secondOperand) + "</h1>");
                break;
            case "multiple":
                writer.print("<h1>" + "Result = " + (firstOperand * secondOperand) + "</h1>");
                break;
            case "division":
                try {
                    double result = Calculator.calculate(firstOperand, secondOperand);
                    writer.print("<h1>" + "Result = " + result + "</h1>");
                    break;
                } catch (IOException e){
                    writer.print("Error: " + e.getMessage());
                }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
