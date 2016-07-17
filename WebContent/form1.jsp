<%@ page language="java" contentType="text/html; charset=ISO-8859-9"
    pageEncoding="ISO-8859-9"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-9">
<title>Insert title here</title>
</head>
<body>
<form action="/JSPForms/FormController" method="post" > 

AD:<input type="text" name="ad"/><br/>
SOYAD:<input type="text" name="soyad"/><br/>
İL:<input type="text" name="il"/><br/>
HANGİ PROGRAMLAMA DİLİNİ KULLANIYORSUN:<br/>
<select name="dil">
<option value="JAVA">JAVA</option>
<option value="C#">C#</option>
<option value="PHP">PHP</option>
<option value="PHYTON">PHYTON</option>
</select><br/>
HANGİ İŞLETİM SİSTEMİ:<br/>
<input type="radio"  name="os" value="LINUX" />LINUX<br/>
<input type="radio"  name="os" value="UNIX" />UNIX<br/>
<input type="radio"  name="os" value="WINDOWS" />WİNDOWS<br/>

<input type="submit" value="KAYIT" />


</form>
</body>
</html>