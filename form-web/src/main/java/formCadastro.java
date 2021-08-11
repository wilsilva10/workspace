import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/formCadastro")
public class formCadastro extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String nomeCompleto = req.getParameter("nomeCompleto");
		String telefone = req.getParameter("telefone");
		String dtNascimento = req.getParameter("dtNascimento");
		String email = req.getParameter("email");
		String sexo = req.getParameter("sexo");
		String[] tecnologia= req.getParameterValues("tecnologia");
		String escolaridade = req.getParameter("escolaridade");
		
		
		 PrintWriter saida = res.getWriter();
		  saida.println("<html>");
		  saida.println(nomeCompleto);
		  saida.println(telefone);
		  saida.println(dtNascimento);
		  saida.println(email);
		  saida.println(sexo);
		  
		  String lsTecnologia = "";
		  for (String t: tecnologia){
			  saida.println(t);
			  lsTecnologia += t+",";
		  }
		  
		  saida.println(escolaridade);
		  
		
		  //try catch para poder não rodar varias vzs a conexao
		  try {
			  //Criando a conexaxao com o banco de dados
			  Class.forName("org.postgresql.Driver");
			  String url = "jdbc:postgresql://chunee.db.elephantsql.com:5432/wtlkqqqk"; 
			  String usuarioDB = "wtlkqqqk"; 
			  String senhaDB = "c7_9T3rQzK9A5jSuXMZ9Czp-Rmbl-83w"; 	
			  
			  // retorno do metodo getconnection 
			  Connection cont = DriverManager.getConnection(url, usuarioDB, senhaDB);
			  saida.println(" Conexão realizada com sucesso !");
			  
			  String sql = "insert 	into 	pessoas (nomeCompleto, telefone, dtNascimento, email, sexo, tecnologia, escolaridade)"
			  +"values('"+nomeCompleto+"', '"+telefone+"', '"+dtNascimento+"', '"+email+"', '"+sexo+"', "
			  		+ "'"+lsTecnologia+"','"+escolaridade+"');";
			  
			  PreparedStatement pst = cont.prepareStatement(sql);
			  pst.execute();
			  pst.close();
			  cont.close();
			  
			  saida.println(" Registro gravado no bd !");
			  
		} catch (Exception e) {
			saida.println("Erro de conexão!");
		}
		  
		  saida.println("</html>");
	}
}
