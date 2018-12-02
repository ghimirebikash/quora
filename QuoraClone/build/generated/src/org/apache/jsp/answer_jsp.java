package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class answer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title></title>\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("\t<style type=\"text/css\">\n");
      out.write("\tbody{\n");
      out.write("\t\tfont-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n");
      out.write("\t}\n");
      out.write("        .header{\n");
      out.write("        \tbackground: #fff;\n");
      out.write("\t\t    position: fixed;\n");
      out.write("\t\t    top: 0;\n");
      out.write("\t\t    left: 0;\n");
      out.write("\t\t    width: 100%;\n");
      out.write("\t\t    min-height: 50px;\n");
      out.write("\t\t    box-sizing: border-box;\n");
      out.write("\t\t    z-index: 800;\n");
      out.write("\t\t    font-size: 14px;\n");
      out.write("\t\t    color: #fff;\n");
      out.write("\t\t    border-bottom: 1px solid #ddd;\n");
      out.write("\t\t    box-shadow: 0 3px 2px -2px rgba(200,200,200,0.2);\n");
      out.write("        }\n");
      out.write("        .inheader{\n");
      out.write("        \twidth: 1000px;\n");
      out.write("\t\t    position: fixed;\n");
      out.write("\t\t    left: 12.5%;\n");
      out.write("        }\n");
      out.write("        .inheader span{\n");
      out.write("        \tcolor: #b3072d;\n");
      out.write("  \t\t    font-size: 1.9em;\n");
      out.write("  \t\t    font-family: monospace;\n");
      out.write("        }\n");
      out.write("        .Question{\n");
      out.write("\t\t    position: relative;\n");
      out.write("            left: 85px;\n");
      out.write("        }\n");
      out.write("        .Question a{\n");
      out.write("        \ttext-decoration: none;\n");
      out.write("\t\t    border: 1px solid #b92b27;\n");
      out.write("\t\t    background: #b92b27;\n");
      out.write("\t\t    padding: 3px 7px 4px 7px;\n");
      out.write("\t\t    color: white;\n");
      out.write("\t\t    border-radius: 3px;\n");
      out.write("\t\t    font-size: .5em;\n");
      out.write("\t        position: relative;\n");
      out.write("    \t\ttop: -4px;\n");
      out.write("        }\n");
      out.write("        .text{\n");
      out.write("        \tposition: relative;\n");
      out.write("        \tleft: 18px;\n");
      out.write("        }\n");
      out.write("        .text a{\n");
      out.write("        \ttext-decoration: none;\n");
      out.write("\t\t    color: #6669;\n");
      out.write("\t\t    font-size: .6em;\n");
      out.write("\t\t    padding: 0px 3px 10px 0px;\n");
      out.write("        }\n");
      out.write("        .text i{\n");
      out.write("        \t    padding: 0px 7px;\n");
      out.write("        \t    font-size: 27px;\n");
      out.write("        }\n");
      out.write("        .answer{\n");
      out.write("        \tposition: relative;\n");
      out.write("        \tleft: 30px;\n");
      out.write("        }\n");
      out.write("        .answer a{\n");
      out.write("        \ttext-decoration: none;\n");
      out.write("\t\t    color: #960d0dd6;\n");
      out.write("        border-bottom: 1px solid;\n");
      out.write("\t\t    font-size: .6em;\n");
      out.write("        padding: 0px 3px 10px 0px;\n");
      out.write("\n");
      out.write("        }\n");
      out.write("        .answer i{\n");
      out.write("        \t    padding: 11px 7px;\n");
      out.write("        \t    font-size: 27px;\n");
      out.write("        }\n");
      out.write("        .bell{\n");
      out.write("        \tposition: relative;\n");
      out.write("        \tleft: 43px;\n");
      out.write("        }\n");
      out.write("        .bell a{\n");
      out.write("        \ttext-decoration: none;\n");
      out.write("\t\t    color: #6669;\n");
      out.write("\t\t    font-size: .6em;\n");
      out.write("        }\n");
      out.write("        .bell i{\n");
      out.write("        \t    padding: 11px 7px;\n");
      out.write("        }\n");
      out.write("        .user{\n");
      out.write("        \t    position: relative;\n");
      out.write("                left: 72px;\n");
      out.write("        }\n");
      out.write("        .user a{\n");
      out.write("\t\t    text-decoration: none;\n");
      out.write("\t\t    color: #6669;\n");
      out.write("\t\t    font-size: .6em;\n");
      out.write("\t\t    border: 1px solid #6669;\n");
      out.write("\t\t    border-radius: 50%;\n");
      out.write("\t\t    padding: 7px 5px;\n");
      out.write("\t\t    position: relative;\n");
      out.write("\t\t    top: -2px;\n");
      out.write("        }\n");
      out.write("        .user i{\n");
      out.write("        \t    padding: 11px 7px;\n");
      out.write("        }\n");
      out.write("        .input{\n");
      out.write("        \tposition: relative;\n");
      out.write("        \tleft: 57px;\n");
      out.write("        }\n");
      out.write("        .input input{\n");
      out.write("        \t   padding: 3px 7px 4px 7px;\n");
      out.write("\t\t\t    position: relative;\n");
      out.write("\t\t\t    top: -4px;\n");
      out.write("\t\t\t    font-size: 14px;\n");
      out.write("\t\t\t    border-radius: 3px;\n");
      out.write("\t\t\t    border: 1px solid #0000002e;\n");
      out.write("\t\t\t   opacity: .9;\n");
      out.write("        }\n");
      out.write("        .answer_mid{\n");
      out.write("          position: absolute;\n");
      out.write("          top: 11%;\n");
      out.write("          width: 945px;\n");
      out.write("          left: 13%;\n");
      out.write("          display: inline-flex;\n");
      out.write("        }\n");
      out.write("        .answer_mid_rigth{\n");
      out.write("          float: left;\n");
      out.write("          width: 150px;\n");
      out.write("          padding: 4px 1px 0px 0px;\n");
      out.write("        }\n");
      out.write("        .span_question{\n");
      out.write("            border-bottom: 1px solid #e2e2e2;\n");
      out.write("            padding: 7px 54px 12px 0px;\n");
      out.write("            font-family: \"Helvetica Neue\",Helvetica,Arial,sans-serif;\n");
      out.write("          }\n");
      out.write("        .span_question_a{\n");
      out.write("          position: relative;\n");
      out.write("          top: 7px;\n");
      out.write("        }\n");
      out.write("        .span_question_a a{\n");
      out.write("            position: relative;\n");
      out.write("            margin-left: -39px;\n");
      out.write("            font-size: 14px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            color: #666;\n");
      out.write("            background-color: #a2979742;\n");
      out.write("            border-radius: 3px;\n");
      out.write("            border: 1px solid transparent;\n");
      out.write("            padding: 3px 7px 3px 4px;\n");
      out.write("        }\n");
      out.write("        .span_question_a ul li{\n");
      out.write("           padding: 10px 4px 7px 0px;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .answer_mid_mid{\n");
      out.write("          width: 576px;\n");
      out.write("          position: relative;\n");
      out.write("          left: 168px;\n");
      out.write("        }\n");
      out.write("        .mid_title{\n");
      out.write("          border: 1px solid #efefef;\n");
      out.write("          background-color: #fff;\n");
      out.write("          border-radius: 4px;\n");
      out.write("          border-bottom: 1px solid #e2e2e2;\n");
      out.write("          margin-bottom: 8px;\n");
      out.write("          padding: 16px;\n");
      out.write("          padding-top: 16px;\n");
      out.write("        }\n");
      out.write("      .mid_title i{\n");
      out.write("            border: 1px solid #a00505;\n");
      out.write("          background: #a00505;\n");
      out.write("          padding: 5px 5px 5px 6px;\n");
      out.write("          font-size: 16px;\n");
      out.write("          color: white;\n");
      out.write("      }\n");
      out.write("      .mid_title a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #333;\n");
      out.write("        font-weight: 500;\n");
      out.write("        font-size: 15px;\n");
      out.write("      }\n");
      out.write("      .questionforyou{\n");
      out.write("         border: 1px solid #efefef;\n");
      out.write("          background-color: #fff;\n");
      out.write("          border-radius: 4px;\n");
      out.write("          border-bottom: 1px solid #e2e2e2;\n");
      out.write("          margin-bottom: 8px;\n");
      out.write("          padding: 16px;\n");
      out.write("          padding-top: 16px;\n");
      out.write("      }\n");
      out.write("      .questionforyou_question{\n");
      out.write("          font-weight: bold;\n");
      out.write("          line-height: 1.3;\n");
      out.write("          color: #333;\n");
      out.write("          font-size: 18px;\n");
      out.write("      }\n");
      out.write("      .questionforyou a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #666;\n");
      out.write("      }\n");
      out.write("       .right_header{\n");
      out.write("        height: 20%;\n");
      out.write("      width: 100%;\n");
      out.write("      background: #fafafa;\n");
      out.write("        border-bottom: 1px solid #e2e2e2;\n");
      out.write("       }\n");
      out.write("     .right_header_answer{\n");
      out.write("        height: 20%;\n");
      out.write("      width: 100%;\n");
      out.write("      background: #fafafa;\n");
      out.write("        border-bottom: 1px solid #e2e2e2;\n");
      out.write("       }\n");
      out.write("       .right_header a{\n");
      out.write("            position: relative;\n");
      out.write("        top: 14px;\n");
      out.write("        padding: 10px 10px 17.5px 10px;\n");
      out.write("        color: #a2221e;\n");
      out.write("        border-bottom: 2px solid;\n");
      out.write("        margin: 10px;\n");
      out.write("       }\n");
      out.write("       .right_header_answer a{\n");
      out.write("            position: relative;\n");
      out.write("        top: 14px;\n");
      out.write("        padding: 10px 10px 17.5px 10px;\n");
      out.write("        color: #a2221e;\n");
      out.write("        border-bottom: 2px solid;\n");
      out.write("        margin: 10px;\n");
      out.write("       }\n");
      out.write("       .right_header i{\n");
      out.write("            position: relative;\n");
      out.write("        top: 10px;\n");
      out.write("        float: right;\n");
      out.write("        right: 10px;\n");
      out.write("        color: #6669;\n");
      out.write("       }\n");
      out.write("       .right_header_answer i{\n");
      out.write("            position: relative;\n");
      out.write("        top: 10px;\n");
      out.write("        float: right;\n");
      out.write("        right: 10px;\n");
      out.write("        color: #6669;\n");
      out.write("       }\n");
      out.write("       .right_header i:hover{\n");
      out.write("         color: black;\n");
      out.write("         transform: rotate(180deg);\n");
      out.write("         transition: 1s;\n");
      out.write("       }\n");
      out.write("       .right_header_answer i:hover{\n");
      out.write("         color: black;\n");
      out.write("         transform: rotate(180deg);\n");
      out.write("         transition: 1s;\n");
      out.write("       }\n");
      out.write("       .right{\n");
      out.write("          display: none;\n");
      out.write("          width: 560px;\n");
      out.write("        height: 250px;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        left: 29%;\n");
      out.write("        border: 1px solid #0000005c;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 15%;\n");
      out.write("        }\n");
      out.write("        .right_answer{\n");
      out.write("          display: none;\n");
      out.write("          width: 560px;\n");
      out.write("        height: 250px;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        left: 29%;\n");
      out.write("        border: 1px solid #0000005c;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 15%;\n");
      out.write("        }\n");
      out.write("        .right_question input{\n");
      out.write("              font-family: 'q_serif',Georgia,Times,\"Times New Roman\",\"Hiragino Kaku Gothic Pro\",\"Meiryo\",serif;\n");
      out.write("              border: none;\n");
      out.write("          border-bottom: 1px solid;\n");
      out.write("          width: 80%;\n");
      out.write("          top: 62px;\n");
      out.write("          position: relative;\n");
      out.write("          left: 55px;\n");
      out.write("            font-size: 19px;\n");
      out.write("              padding: 5px 5px 5px 5px;\n");
      out.write("        }\n");
      out.write("        .right_question_answer input{\n");
      out.write("              font-family: 'q_serif',Georgia,Times,\"Times New Roman\",\"Hiragino Kaku Gothic Pro\",\"Meiryo\",serif;\n");
      out.write("              border: none;\n");
      out.write("          border-bottom: 1px solid;\n");
      out.write("          width: 80%;\n");
      out.write("          top: 62px;\n");
      out.write("          position: relative;\n");
      out.write("          left: 55px;\n");
      out.write("            font-size: 19px;\n");
      out.write("              padding: 5px 5px 5px 5px;\n");
      out.write("        }\n");
      out.write("        .right_question button{\n");
      out.write("              position: relative;\n");
      out.write("          top: 100px;\n");
      out.write("          float: right;\n");
      out.write("          margin: 10px;\n");
      out.write("          text-align: center;\n");
      out.write("          text-decoration: none;\n");
      out.write("          cursor: pointer;\n");
      out.write("          background: #3e78ad;\n");
      out.write("          border: none;\n");
      out.write("          font-size: 15px;\n");
      out.write("          padding: 5px 5px;\n");
      out.write("        }\n");
      out.write("        .right_question_answer button{\n");
      out.write("              position: relative;\n");
      out.write("          top: 100px;\n");
      out.write("          float: right;\n");
      out.write("          margin: 10px;\n");
      out.write("          text-align: center;\n");
      out.write("          text-decoration: none;\n");
      out.write("          cursor: pointer;\n");
      out.write("          background: #3e78ad;\n");
      out.write("          border: none;\n");
      out.write("          font-size: 15px;\n");
      out.write("          padding: 5px 5px;\n");
      out.write("        }\n");
      out.write("\t</style>\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\".Question\").click(function(){\n");
      out.write("                $(\".answer_mid_mid\").fadeTo(1000, 0);\n");
      out.write("                $(\".right\").show(1000);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\"#cross\").click(function(){\n");
      out.write("                $(\".answer_mid_mid\").fadeTo(1000, 1);\n");
      out.write("                $(\".right\").hide(1000);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("     <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\".edit\").click(function(){\n");
      out.write("                $(\".answer_mid_mid\").fadeTo(1000, 0);\n");
      out.write("                $(\".right_answer\").show(1000);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        $(document).ready(function(){\n");
      out.write("            $(\"#cross1\").click(function(){\n");
      out.write("                $(\".answer_mid_mid\").fadeTo(1000, 1);\n");
      out.write("                $(\".right_answer\").hide(1000);\n");
      out.write("            });\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   <div class=\"header\">\n");
      out.write("   \t  <div class=\"inheader\">\n");
      out.write("   \t    <span>JigyaXa</span>\n");
      out.write("   \t         <span class=\"text\"><a href=\"home.jsp\"><i class=\"fa fa-file-text\" aria-hidden=\"true\"></i>Home</a></span>\n");
      out.write("   \t         <span class=\"answer\"><a href=\"answer.jsp\"><i class=\"fa fa-edit\" aria-hidden=\"true\"></i>Answers</a></span>\n");
      out.write("             <span class=\"bell\"><a href=\"notation.jsp\"><i class=\"fa fa-bell\" aria-hidden=\"true\"></i>Notifications</a></span>\n");
      out.write("             <span class=\"input\"><input type=\"serch\" name=\"\" placeholder=\"Search...\"></span>\n");
      out.write("             <span class=\"user\"><a href=\"\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i></a></span>\n");
      out.write("             <span class=\"Question\"><a>Add Question Or Links</a></span>\n");
      out.write("   \t  </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"answer_mid\">\n");
      out.write("     <div class=\"answer_mid_rigth\" style=\"position: fixed;\">\n");
      out.write("        <span class=\"span_question\">Questions</span>\n");
      out.write("       <div class=\"span_question_a\">\n");
      out.write("          <ul type=\"none\">\n");
      out.write("            <li><a href=\"answer.jsp\">Questions For You</a></li>\n");
      out.write("            <li><a href=\"answer_request.jsp\">Answers Request</a></li>\n");
      out.write("          </ul>\n");
      out.write("       </div>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <div class=\"answer_mid_mid\">\n");
      out.write("         <div class=\"mid_title\">\n");
      out.write("            <a href=\"\"><i class=\"fa fa-star\"></i>&nbsp&nbspQuestions For You</a>\n");
      out.write("         </div>\n");
      out.write("         \n");
      out.write("          ");
 try{
                        String ad = session.getAttribute("user").toString();
                            Class.forName("org.apache.derby.jdbc.ClientDriver");  
                            Connection con=DriverManager.getConnection("jdbc:derby://localhost:1527/quora","root","qwerty");  
                            Statement stmt=con.createStatement();  
                            String query = "select * from question_answer";
                            ResultSet rs=stmt.executeQuery(query);
                           
                            while(rs.next()){
                                  if(rs.getString(2) == null){
                                      System.out.println(rs.getString(2));
                                
      out.write("\n");
      out.write("                          <div class=\"questionforyou\">\n");
      out.write("                            <p class=\"questionforyou_question\">");
out.println(rs.getString(1));
      out.write("</p>\n");
      out.write("                            <a class=\"edit\"><i class=\"fa fa-pencil\"></i>&nbsp&nbspanswer</a>\n");
      out.write("                          </div>\n");
      out.write("                                ");

                            
                           }
                     }   
                    }
                    catch (Exception e) {
                        out.println("Error");
                    }                
                
      out.write("\n");
      out.write("     </div>\n");
      out.write("   </div>\n");
      out.write("   <div class=\"right\">\n");
      out.write("          <div class=\"right_header\">\n");
      out.write("            <a >Add Question</a>\n");
      out.write("            <i class=\"fa fa-times\" id=\"cross\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"right_question\">\n");
      out.write("            <form action=\"uploadquestion\" method=\"post\">\n");
      out.write("              <input type=\"text\" name=\"input_question\" class=\"input_question\" placeholder=\"Start Your Question With 'What','How','Whene'etc....\">\n");
      out.write("              <input type=\"text\" style=\"display: none;\" id=\"ques\">\n");
      out.write("              <hr style=\"    position: relative;top: 104px;\">\n");
      out.write("              <button type=\"submit\">Add Question</button>\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("  </div>\n");
      out.write("     <div class=\"right_answer\">\n");
      out.write("          <div class=\"right_header_answer\">\n");
      out.write("            <a >Your Answer</a>\n");
      out.write("            <i class=\"fa fa-times\" id=\"cross1\"></i>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"right_question_answer\">\n");
      out.write("            <form  action=\"uploadanswer\">\n");
      out.write("                <input type=\"text\" name=\"input_question_answer\" onfocusout=\"myFunction()\" class=\"input_question\" placeholder=\"Add Your Answers......\">\n");
      out.write("                <input id=\"qwe\" name = \"qwe\">\n");
      out.write("                <hr style=\"position: relative;top: 104px;\">\n");
      out.write("              <button type=\"submit\">Add Answer</button>\n");
      out.write("            </form>\n");
      out.write("                   <script>\n");
      out.write("                        function myFunction() {\n");
      out.write("                            var x = document.getElementByClass(\"questionforyou_question\");\n");
      out.write("                            var y = document.getElementById(\"qwe\");\n");
      out.write("                            y.value = x.value;\n");
      out.write("                        }\n");
      out.write("                    </script>\n");
      out.write("          </div>\n");
      out.write("  </div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--  var a = $(this).children(\".inputquestion_name\"); $(\".input_question_answer\").focusout(function(){ var b = $(a).html(); $(\"#ques\").val(b);\n");
      out.write("        });-->");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
