/*
window.onload = function() {
	var center_div = document.getElementById("center_div");// 获取div块对象
	var height_browser = document.documentElement.clientHeight;// 取得浏览器页面可视区域的宽度
	var width_browser = document.documentElement.clientWidth;// 取得浏览器页面可视区域的宽度
	var height_div = center_div.offsetHeight;// 获取div块的高度值
	var width_div = center_div.offsetWidth;// 获取div块的宽度值
	center_div.style.top = (height_browser - height_div) / 2 + "px";
	center_div.style.left = (width_browser - width_div) / 2 + "px";
}
 */

// 登录处理
$(function() {

	$(".login-button").click(function() {
		// check通过时提交form
		if (checkLogin()) {
			$("form").submit();
		}
	})
})

/**
 * 登录check
 *
 * @returns
 */
function checkLogin() {

	// 必须check
	if ($(":text").val() == "") {
		$(":text").focus();
		alert("用户名不能为空！");
		return false;
	}
	if ($(":password").val() == "") {
		$(":password").focus();
		alert("用户密码不能为空！");
		return false;
	}
	return true;

}