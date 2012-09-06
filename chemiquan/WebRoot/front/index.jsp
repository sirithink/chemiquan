<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.cmq.bean.UserInfor"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>index</title>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<META content="汽车圈" name=keywords>
<META content="汽车圈" name=description>
<link rel="icon" href="http://www.126.com/favicon.ico"
	type="image/x-icon" />
<link rel="shortcut icon" href="http://www.126.com/favicon.ico"
	type="image/x-icon" />

<link href="front/css/taobaomenu.css" rel="stylesheet" type="text/css" />
<link href="front/css/main.css" rel="stylesheet" type="text/css" />

<script src="front/js/jquery-1.4.2.min.js" type="text/javascript"></script>
<script src="front/js/taobaomenu.js" type="text/javascript"></script>
<script src="front/js/main.js" type="text/javascript"></script>


</head>

<body>
	<div id="page_menubar">
		<div id="page">
			<div class="chl-poster simple" id="header">
				<div id="site-nav">

					<div id="menu-left-text">
						<ul>
							<li>亲，欢迎来到汽车圈！</li>
							<%
								UserInfor user = (UserInfor) request.getSession().getAttribute("user");
								if (user == null) {
							%>
							<li><a href="front/login.html">登陆</a></li>
							<li><a href="front/regist.html">免费注册</a></li>
							<%
								} else {
							%>
							<li><a href="#"><%=user.getEmail()%></a></li>
							<%
								}
							%>
						</ul>
					</div>

					<ul class="quick-menu">
						<li class="home"><a href="#">汽车圈首页</a></li>
						<li><a href="#">自定义</a></li>
						<li class="mytaobao menu-item">
							<div class="menu">

								<a class="menu-hd" href="#" target="_top" rel="nofollow">自定义<B></B>
								</a>
								<div class="menu-bd">
									<div class="menu-bd-panel">
										<div>
											<a href="#" target="_top" rel="nofollow">自定义连接</a> <a
												href="#" target="_top" rel="nofollow">自定义连接</a>
										</div>
									</div>
									<S class="r"></S><S class="rt"></S><S class="lt"></S><S
										class="b"></S><S class="b b2"></S><S class="rb"></S><S
										class="lb"></S>
								</div>

							</div>
						</li>
						<!--<S></S>标签是根据前面CSS样式引入一个图标-->
						<li class="cart"><a href="#" target="_top" rel="nofollow"><S></S>自定义</a>
						</li>
						<li class="favorite"><a href="#" target="_top" rel="nofollow">收藏夹</a>
						</li>
						<li class="search menu-item">

							<div class="menu">
								<span class="menu-hd"><S></S>搜索<B></B> </span>

								<div class="menu-bd">

									<div class="menu-bd-panel">

										<form name="topSearch" action="#">
											<input maxLength="60" name="q" value="www.163css.com">
											<button type="submit">搜 索</button>
											<input type="hidden" value="newsearch" name="shopf">
										</form>

									</div>

									<S class="r"></S><S class="rt"></S><S class="lt"></S><S
										class="b"></S><S class="b b2"></S><S class="rb"></S><S
										class="lb"></S>

								</div>

							</div>
						</li>
						<li class="services menu-item last">
							<div class="menu">

								<A class=menu-hd href="#" target=_top>网站导航<B></B> </A>
								<div class=menu-bd
									style="WIDTH: 210px; HEIGHT: 262px; _width: 202px">
									<div class=menu-bd-panel>
										<DL>
											<DT>
												<A href="#" target=_top>购物</A>
											<DD>
												<A href="#" target=_top>商城</A> <A href="#" target=_top>电器城</A>
												<A href="#" target=_top>嗨淘</A> <A href="#" target=_top>全球购</A>
												<A href="#" target=_top>跳蚤街</A> <A href="#" target=_top>礼物</A>
												<A href="#" target=_top>促销</A> <A href="#" target=_top>机票</A>
												<A href="#" target=_top>彩票</A> <A href="#" target=_top>创意</A>
											</DD>
										</DL>
										<DL>
											<DT>
												<A href="#" target=_top>门户</A>
											<DD>
												<A href="#" target=_top>服饰</A> <A href="#" target=_top>女人</A>
												<A href="#" target=_top>美容</A> <A href="#" target=_top>居家</A>
												<A href="#" target=_top>男人</A> <A href="#" target=_top>数码</A>
												<A href="#" target=_top>亲子</A> <A href="#" target=_top>时尚</A>
												<A href="#" target=_top>试用</A> <A href="#" target=_top>心得</A>
												<A href="#" target=_top>帮派</A> <A href="#" target=_top>画报</A>
												<A href="#" target=_top>淘女郎</A> <A href="#" target=_top>社区</A>
												<A href="#" target=_top>宝贝传奇</A>
											</DD>
										</DL>
										<DL>
											<DT>
												<A href="#" target=_top>淘江湖</A> &nbsp;<A href="#"
													target=_top>手机淘宝</A>
											</DT>
										</DL>
										<DL>
											<DT>
												<A href="#" target=_top>帮助中心</A>
											<DD>
												<A href="#" target=_top>交易安全</A> <A href="#" target=_top>维权中心</A>
											</DD>
										</DL>
										<DL class=last>
											<DD>
												<STRONG style="FONT-WEIGHT: bold"><A href="#"
													target=_top>更多内容</A> </STRONG>
											</DD>
										</DL>
									</div>
									<S class=r></S><S class=rt></S><S class=lt></S><S class=b
										style="WIDTH: 169px"></S><S class="b b2" style="WIDTH: 169px"></S><S
										class=rb></S><S class=lb></S>

								</div>
						</li>
					</ul>

				</div>
			</div>
		</div>

	</div>


	<div id="main">

		<div id="main_top">

			<div id="main_top_left">汽车圈LOGO</div>

			<div id="main_top_right">

				<div id="main_top_right_content">

					<a href="#">发现精彩</a>| <a href="#">登陆</a>

				</div>
				<form name="f" action="#" method="post">
					<div id="main_top_right_search">

						<div class="searchbg">
							<div class="searchbg_1">
								<input type="text" name="search" class="searchinput" value="搜索" />
							</div>
						</div>

					</div>
				</form>

			</div>

		</div>


		<div id="main_center">

			<div id="main_center_content">
				<div id="main_left">
					<div id="main_left_infobg">
						<div id="main_left_infoimg">
							<img src="images/02.jpg" />
						</div>
						<div id="main_left_info_text">
							<div id="main_left_info_title">
								<p>香车美女圈</p>
								<input type="button" value="" class="main_sqjrbt" />
							</div>
							<div id="main_left_info_name">
								<p>圈主：</p>
								<p style="color:#0C0; font-weight:bold;">王君</p>
								<p style="margin:0px 0px 0px 20px;">管理员：</p>
								<p style="color:#0C0;">小晴</p>
							</div>
						</div>
						<div id="main_left_info_number">
							<p style="font-size:22px; color:#0C0;">1000</p>
							<p>圈友</p>
						</div>

						<div id="main_left_info_js">2012伦敦奥运会，中国军团首金有奖竞猜！</div>

					</div>

					<!--main_left_infobg end-->

					<div id="main_left_ggbg">
						<div id="main_left_gginfo">
							<div id="main_left_ggtext">圈内公告</div>
							<marquee direction="up" scrollamount="2">
								<ul>
									<li>【远游】2012伦敦奥运会，中国军团首金有奖竞猜！</li>
									<li>【讨论】2012伦敦奥运会，中国军团首金有奖竞猜！</li>
								</ul>
							</marquee>
						</div>
					</div>

					<div id="main_left_ftbg">

						<div id="main_left_fttext">发表新帖：</div>

						<div id="main_left_ftarrow"></div>

						<div id="main_left_ftcontent">
							你还是游客，请先 <a href="#">登陆</a>
						</div>

					</div>

				</div>
				<div id="main_right">
					<div id="main_right_zxcybg">
						<div id="main_right_zxcytitle">
							<p style="float:left;">最新成员</p>
							<p style="float:right; color:#330;">所有(2000)</p>
						</div>
						<div id="main_right_zxcytext">
							<ul>
								<li><img src="images/02.jpg" />
									<p style="color:#6F0; font-weight:bold;">蜡笔小新2012 [level
										10]</p>
									<p>喜欢了解各种各样的车</p>
								</li>
								<li><img src="images/02.jpg" />
									<p style="color:#6F0; font-weight:bold;">蜡笔小新2012 [level
										10]</p>
									<p>喜欢了解各种各样的车</p>
								</li>
								<li><img src="images/02.jpg" />
									<p style="color:#6F0; font-weight:bold;">蜡笔小新2012 [level
										10]</p>
									<p>喜欢了解各种各样的车</p>
								</li>
								<li><img src="images/02.jpg" />
									<p style="color:#6F0; font-weight:bold;">蜡笔小新2012 [level
										10]</p>
									<p>喜欢了解各种各样的车</p>
								</li>
							</ul>
						</div>
					</div>
					<!--main_right_zxcybg end-->
				</div>
			</div>

			<!--页面样式-->
			<div id="main_center_page"
				onmouseover="showButtonOver('show_button1')"
				onmouseout="showButtonOut('show_button1')">

				<div id="show_button1" style=" display:none; float:left;">

					<div class="page_button1">
						<p>Repin</p>
					</div>

					<div class="page_button2">
						<p>Like</p>
					</div>

					<div class="page_button3">
						<p>Comment</p>
					</div>

				</div>

				<div id="main_center_photo">
					<img src="images/02.jpg" />
				</div>

				<div id="main_center_photoinfo">hunger games hunger games
					hunger games!</div>

				<div id="main_center_text">
					<p>10 like</p>
					<p>10 comment</p>
					<p>230 repins</p>
				</div>

				<div id="main_center_comment">comment</div>

			</div>

			<!--main_center_page end-->

			<div id="main_center_page"
				onmouseover="showButtonOver('show_button2')"
				onmouseout="showButtonOut('show_button2')">

				<div id="show_button2" style=" display:none; float:left;">

					<div class="page_button1">
						<p>Repin</p>
					</div>

					<div class="page_button2">
						<p>Like</p>
					</div>

					<div class="page_button3">
						<p>Comment</p>
					</div>

				</div>

				<div id="main_center_photo">
					<img src="images/02.jpg" />
				</div>

				<div id="main_center_photoinfo">hunger games hunger games
					hunger games!</div>

				<div id="main_center_text">
					<p>10 like</p>
					<p>10 comment</p>
					<p>230 repins</p>
				</div>

				<div id="main_center_comment">comment</div>

			</div>

			<div id="main_center_page"
				onmouseover="showButtonOver('show_button3')"
				onmouseout="showButtonOut('show_button3')">

				<div id="show_button3" style=" display:none; float:left;">

					<div class="page_button1">
						<p>Repin</p>
					</div>

					<div class="page_button2">
						<p>Like</p>
					</div>

					<div class="page_button3">
						<p>Comment</p>
					</div>

				</div>

				<div id="main_center_photo">
					<img src="images/02.jpg" />
				</div>

				<div id="main_center_photoinfo">hunger games hunger games
					hunger games!</div>

				<div id="main_center_text">
					<p>10 like</p>
					<p>10 comment</p>
					<p>230 repins</p>
				</div>

				<div id="main_center_comment">comment</div>

			</div>

			<div id="main_center_page"
				onmouseover="showButtonOver('show_button4')"
				onmouseout="showButtonOut('show_button4')">

				<div id="show_button4" style=" display:none; float:left;">

					<div class="page_button1">
						<p>Repin</p>
					</div>

					<div class="page_button2">
						<p>Like</p>
					</div>

					<div class="page_button3">
						<p>Comment</p>
					</div>

				</div>

				<div id="main_center_photo">
					<img src="images/02.jpg" />
				</div>

				<div id="main_center_photoinfo">hunger games hunger games
					hunger games!</div>

				<div id="main_center_text">
					<p>10 like</p>
					<p>10 comment</p>
					<p>230 repins</p>
				</div>

				<div id="main_center_comment">comment</div>

			</div>

			<div id="main_center_content">
				<div class="manu">
					<span class="disabled"> < Prev</span> <span class="current">1</span>
					<a href="#?page=2">2</a> <a href="#?page=3">3</a> <a
						href="#?page=4">4</a> <a href="#?page=5">5</a> <a href="#?page=6">6</a>
					<a href="#?page=7">7</a> ... <a href="#?page=199">199</a> <a
						href="#?page=200">200</a> <a href="#?page=2">Next > </a>
				</div>
			</div>

			<div id="main_center_content">
				<div id="main_left">

					<div id="main_left_cylbbg">
						<div id="main_left_cylbmenu">
							<ul>
								<li id="cylb1_li1" class="cylb1active"
									onclick="showTagClick('1','3','cylb1','cylb1active')">全部</li>
								<li id="cylb1_li2"
									onclick="showTagClick('2','3','cylb1','cylb1active')">精华</li>
								<li id="cylb1_li3"
									onclick="showTagClick('3','3','cylb1','cylb1active')">宝贝</li>
							</ul>
						</div>

						<!--main_left_cylbcontent  cylb_1 -->

						<div class="main_left_cylbcontent" style="display:block;"
							id="cylb1_1">

							<div id="main_left_cylb_cybg">

								<div id="main_left_cylb_cyimg">
									<img src="images/02.jpg" />
									<p style="color:#690;">[L 1] 入门圈友</p>
								</div>

								<div id="main_left_cylb_larrow"></div>

								<div id="main_left_cylb_infobg">
									<div id="main_left_cylb_infotitle">
										<p style="color:#690; font-weight:bold;">蜡笔小新2012：</p>
										<p>我来自潮州</p>
									</div>
									<div id="main_left_cylb_infoimg">
										<!--如果要设为精华就添加下面div   cylb_jjtb-->
										<div class="cylb_jjtb"></div>
										<ul>
											<li><img src="images/03.jpg" /></li>
											<li><img src="images/03.jpg" /></li>
											<li><img src="images/03.jpg" /></li>
											<li><img src="images/03.jpg" /></li>
										</ul>
										<p>分享图片</p>
										<p>
											<a href="#" style="color:#690;">[查看原文]</a>
										</p>
									</div>

									<div id="main_left_cylb_infobottom">
										<div id="main_left_cylb_infobottom_left">2012-01-01 被回复</div>
										<div id="main_left_cylb_infobottom_right">
											<ul>
												<li style="background:url(images/zk-ico.jpg) no-repeat;">展开</li>
												<li style="background:url(images/z-ico.jpg) no-repeat;">赞(10)</li>
												<li style="background:url(images/hf-ico.jpg) no-repeat;">回复(2)</li>
												<li style="background:url(images/fx-ico.jpg) no-repeat;">分享</li>
											</ul>
										</div>
									</div>

								</div>

							</div>

							<div id="main_left_cylb_menubg">
								<div class="manu">
									<span class="disabled"> < Prev</span> <span class="current">1</span>
									<a href="#?page=2">2</a> <a href="#?page=3">3</a> <a
										href="#?page=4">4</a> <a href="#?page=5">5</a> <a
										href="#?page=6">6</a> <a href="#?page=7">7</a> ... <a
										href="#?page=199">199</a> <a href="#?page=200">200</a> <a
										href="#?page=2">Next > </a>
								</div>
							</div>

						</div>

						<!--main_left_cylbcontent  cylb_1  end-->

						<!--main_left_cylbcontent  cylb_2 -->

						<div class="main_left_cylbcontent" style="display:none;"
							id="cylb1_2">

							<div id="main_left_cylb_cybg">

								<div id="main_left_cylb_cyimg">
									<img src="images/02.jpg" />
									<p style="color:#690;">[L 1] 入门圈友</p>
								</div>

								<div id="main_left_cylb_larrow"></div>

								<div id="main_left_cylb_infobg">
									<div id="main_left_cylb_infotitle">
										<p style="color:#690; font-weight:bold;">蜡笔小新2012：</p>
										<p>我来自潮州</p>
									</div>
									<div id="main_left_cylb_infoimg">
										<div class="cylb_jjtb"></div>
										<ul>
											<li><img src="images/03.jpg" /></li>
											<li><img src="images/03.jpg" /></li>
										</ul>
										<p>分享图片</p>
										<p>
											<a href="#" style="color:#690;">[查看原文]</a>
										</p>
									</div>

									<div id="main_left_cylb_infobottom">
										<div id="main_left_cylb_infobottom_left">2012-01-01 被回复</div>
										<div id="main_left_cylb_infobottom_right">
											<ul>
												<li style="background:url(images/zk-ico.jpg) no-repeat;">展开</li>
												<li style="background:url(images/z-ico.jpg) no-repeat;">赞(10)</li>
												<li style="background:url(images/hf-ico.jpg) no-repeat;">回复(2)</li>
												<li style="background:url(images/fx-ico.jpg) no-repeat;">分享</li>
											</ul>
										</div>
									</div>

								</div>

							</div>

							<div id="main_left_cylb_menubg">
								<div class="manu">
									<span class="disabled"> < Prev</span> <span class="current">1</span>
									<a href="#?page=2">2</a> <a href="#?page=3">3</a> <a
										href="#?page=4">4</a> <a href="#?page=5">5</a> <a
										href="#?page=6">6</a> <a href="#?page=7">7</a> ... <a
										href="#?page=199">199</a> <a href="#?page=200">200</a> <a
										href="#?page=2">Next > </a>
								</div>
							</div>

						</div>

						<!--main_left_cylbcontent  cylb_2  end-->

						<!--main_left_cylbcontent  cylb_3 -->

						<div class="main_left_cylbcontent" style="display:none;"
							id="cylb1_3">

							<div id="main_left_cylb_cybg">

								<div id="main_left_cylb_cyimg">
									<img src="images/02.jpg" />
									<p style="color:#690;">[L 1] 入门圈友</p>
								</div>

								<div id="main_left_cylb_larrow"></div>

								<div id="main_left_cylb_infobg">
									<div id="main_left_cylb_infotitle">
										<p style="color:#690; font-weight:bold;">蜡笔小新2012：</p>
										<p>我来自潮州</p>
									</div>
									<div id="main_left_cylb_infoimg">
										<ul>
											<li><img src="images/03.jpg" /></li>
											<li><img src="images/03.jpg" /></li>
											<li><img src="images/03.jpg" /></li>
										</ul>
										<p>分享图片</p>
										<p>
											<a href="#" style="color:#690;">[查看原文]</a>
										</p>
									</div>

									<div id="main_left_cylb_infobottom">
										<div id="main_left_cylb_infobottom_left">2012-01-01 被回复</div>
										<div id="main_left_cylb_infobottom_right">
											<ul>
												<li style="background:url(images/zk-ico.jpg) no-repeat;">展开</li>
												<li style="background:url(images/z-ico.jpg) no-repeat;">赞(10)</li>
												<li style="background:url(images/hf-ico.jpg) no-repeat;">回复(2)</li>
												<li style="background:url(images/fx-ico.jpg) no-repeat;">分享</li>
											</ul>
										</div>
									</div>

								</div>

							</div>


							<div id="main_left_cylb_menubg">
								<div class="manu">
									<span class="disabled"> < Prev</span> <span class="current">1</span>
									<a href="#?page=2">2</a> <a href="#?page=3">3</a> <a
										href="#?page=4">4</a> <a href="#?page=5">5</a> <a
										href="#?page=6">6</a> <a href="#?page=7">7</a> ... <a
										href="#?page=199">199</a> <a href="#?page=200">200</a> <a
										href="#?page=2">Next > </a>
								</div>
							</div>

						</div>

						<!--main_left_cylbcontent  cylb_3  end-->

					</div>

				</div>
				<div id="main_right">

					<div id="main_right_zxcybg">
						<div id="main_right_zxcytitle">精彩推荐</div>
						<div id="main_right_zxcytext">

							<div id="main_right_jctjimgbg">
								<img src="images/jctj.jpg" />
							</div>

							<div id="main_right_jctjlb">
								<ul>
									<li>关注圈子小秘书</li>
									<li>给我们提意见</li>
									<li>联系我们</li>
								</ul>
							</div>

						</div>
					</div>
					<!--main_right_zxcybg end-->

					<div id="main_right_zxcybg" style="margin:10px 0px 0px 5px;">
						<div id="main_right_zxcytitle">您可能对这些圈子感兴趣</div>
						<div id="main_right_zxcytext">
							<ul>
								<li>【远游】八月十五中秋，一起去黄山。</li>
								<li>【远游】八月十五中秋，一起去黄山。</li>
								<li>【远游】八月十五中秋，一起去黄山。</li>
								<li>【远游】八月十五中秋，一起去黄山。</li>
							</ul>
						</div>
					</div>
					<!--main_right_zxcybg end-->

					<div
						style="width:295px; height:40px; line-height:40px; text-align:center; cursor:pointer; background:#eee; float:left;margin:10px 0px 0px 5px;">
						查看所有圈子</div>

				</div>
			</div>

		</div>

		<div id="main_foot">

			<div id="main_foot_left">POWERD BY Jadmin1.3 @ 2012-2012
				QICHEQUAN.COM All Rights Reserved.</div>

			<div id="main_foot_right">
				<a href="#">联系我们</a> <a href="#">联系我们</a> <a href="#">联系我们</a> <a
					href="#">联系我们</a>
			</div>

		</div>
	</div>



</body>
</html>
