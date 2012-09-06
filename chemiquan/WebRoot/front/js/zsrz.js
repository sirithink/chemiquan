//显示书角图标的方法
function showSJOver(id,rname,aname){
	$('#'+id).removeClass(rname);
	$('#'+id).addClass(aname);
	$('#'+id).css('display','block');
}

function showSJOut(id){
	$('#'+id).css('display','none');
}

