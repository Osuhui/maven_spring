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


/*
$(document).ready(function() {
	alert("jquery test");

})*/

function hasClass(elem, cls) {
	cls = cls || '';
	if (cls.replace(/\s/g, '').length == 0)
		return false;
	//当cls没有参数时，返回false
	return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
}

function addClass(ele, cls) {
	if (!hasClass(ele, cls)) {
		ele.className = ele.className == '' ? cls : ele.className + ' ' + cls;
	}
}

function removeClass(ele, cls) {
	if (hasClass(ele, cls)) {
		var newClass = ' ' + ele.className.replace(/[\t\r\n]/g, '') + ' ';
		while (newClass.indexOf(' ' + cls + ' ') >= 0) {
			newClass = newClass.replace(' ' + cls + ' ', ' ');
		}
		ele.className = newClass.replace(/^\s+|\s+$/g, '');
	}
}
document.querySelector(".login-button").onclick = function() {
	addClass(document.querySelector(".login"), "active")
	setTimeout(function() {
		addClass(document.querySelector(".sk-rotating-plane"), "active")
		document.querySelector(".login").style.display = "none"
	}, 800)
	setTimeout(function() {
		removeClass(document.querySelector(".login"), "active")
		removeClass(document.querySelector(".sk-rotating-plane"), "active")
		document.querySelector(".login").style.display = "block"
			alert("登录成功")

	}, 5000)
}
