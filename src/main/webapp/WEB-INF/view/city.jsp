
<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 15.12.15
  Time: 0:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--

Take a look at this wonderful widget by José Polanco
http://dribbble.com/shots/1439808-Profile-Widget

-->

<head>

    <link rel="stylesheet" href="/css/profile.css" type="text/css">
</head>

<div class="widget">
    <div class="cover">
        <img src="http://25.media.tumblr.com/d55a509993790027240311c9f611aaf8/tumblr_n0hpzpKEfE1st5lhmo1_1280.jpg" />
    </div>
    <h1>${city.cityName}</h1>
    <div class="widgetAdd">
        <div class="header-content">
            <div class="header-content-inner">
                <a href="/apartments?cityId=${city.id}" class="btn btn-primary btn-xl page-scroll">Apartments</a>
            </div>
        </div>
    </div>
</div>
