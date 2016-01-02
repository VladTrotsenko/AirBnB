<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<head>

    <link rel="stylesheet" href="/css/profile.css" type="text/css"/>
</head>

<div class="widget">
    <div class="cover">
        <img src="http://25.media.tumblr.com/d55a509993790027240311c9f611aaf8/tumblr_n0hpzpKEfE1st5lhmo1_1280.jpg"/>
    </div>
    <h1>${apartment.apartmentType}</h1>
    <h2>${apartment.begin} ${apartment.end}</h2>
</div>

<section class="bg-primary" id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <h2 class="section-heading">Book apartment</h2>
                <hr class="light">
                <form id="msform" action="/apartment" method="post">
                    <fieldset>
                        <h2 class="fs-title">Selelct date you want to book</h2>
                        <input type="date" name="beginBook" placeholder="Date from" />
                        <input type="date" name="endBook" placeholder="Date to" />
                        <button name="next" type="submit" class="nextaction-button" value="Book">Book</button>
                    </fieldset>
                </form>
            </div>
        </div>
    </div>
</section>
