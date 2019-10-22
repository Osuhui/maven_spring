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

window.onload = function() {
	// 登录处理
	function login() {

		// check处理
		loginCheck();
	}

	// 登录check
	function loginCheck() {
		var userName = $("#login-useName").value;
		var userPwd = $("#login-userPwd").value;
		// 必须check
		if (userName == null || usePwd == null) {
			alert("用户名或密码不能为空！");
		}

	}

}
