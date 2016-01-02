<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 16.12.15
  Time: 20:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>
    <title>Apartments</title>
    <link rel="stylesheet" href="/css/listStyle.css" type="text/css">
</head>

<div class="citiesTrial">
    <div class="container">
        <h2 id="faq">APARTMENTS</h2>
        <div id="products" class="row list-group">
            <c:forEach items="${apartments}" var="apartment">
                    <div class="item  col-xs-4 col-lg-4">
                        <div class="thumbnail">
                            <img class="group list-group-image" src="" alt="" />
                            <div class="caption">
                                <h4 class="group inner list-group-item-heading">
                                        ${apartment.id}</h4>
                                <p class="group inner list-group-item-text">
                                    ${apartment.apartmentType}
                                </p>
                                <div class="row">
                                    <div class="col-xs-12 col-md-6">
                                        <a class="btn btn-success" href="/apartment?id=${apartment.id}">View more</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
            </c:forEach>
        </div>
    </div>
</div>