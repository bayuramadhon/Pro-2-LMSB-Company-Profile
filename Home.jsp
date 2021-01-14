<%-- 
    Document   : Home
    Created on : Jul 31, 2018, 2:45:03 PM
    Author     : Bayu Ramadhan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page contentType="text/html"%>



<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8"/>
        <title>LMSB</title>


        <link rel="stylesheet" media="all" href="css/style.css"/>
        <meta name="viewport" content="width=device-width, initial-scale=1"/>
        <!-- Adding "maximum-scale=1" fixes the Mobile Safari auto-zoom bug: http://filamentgroup.com/examples/iosScaleBug/ -->		

        <!-- JS -->
        <script src="js/jquery-1.7.1.min.js"></script>
        <script src="js/custom.js"></script>
        <script src="js/tabs.js"></script>
        <script src="js/css3-mediaqueries.js"></script>
        <script src="js/jquery.columnizer.min.js"></script>

        <!-- Isotope -->
        <script src="js/jquery.isotope.min.js"></script>

        <!-- Lof slider -->
        <script src="js/jquery.easing.js"></script>
        <script src="js/lof-slider.js"></script>
        <link rel="stylesheet" href="css/lof-slider.css" media="all"  /> 
        <!-- ENDS slider -->

        <!-- Tweet -->
        <link rel="stylesheet" href="css/jquery.tweet.css" media="all"  /> 
        <script src="js/jquery.tweet.js" ></script> 
        <!-- ENDS Tweet -->

        <!-- superfish -->
        <link rel="stylesheet" media="screen" href="css/superfish.css" /> 
        <script  src="js/hoverIntent.js"></script>
        <script  src="js/superfish.js"></script>
        <script  src="js/supersubs.js"></script>
        <!-- ENDS superfish -->

        <!-- prettyPhoto -->
        <script  src="js/jquery.prettyPhoto.js"></script>
        <link rel="stylesheet" href="css/prettyPhoto.css"  media="screen" />
        <!-- ENDS prettyPhoto -->

        <!-- poshytip -->
        <link rel="stylesheet" href="css/tip-twitter.css"  />
        <link rel="stylesheet" href="css/tip-yellowsimple.css"  />
        <script  src="js/jquery.poshytip.min.js"></script>
        <!-- ENDS poshytip -->

        <!-- JCarousel -->
        <script type="text/javascript" src="js/jquery.jcarousel.min.js"></script>
        <link rel="stylesheet" media="screen" href="css/carousel.css" /> 
        <!-- ENDS JCarousel -->

        <!-- GOOGLE FONTS -->
        <link href='http://fonts.googleapis.com/css?family=Voltaire' rel='stylesheet' type='text/css'>

        <!-- modernizr -->
        <script src="js/modernizr.js"></script>

        <!-- SKIN -->
        <link rel="stylesheet" media="all" href="css/skin.css"/>

        <!-- Less framework -->
        <link rel="stylesheet" media="all" href="css/lessframework.css"/>
            
        <!-- jplayer -->
        <link href="player-skin/jplayer-black-and-yellow.css" rel="stylesheet" type="text/css" />
        <script type="text/javascript" src="../js/jquery.jplayer.min.js"></script>
        
        <!-- flexslider -->
        <link rel="stylesheet" href="css/flexslider.css" >
        <script src="js/jquery.flexslider.js"></script>

    </head>


    <body class="home">

        <!-- HEADER -->
        <header>
            <div class="wrapper cf">

                <div id="logo">
                    <a href="index.html"> <img src="image/LMSB.png" alt="LMSB"></a>
                </div>

                <!-- nav -->
               <%@include file="Header.jsp" %>
                <div id="combo-holder"></div>
                <!-- ends nav -->


                <!-- SLIDER -->				
                <div id="home-slider" class="lof-slidecontent">

                    <div class="preload"><div></div></div>

                    <!-- slider content --> 
                    <div class="main-slider-content" >
                        <ul class="sliders-wrap-inner">
                            <li>
                                <img src="image/cd.jpg" title="" alt="alt" width="900" />           
                                <div class="slider-description">
                                    <h4>Application Development</h4>
                                    <p>Application Development adalah mengembangkan aplikasi untuk sebuah perusahaan berskala besar maupun kecil,kami mempunyai developer aplikasi yang handal untuk bisa mengelola aplikasi perusahaan anda dan mengembangkannnya 
                                        <a class="link" href="#">Read more </a>
                                    </p>
                                </div>
                            </li>

                            <li>
                                <img src="image/arrm.jpg" title="" alt="alt" width="900" height="400" />           
                                <div class="slider-description">
                                    <h4>ROBOTIC</h4>
                                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est...
                                        <a class="link" href="#">Read more </a>
                                    </p>
                                </div>
                            </li>

                            <li>
                                <img src="image/graphic.jpg" title="" alt="alt" width="900" height="400" />           
                                <div class="slider-description">
                                    <h4>IoT</h4>
                                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est...
                                        <a class="link" href="#">Read more </a>
                                    </p>
                                </div>
                            </li>

                            <li>
                                <img src="image/web2.jpg" title="" alt="alt"  style = "padding: 0; margin : 0; width:100%"  />           
                                <div class="slider-description">
                                    <h4>WEB</h4>
                                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est...
                                        <a class="link" href="#">Read more </a>
                                    </p>
                                </div>
                            </li>

                            <li>
                                <img src="image/gedung.jpg" title="" alt="alt" />           
                                <div class="slider-description">
                                    <h4>  wkwkw </h4>
                                    <p>Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est...
                                        <a class="link" href="#">Read more </a>
                                    </p>
                                </div>
                            </li>
                        </ul>  	
                    </div>
                    <!-- ENDS slider content --> 

                    <!-- slider nav -->
                    <div class="navigator-content">
                        <div class="navigator-wrapper">
                            <ul class="navigator-wrap-inner">
                                <li><img src="image/cd.jpg" alt="coding" width="200" /></li>
                                <li><img src="image/ar.jpg" alt="alt" width="190" /></li>
                                <li><img src="image/graphic.jpg" alt="alt" width="190" /></li>
                                <li><img src="image/web2.jpg" alt="alt" width="200" /></li>
                                <li><img src="image/gedung.jpg" alt="alt" width="200" /></li>

                            </ul>
                        </div>
                        <div class="button-next">Next</div>
                        <div  class="button-previous">Previous</div>
                        <!-- REMOVED TILL FIXED <div class="button-control"><span>STOP</span></div> -->
                    </div> 
                    <!-- slider nav -->



                </div> 
                <!-- ENDS SLIDER -->





            </div>
        </header>
        <!-- ENDS HEADER -->

        <!-- MAIN -->
        <div id="main">
            <div class="wrapper cf">





                <!-- featured -->
                <div class="home-featured">

                    <ul id="filter-buttons">
                        <li><a href="#" data-filter="*" class="selected">show all</a></li>
                        <li><a href="#" data-filter=".Aplication_Development">Aplication development</a></li>
                        <li><a href="#" data-filter=".Robotic">Robotic</a></li>
                        <li><a href="#" data-filter=".web">Web</a></li>
                        <li><a href="#" data-filter=".iot">IOT</a></li>
                    </ul>

                    <!-- Filter container -->
                    <div id="filter-container" class="cf">
                        <figure class="Aplication_Development">
                            <a href="project.html" class="thumb"><img src="image/coding2.jpg" style="height:179px; width: 282px ;"  /></a>
                            <figcaption>
                                <a href="project.html"><h3 class="heading">APLICATION DEVELOPMENT </h3></a>
                                Tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. </figcaption>
                        </figure>

                        <figure class="Robotic">
                            <a href="project.html" class="thumb"><img src="image/laba2.jpg" style="height:179px; width: 282px ;" /></a>
                            <figcaption>
                                <a href="project.html"><h3 class="heading">robotik</h3></a>
                                Tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. </figcaption>
                        </figure>


                        <figure class="web">
                            <a href="project.html" class="thumb"><img src="image/web1.png" style="height:179px; width: 282px ;"  /></a>
                            <figcaption>
                                <a href="project.html" ><h3 class="heading">WEB</h3></a>
                                Tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. </figcaption>
                        </figure>


                        <figure class="iot">
                            <a href="project.html" class="thumb"><img src="image/iiot.png" style="height:179px; width: 282px ;" /></a>
                            <figcaption>
                                <a href="project.html" ><h3 class="heading">IoT</h3></a>
                                Tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean ultricies mi vitae est. </figcaption>
                        </figure>




                    </div><!-- ENDS Filter container -->

                </div>
                <!-- ENDS featured -->




            </div><!-- ENDS WRAPPER -->
        </div>
        <!-- ENDS MAIN -->


        <!-- FOOTER -->
        <footer>
            <div class="wrapper cf">

                <!-- widgets -->
                <ul  class="widget-cols cf">
                    <li class="first-col">

                        <div class="widget-block">
                            <h4>RECENT POSTS</h4>
                            <div class="recent-post cf">
                                <a href="#" class="thumb"><img src="img/dummies/54x54.gif" alt="Post" /></a>
                                <div class="post-head">
                                    <a href="#">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>
                                </div>
                            </div>
                            <div class="recent-post cf">
                                <a href="#" class="thumb"><img src="img/dummies/54x54.gif" alt="Post" /></a>
                                <div class="post-head">
                                    <a href="#">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>
                                </div>
                            </div>
                            <div class="recent-post cf">
                                <a href="#" class="thumb"><img src="img/dummies/54x54.gif" alt="Post" /></a>
                                <div class="post-head">
                                    <a href="#">Pellentesque habitant morbi senectus</a><span> March 12, 2011</span>
                                </div>
                            </div>
                        </div>
                    </li>

                    <li class="second-col">

                        <div class="widget-block">
                            <h4>ABOUT</h4>
                            <p>Folder it's completely free this means you don't have to pay anything <a href="http://luiszuno.com/blog/license" tar >read license</a>.</p> 
                            <p>Visit <a href="http://templatecreme.com/" >Template Creme</a> and find the most beautiful free templates up to date.</p>
                        </div>

                    </li>

                    <li class="third-col">

                        <div class="widget-block">
                            <div id="tweets" class="footer-col tweet">
                                <h4>TWITTER WIDGET</h4>
                            </div>
                        </div>

                    </li>

                    <li class="fourth-col">

                        <div class="widget-block">
                            <h4>CATEGORIES</h4>
                            <ul>
                                <li class="cat-item"><a href="#" >Design</a></li>
                                <li class="cat-item"><a href="#" >Photo</a></li>
                                <li class="cat-item"><a href="#" >Art</a></li>
                                <li class="cat-item"><a href="#" >Game</a></li>
                                <li class="cat-item"><a href="#" >Film</a></li>
                                <li class="cat-item"><a href="#" >TV</a></li>
                            </ul>
                        </div>

                    </li>	
                </ul>
                <!-- ENDS widgets -->	


                <!-- bottom -->
                <div class="footer-bottom">
                    <div class="left">by <a href="http://luiszuno.com" >luiszuno.com</a></div>
                    <ul id="social-bar" class="cf sb">
                        <li><a href="http://www.facebook.com"  title="Become a fan" class="facebook">Facebbok</a></li>
                        <li><a href="http://www.twitter.com" title="Follow my tweets" class="twitter"></a></li>
                        <li><a href="http://plus.google.com" title="Enter my circles" class="plus"></a></li>
                    </ul>
                </div>	
                <!-- ENDS bottom -->

            </div>
        </footer>
        <!-- ENDS FOOTER -->

    </body>



</html>
</html>
