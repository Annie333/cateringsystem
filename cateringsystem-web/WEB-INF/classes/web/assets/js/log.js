function fnLogin() {
    var oUname = document.getElementById("uname")
    var oUpass = document.getElementById("upass")
    var isError = true;
    if (oUname.value.length > 10) {
        window.alert("用户名长度不符");
        isError = false;
        return;
    }
    if (oUpass.value.length > 20 || oUpass.value.length < 6) {
        window.alert("密码请输入6-20位字符");
        isError = false;
        return;
    }
    window.alert("登录成功");
    window.location.href='OrderSheet.jsp';
}