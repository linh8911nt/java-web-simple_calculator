<%--
  Created by IntelliJ IDEA.
  User: nguyenthanhlinh
  Date: 4/27/18
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
  .login {
    height:280px; width:230px;
    margin:0;
    padding:10px;
    border:1px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<form method="post" action="/display-discount">
  <div class="login">
    <h2>Product Discount Calculator</h2>
    First operand:
    <input type="text" name="FirstOperand" size="30"  placeholder="First operand" />
    Operator:
    <select name="Operator">
      <option value="add">add</option>
      <option value="sub">sub</option>
      <option value="multiple">multiple</option>
      <option value="division">division</option>
    </select><br><br>
    Second operand:
    <input type="text" name="SecondOperand" size="30" placeholder="Second Operand" />
    <input type="submit" value="Calculate"/>
  </div>
</form>
</body>
</html>
