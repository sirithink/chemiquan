//------------ajax 异步请求--------------------------
function checkJY(cid,info){
	var cnumber = $('#'+cid).val();
	
	showinfo = info;
	
	var code = "checkNum="+cnumber;
	$.ajax({   
        type:"POST",   
        url:"checkJY_jy.do",
        data:code,
        success:checkJYOrNot
    });
	
}

function checkJYOrNot(data){
	var flag = eval(data.flag);
	
	if(flag){
		
		$('#'+showinfo).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' /></font>");
	}else{
		
		$('#'+showinfo).html("<font color='red'><img src='images/false-icon.jpg' width='15' height='15' />对不起！已经存在了</font>");
	}
}

//------------邮箱校验----------------------
function checkE_mail(eid,sid){
	var evalue = $('#'+eid).val();
	
	if(/^\w+([-+.]\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/.test(evalue)){
		$('#'+sid).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' /></font>");
		//需要比较是否已经存在就调用下面的方法,将上面显示内容注释
		//checkJY(eid,sid);
		return true;
	}else{
		$('#'+sid).html("<font color='red'><img src='images/false-icon.jpg' width='15' height='15' />Email的格式不正确</font>");
		
		return false;
	}
	
}

//-----------密码校验------------------------
function checkPassword(pid,sid){
	var password = $('#'+pid).val();
	if(password == ''){
		$('#'+sid).html("<font color='red'><img src='images/false-icon.jpg' width='15' height='15' /></font>");
		return false;
	}else{
		var result = getResult(password);
		return check(result,sid);  
		//$('#'+sid).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' /></font>");
		//return true;
		
	}
}

function getResult(value) {
	if(value.length < 3) {
		return 0;   
	}
	var i = 0;   
	if(value.match(/[a-z]/ig)) {
		i++;   
	}   
	if(value.match(/[0-9]/ig)) {   
		i++;   
	}   
	if(value.match(/(.[^a-z0-9])/ig)) {   
		i++;   
	}   
	if(value.length < 6 && i > 0) {   
		i--   
	}   
	return i;   
}

function check(num,sid) {   
	if(num == 0) {   
		$('#'+sid).html("<font color='red'><img src='images/false-icon.jpg' width='15' height='15' />请输入大于6位的密码</font>");
		return false;
	} else if (num == 1) {   
		$('#'+sid).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' />密码强度 差</font>");
		return true;
	} else if (num == 2) {   
		$('#'+sid).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' />密码强度 中</font>");
		return true;
	} else if (num == 3) {   
		$('#'+sid).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' />密码强度 强</font>");
		return true;
	} else {   
		$('#'+sid).html("<font color='red'><img src='images/false-icon.jpg' width='15' height='15' />未知错误</font>");
		return false;
	}   
}   


//------------匹配密码是否相同------------------------
function checkTruePassword(tid,sid,pid){
	var turepassword = $('#'+tid).val();
	var password = $('#'+pid).val();
	if(turepassword == password){

		$('#'+sid).html("<font color='green'><img src='images/right-icon.jpg' width='15' height='15' /></font>");
		return true;
	}else{
		$('#'+sid).html("<font color='red'><img src='images/false-icon.jpg' width='15' height='15' />密码不一致</font>");
		return false;
		
	}
}

//------------注册页面提交校验-----------------------
function checkZCSubmit(eid,seid,pid,spid,tpid,stpid){
	var flag1 = checkE_mail(eid,seid);
	var flag2 = checkPassword(pid,spid);
	var flag3 = checkTruePassword(tpid,stpid,pid);
	
	return flag1&&flag2&&flag3;
}