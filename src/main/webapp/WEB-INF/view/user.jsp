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
    <img src="/img/profilePhoto.jpg" class="photo" />
    <h1>${user.name} ${user.lastname}</h1>
    <div class="widgetAdd">
    <div class="header-content">
        <div class="header-content-inner">
            <a href="#about" class="btn btn-primary btn-xl page-scroll">Add apartment</a>
        </div>
    </div>
    </div>
</div>

<section class="bg-primary" id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <h2 class="section-heading">Register your apartment</h2>
                <hr class="light">
                <form id="msform" action="/user" method="post">
                    <fieldset>
                        <h2 class="fs-title">Input info about apartment</h2>
                        <input type="text" name="apartmentType" placeholder="Type" />
                        <input type="text" name="cityName" placeholder="City" />
                        <input type="date" name="begin" placeholder="Date from" />
                        <input type="date" name="end" placeholder="Date to" />
                        <button name="next" type="submit" class="nextaction-button" value="Register">Register</button>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</section>