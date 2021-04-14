<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrazione</title>
Registrazione
</head>
<body>
<form action="Servlet" method="post">
<input type="hidden" name="loginregistrazione" value="registrazione">
Nome: <input type="text" name="nome" placeholder="Nome"/>
Cognome: <input type="text" name="cognome" placeholder="Cognome"/>
Email: <input type="text" name="email" placeholder="Email"/>
Password: <input type="password" name="password" placeholder="Password"/>
Numero Appartamento: <input type="text" name="numero_appartamento" placeholder="Numero Appartamento"/>
Codice Fiscale: <input type="text" name="codice_fiscale" placeholder="Codice Fiscale"/>
Seleziona Palazzina: 
	<select name='id_palazzina'>
        <option value='1'>A</option>
        <option value='2'>B</option>
        <option value='3'>C</option>
    </select>

<button type="submit"> Registrati </button>
</form>

</body>
</html>