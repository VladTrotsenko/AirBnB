<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<header>
    <div class="header-content">
        <div class="header-content-inner">
            <a href="#about" class="btn btn-primary btn-xl page-scroll">Find Out More</a>
        </div>
    </div>
</header>

<section class="bg-primary" id="about">
    <div class="container">
        <div class="row">
            <div class="col-lg-8 col-lg-offset-2 text-center">
                <h2 class="section-heading">Need some help?</h2>
                <hr class="light">
                <p class="text-faded">Click here and get information about how airbnb works.
                    Here you can find needed information and answers the most popular questions as well.</p>
                <a href="#" class="btn btn-default btn-xl" >Get help</a>
            </div>
        </div>
    </div>
</section>

<section id="services">
    <div class="container">
        <div class="row">
            <div class="col-lg-12 text-center">
                <h2 class="section-heading">About</h2>
            </div>
        </div>
    </div>
    <div class="container">
        <div class="row">
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                   <%-- <i class="fa fa-4x fa-diamond wow bounceIn text-primary">--%>
                        <img src="/img/book.png"/>
                    <%--</i>--%>
                    <h3>Book apartment</h3>
                    <p class="text-muted">In one click you can book an apartment.</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <%--<i class="fa fa-4x fa-paper-plane wow bounceIn text-primary" data-wow-delay=".1s">
                    --%>    <img src="/img/send.png"/>
                    <%--</i>--%>
                    <h3>Connect with host</h3>
                    <p class="text-muted">Every host has contacts on his apartment's page and you can easily connect him.</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <%--<i class="fa fa-4x fa-newspaper-o wow bounceIn text-primary" data-wow-delay=".2s">
                     --%>   <img src="/img/notes16.png"/>
                   <%-- </i>--%>
                    <h3>Post apartment</h3>
                    <p class="text-muted">You can easily become host and post an ad about your apartment.</p>
                </div>
            </div>
            <div class="col-lg-3 col-md-6 text-center">
                <div class="service-box">
                    <%--<i class="fa fa-4x fa-heart wow bounceIn text-primary" data-wow-delay=".3s">
                    --%>    <img src="/img/heart13.png"/>
                   <%-- </i>--%>
                    <h3>Made with Love</h3>
                    <p class="text-muted">Our service is made with love and care about our users. Enjoy!</p>
                </div>
            </div>
        </div>
    </div>
</section>

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
</section>


<aside class="bg-dark">
    <div class="container text-center">
        <div class="call-to-action">
            <h2>Not sure where to go?</h2>
            <p>Here's the whole list of cites in which you can find suitable
                apartment for you. Airbnb will help you to make right choice. Click to see it!</p>
            <a href="/cities" class="btn btn-default btn-xl wow tada">Cities</a>
        </div>
    </div>
</aside>
