<%--
  Created by IntelliJ IDEA.
  User: root
  Date: 11.12.15
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <title>Cities</title>
    <link rel="stylesheet" href="/css/listStyle.css" type="text/css">
</head>
<!--Pattern HTML-->
<%--
<section class="no-padding" id="portfolio">
    <div class="container-fluid">
        <div class="row no-gutter">
            <div class="col-lg-4 col-sm-6">
                <a href="/city?id=1" class="portfolio-box">
                    <img src="/img/kyiv1.jpg" class="img-responsive" alt="">
                    <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                            <div class="project-category text-faded">
                                City
                            </div>
                            <div class="project-name">
                                Kyiv
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a href="/city?id=4" class="portfolio-box">
                    <img src="/img/lviv.jpg" class="img-responsive" alt="">
                    <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                            <div class="project-category text-faded">
                                City
                            </div>
                            <div class="project-name">
                                Lviv
                            </div>
                        </div>
                    </div>
                </a>
            </div>
            <div class="col-lg-4 col-sm-6">
                <a href="/city?id=2" class="portfolio-box">
                    <img src="/img/moscow.jpg" class="img-responsive" alt="">
                    <div class="portfolio-box-caption">
                        <div class="portfolio-box-caption-content">
                            <div class="project-category text-faded">
                                City
                            </div>
                            <div class="project-name">
                                Moscow
                            </div>
                        </div>
                    </div>
                </a>
            </div>
        </div>
    </div>
</section>--%>
<%--<div id="pattern" class="pattern">
    <ul class="list img-list">

        <c:forEach var="city" items="${cities}">
            <li>
                <a href="/city?id=${city.id}" class="inner">
                    <div class="li-img">
                        <img src="http://bradfrost.github.com/this-is-responsive/patterns/images/fpo_square.png" alt="Image Alt Text" />
                    </div>
                    <div class="li-text">
                        <h4 class="li-head">${city.cityName}</h4>
                        <p class="li-summary">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Duis sit amet tellus velit, ut semper neque.</p>
                        <p class="li-action">Read More</p>
                    </div>
                </a>
            </li>
        </c:forEach>

    </ul>
</div>--%>
<div class="citiesTrial">
<div class="container">
    <h2 id="faq">CITIES</h2>
    <div id="products" class="row list-group">
        <c:forEach items="${cities}" var="city">
            <div class="item  col-xs-4 col-lg-4">
                <div class="thumbnail">
                    <img class="group list-group-image" src="" alt="" />
                    <div class="caption">
                        <h4 class="group inner list-group-item-heading">
                            ${city.cityName}</h4>
                        <p class="group inner list-group-item-text">
                            Product description... Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                            sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                        <div class="row">
                            <div class="col-xs-12 col-md-6">
                                <a class="btn btn-success" href="/city?id=${city.id}">View more</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
</div>
