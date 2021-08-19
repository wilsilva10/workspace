<%@page import="org.senai.model.Pessoa"%>
<%@page import="java.util.List"%>
<%@page import="org.senai.dao.PessoaDao"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="org.senai.db.Conexao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Listar Pessoas</title>


<style>
fieldset {
    width: 50%;
    margin: auto;
    border: 2px solid blueviolet;
}

body {
    font-family: Helvetica, sans-serif;
    font-size: 12px;
    font-weight: bold;
    color: blue;
    background-color: #fcf9bc;
  }
  


td {
  text-align: center;
  border-left-width: 100px;
  min-width: 150px;
  height: 20px;
}
a:hover {
    cursor: pointer;
    background-color: blueviolet;
    color: white;
}

a {
    border: 2px solid blueviolet;
    background-color: white;
    font-weight: bold;
    color:blueviolet;
    padding: 5px 10px;
    border-radius: 5px;
    float: right;
    text-decoration: none;
}




</style>
</head>
<body>

	<%
	PessoaDao objDao = new PessoaDao();
	List<Pessoa> ls = objDao.listarPessoa();
	if (ls.size() > 0) {
	%>
		<fieldset>
	<table class="table">

		<tr>
			<th>ID</th>
			<th>Nome</th>
			<th>E-mail</th>
			<th>Ação</th>
		</tr>

		<%
		for (Pessoa p : ls) {
		%>
		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getNomeCompleto()%></td>
			<td><%=p.getEmail()%></td>
			<td>
			<a href="formCadastro.jsp?id=<%=p.getId()%>" >Editar</a>
			<a href="cadastroServlet?acao=apagar&id=<%=p.getId()%>" > Apagar</a>
			</td>
		</tr>
		<%
		}
		%>

	</table>
	</fieldset>
	<%
	}
	%>
</body>
</html>