<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Calculate</title>
</head>
<body>
<h3>add</h3>
	<s:form>
		<html:text property="args1"/> + <html:text property="args2"/>
		<input type="submit" name="calculate" value="add"/>
	</s:form>
</body>
</html>