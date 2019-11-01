<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/10/30 0030
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <button style="width:50px;height:50px;background: #0e90d2;cursor: pointer;" id="btn_login">登录</button>
    <script src="js/jquery-1.8.2.min.js"></script>
    <script>
        $(function () {
            $("#btn_login").click(function () {
                $.ajax({
                    url:"Login",
                    // method:"POST",
                    type:"POST",
                    data:{},
                    dataType:"json",
                    beforeSend:function (XMLHttpRequest) {},
                    success:function (data,textStatus,XMLHttpRequest) {
                        console.info(data);
                    },
                    error:function (XMLHttpRequest,textStatus,errorThorwn) {
                        console.error(XMLHttpRequest);
                        console.error(textStatus);
                        console.error(errorThorwn)
                    },
                    complete:function (XMLHttpRequest,textStatus) {}
                })
            });
        })
    </script>
</body>
</html>
