import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Student extends HttpServlet 
{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        response.setContentType("text/html");
        
        PrintWriter out = response.getWriter();
        String title = "Students Record";
        String docType ="<!doctype html>\n";
        String value=request.getParameter("RegValue");
        String resultname="";
        Integer resultrank=0;
        
        Students[] arr;
        arr = new Students[10];

        arr[0] = new Students(4001, "Sahithya",1);
        arr[1] = new Students(4002, "Sheena",2);
        arr[2] = new Students(4003, "Sneha",3);
        arr[3] = new Students(4004, "Dharnee",4);
        arr[4] = new Students(4005, "Abisekh",5);
        arr[5] = new Students(4006, "Harish",6);
        arr[6] = new Students(4007, "Akash",7);
        arr[7] = new Students(4008, "Prince",8);
        arr[8] = new Students(4009, "Avinash",9);
        arr[9] = new Students(4010, "Joyson",10);

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].id==Integer.parseInt(value))
            {
                resultname=arr[i].name;
                resultrank=arr[i].rank;
                break;
            }
        }
        out.println(docType +
        "<html>\n"+
            "<head><title>" + title + "</title></head>\n"+"<style>table, td, th { border: 1px solid black; text-align:center;} .center {padding: 225px 0;}</style>\n" +
            "<body bgcolor = \"#f0f0f0\">\n" +"<div class=\"center\">"+
               "<center>"+"<h1>"+ title +"</h1>\n" +
               "<table>"+   
               "<thead><th> Register Number </th><th> Name </th><th> Rank </th></thead>\n"+
               "<tbody><tr><td>"+value+"</td><td>"+resultname+"</td><td>"+resultrank+"</td></tr></tbody>"+
            "</table>"+"</div>\n"+"</center>"+"</body>"+            
        "</html>"
        );
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        doGet(request, response);
    }   
    class Students 
    {
        public int id;
        public String name;
        public int rank;
        Students(int id, String name,int rank)
        {
            this.id = id;
            this.name = name;
            this.rank=rank;
        }
    }
}